package Resturant;

public class ReservationDTO {

    private String name;
    private double phoneNum;
    private String time;
    private boolean available;

    public ReservationDTO(String name, double phoneNum, String time) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.time = time;
        this.available = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(double phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return
                "예약자명: " + name +
                "전화번호: " + phoneNum  +
                "예약시간:" + time +
                "예약확정여부" + (available ? "O" : "X");
    }


}
