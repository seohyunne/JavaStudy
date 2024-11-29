package AccommondationReserve;

// 숙소 클래스
public class Accommodation {
    private String name;
    private String location;
    private double pricePerNight;
    private boolean available;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Accommodation(){};

    public Accommodation(String name, String location, double pricePerNight) {
        this.name = name;
        this.location=location;
        this.pricePerNight=pricePerNight;
        this.available=true;
    }

    public void book(){
        // 예약하면 available false로 변경
        this.available=false;
    }

    @Override
    public String toString() {
        return
                "숙소 이름= " + name + '\'' +
                ", 위치= " + location + '\'' +
                ", 1박당 가격= " + pricePerNight +
                ", 예약 여부= "  + (available ? "예약가능" : "에약불가능")+
                '}';
    }
}
