public class Astronaut {
    String name;
    String date;
    int SerialNum;
    String address;
    String email;
    double weight;
    String kin;
    String number;
    int pay;

    public Astronaut(String name, String date, int SerialNum, String address, String email, double weight, String kin,
            String number, int pay) {
        this.name = name;
        this.date = date;
        this.SerialNum = SerialNum;
        this.address = address;
        this.email = email;
        this.weight = weight;
        this.kin = kin;
        this.number = number;
        this.pay = pay;

    }

    // Getters (Accessor Methods)

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getSerialNum() {
        return SerialNum;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public double getWeight() {
        return weight;
    }

    public String getKin() {
        return kin;
    }

    public String getNumber() {
        return number;
    }

    public int getPay() {
        return pay;
    }

    public void SetDate(String date) {
        this.date = date;
    }

    public void SetSerialNum(int SerialNum) {
        this.SerialNum = SerialNum;
    }

    public void SetAddress(String Address) {
        this.address = Address;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public void SetWeight(double weight) {
        this.weight = weight;
    }

    public void SetKin(String kin) {
        this.kin = kin;
    }

    public void SetNumber(String number) {
        this.number = number;
    }

    public void SetPay(int pay) {
        this.pay = pay;
    }
}
