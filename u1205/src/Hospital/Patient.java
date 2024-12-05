package Hospital;

public class Patient {
    private String name;
    private String phone;
    private String address;
    private String disease;
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient(String name, String phone, String address, String disease, String time) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.disease = disease;
        this.time = time;
    }

    @Override
    public String toString() {
        return "환자명: " + name  +
                "  연락처: " + phone  +
                "  주소: " + address +
                "  병명: " + disease  +
                "  시간: " + time ;
    }
}
