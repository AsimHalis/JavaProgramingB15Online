package day03;

public class primitivesPractice {
    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter count is "+ letterCount );
        short sheepCount = 300;
        System.out.println("The Sheep count is "+ sheepCount );
        int catCount = 20 ;
        System.out.println("The cat count is "+ catCount );
        long mileToMoon = 5000000l;
        System.out.println("The mile to Moon is "+ mileToMoon );
        long mileToSun  = 100000000L;
        System.out.println("The mile To Sun is "+ mileToSun );
        //--------------floating point ---------
        // you must add f at the end of number to indicate this is float data type
        // uppercase lowercase does not matter , but it's mandatory
        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is "+ priceOfBanana );
        float priceOfPotato = 2.49F;
        System.out.println("The price of Potato is "+ priceOfPotato );

        //-----------  larger floating point numbers -------
        double priceOfIpad1     = 355.99d ;
        System.out.println("The price Of Ipad1 is "+ priceOfIpad1);
        double priceOfIpadPro   = 1024.99D ;
        System.out.println("The price of Ipadpro is "+ priceOfIpadPro );
        // compiler automatically assume it's a double so it's not required to have d
        // However for good programming habbit , add them always
        double priceOfMac       = 2299.99 ;
        System.out.println("The price of Mac is "+ priceOfMac );
        // If you have a whole number by itself , compiler automatically assume it's an int
        // If you have a fractional number by itself , compiler automatically assume it's an double

    }
}
