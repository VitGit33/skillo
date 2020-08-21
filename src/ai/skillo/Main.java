package ai.skillo;

public class Main {

    public static void main(String[] args) {

        IPhone phone = new IPhone();
        System.out.println("Model is: " + phone.model);
        System.out.println("Color is: " + phone.color);
        System.out.println("Size is: " + phone.size);
        System.out.println("Weight is: " + phone.weight);
        System.out.println("Year is: " + phone.year);
        System.out.println("Capacity is: " + phone.capacity + " GB");
        System.out.println();

        phone.call("Whats up bro, are you going to run tomorrow morning?");

        System.out.println(phone.setTariff("Medium"));
        System.out.println(phone.tariff == "Medium");
        System.out.println();

        System.out.println(phone.isTrain("Tornado", 1));
        System.out.println(phone.isTrain("Sunny", 1));
        System.out.println(phone.isTrain("Rainy", 1));


    }

}
