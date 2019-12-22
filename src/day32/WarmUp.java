package day32;

public class WarmUp {
    public static void main(String[] args) {

        converter(35);
        converter(72);
        productPrice(400);
        System.out.println();

    }

    public static void converter(double fahrenheit){

        // double fahrenheit = 78;
        double celsius;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + "F equals to " + celsius + "C.");

    }
    public static void productPrice(float price){
        String productName = "Fire";
        String model = "HD";
        int version = 8;
        // price = 79.99f;
        System.out.println("I saw " + productName + " " + model + version + " hands-free with Alexa for " + price);
    }

}
