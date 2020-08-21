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
    public String tariff;

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

    public double setTariff(String type) {
        tariff = type;

      //  return type == "Small" ? 19.99 : type == "Medium" ? 37.18 : 52.17;

        // second option with if statements
        if(tariff == "Small") {
            return 19.99;
        } else if (tariff == "Medium") {
            return 37.18;
        }
        return 52.17;

    }

    public boolean isTrain( String weather, int dayOfWeak) {

        switch (weather) {
            case "Rainy":
            case "Snowy":
                return dayOfWeak < 6;

            case "Sunny":
            case "Cloudy":
                return true;

            default:
                return false;

        }

    }

}
