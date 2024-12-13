package Lotto;

public class Main {
    public static void main(String[] args) {
        Membership m = new Membership();

        // 회원가입
        m.membershipGuide();

        // 로또 구매
        Purchase p = new Purchase();
        p.purchaseQuestion(m);

        // ㄷㅐ기
        Loading l = new Loading();
        l.loading();

        // 로또 번호 추첨
        Lottery lt = new Lottery();

        // 로또 번호 생성
        lt.randomLotteryNum();

        // 당첨된 로또 번호 출력
        lt.lotteryNum();

        // 당첨 결과 출력
        lt.result(m,p);  // 가입된 회원 객체와 로또 구매 객체를 매개변수로 result 메서드에 실어 보냄
    }
}
