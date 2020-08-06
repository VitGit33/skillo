package ai.skillo;

public class IPhone {

     String model;
     String color;
     String size;
     double weight;
     int year;
     int capacity;
    private int password;
    private String idNumber;



    IPhone() {
        model = "X";
        color = "Silver";
        size = "5.65H, 2.79W, 0.30D";
        weight = 6.14;
        year = 2019;
        capacity = 256;
        password = 8888;
        idNumber = "12N56GK567";




    }
    String call(String talk) {
        System.out.println(talk);
        return talk;
    }

}
