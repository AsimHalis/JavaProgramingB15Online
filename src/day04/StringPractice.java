package day04;

public class StringPractice {
    public static void main(String[] args) {
        String firstName = "Asim Halis";
        String lastName = "Can";
        String fullName= firstName + " "+lastName;// concatenation
        System.out.println("my first name is "+firstName);
        System.out.println("my last name is "+lastName);
        System.out.println(fullName);

        String productName="Amazon Fire";
        String model ="HD";
        int version= 8;
        float price= 79.99f;
        System.out.println(" I saw "+ productName+" "
                + model+version+ " hand-free Alexa for "+ price);

    }
}
