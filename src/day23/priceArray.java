package day23;

public class priceArray {
    public static void main(String[] args) {
        double[] prices={90.23,30.43,100.45,50.24,40.65};
        for (int x = 0; x <prices.length ; x++) {

            System.out.println("each Price = "+prices[x]);
        }

        for(double blabla : prices){
            System.out.println("Each prices = "+blabla);
        }


    }
}
