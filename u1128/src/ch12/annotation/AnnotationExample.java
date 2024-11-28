package ch12.annotation;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws Exception{
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for(Method method: declaredMethods){
            // PrintAnnotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            // 설정 정보를 이용해서 선 출력
            printLine(printAnnotation);

            // 메소드 호출
            method.invoke(new Service());

            printLine(printAnnotation);

        }
    }

    // @PrintAnnotation 속성 값 (value,number)에 따라 선 출력하는 메소드
    // 예) @PrintAnnotation(value="#",number=20) 이면 # 20개 출력
    public static void printLine(PrintAnnotation printAnnotation){
        if(printAnnotation !=null){
            // number 속성 값 얻기
            int number = printAnnotation.number();
            for(int i=0; i<number; i++){
                // value 속성 값 얻기
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
