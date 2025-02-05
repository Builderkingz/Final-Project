public class Astronauts {
        String name ;
        String date ;
        int SerialNum;
        String address;
        String email;
        double weight;
        String kin;
        String number;
        double pay;
    public static void main(String[] args) {
        

        



    }
    public Astronauts(String name,String date, int SerialNum, String address,String email, double weight,String kin,String number, double pay){
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
    public String getName(){
        return name;
    }public String getDate(){
        return date;
    }public int getSerialNum(){
        return SerialNum;
    }public String getAddress(){
        return address;
    }public String getEmail(){
        return email;
    }public double getWeight(){
        return weight;
    }public String getKin(){
        return kin;
    }public String getNumber(){
        return number;
    }public double getPay(){
        return pay;
    }
}
