package Singleton;

public class SingletonLogger {

    // 클래스 내부의 유일한 인스턴스를 만들기 위해 private static
    private static SingletonLogger instance;

    // 생성자를 private로 선언 -> 외부에서 새로운 인스턴스 생성 금지
    private SingletonLogger(){};

    public static SingletonLogger getInstance() {
        if(instance == null) {  // 아직 객체가 생성되지 않았으면
            synchronized (SingletonLogger.class) {
                if (instance == null) {
                    instance = new SingletonLogger();
                    // 객체가 없으면 생성
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("log: "+message);
    }

}
