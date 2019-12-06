package day06;

public class UsingTheVariable {
    public static void main(String[] args) {
        int myFavoriteNumber=300;
        int yourFavoriteNumber=myFavoriteNumber;
        System.out.println(" My Favorite Number "+ myFavoriteNumber);
        System.out.println("Your Favorite Number "+yourFavoriteNumber);

        yourFavoriteNumber=100;
        System.out.println(" My Favorite Number "+ myFavoriteNumber);
        System.out.println("Your Favorite Number "+yourFavoriteNumber);

        String yourOrder="Veggie pizza";
        String myOrder=yourOrder;
        System.out.println("My Order is "+ myOrder);
        System.out.println("Your Order is "+ yourOrder);
           myOrder="cheese pizza";
        System.out.println("My Order is "+ myOrder);
        System.out.println("Your Order is "+ yourOrder);

        System.out.println("Your order is " + yourOrder + "\n" +
                "My order is " + myOrder);


    }
}
