package StudentHw;

//문제 1: 학생 클래스 만들기
//문제 설명:
//학생의 이름, 학번, 세 과목의 점수를 저장하는 Student 클래스를 생성하세요.
//각 변수에 대한 private 접근 제한자를 사용하여 정보를 보호하고, getter와 setter 메소드를 통해 값을 조회하고 변경하도록 하세요.
//생성자를 이용하여 학생 정보를 초기화하고, 평균 점수를 계산하는 메소드를 추가하세요.
    public class Student {
        private String name;
        private int number;
        private int kor;
        private int math;
        private int eng;

        Student(){};
        Student(String name, int number, int kor, int math, int eng){
            this.name=name;
            this.number=number;
            this.kor=kor;
            this.math=math;
            this.eng=eng;
        };

        public String getName(){
            return name;
        }
        public String setName(String name){
            return this.name=name;
        }
        public int getNumber(){
            return number;
        }
        public int setNumber(int number){
            return this.number=number;
        }
        public int getKor(){
            return kor;
        }
        public int setKor(int kor){
            return this.kor;
        }
        public int getMath(){
            return kor;
        }
        public int setMath(int math){
            return this.math;
        }
        public int getEng(){
            return eng;
        }
        public int setEng(int eng){
            return this.eng;
        }

        public double getAvg(){
            return (kor+math+eng)/3;
        }

    }


