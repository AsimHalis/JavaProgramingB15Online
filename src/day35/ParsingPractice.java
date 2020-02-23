package day35;

public class ParsingPractice {
    public static void main(String[] args) {

        String sentence="I bought 3 tomato and the price was 3,14 each";

        String[] eachWorld=sentence.split(" ");
        int count = Integer.parseInt(eachWorld[2]);

        String  priceString=eachWorld[eachWorld.length-2];
        priceString=priceString.replace(",",".");
        double price= Double.parseDouble(priceString);
        System.out.println("Total price is = "+count*price);

    }
}
