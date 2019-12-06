package day05;
import java.util.Scanner;
public class TemperatureConverture {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is temperature in F ?");
        double fahrenheit=input.nextDouble();
        double celsius= (5.0/9)*(fahrenheit-32);
        System.out.println(fahrenheit+"F Fahrenheit "+"="+ celsius+"C Celsius");

    }
}
