package day21;

public class NameBreaker {
    public static void main(String[] args) {

        String name = "Halis Can";

        for (int x = 0; x < name.length(); x++) {
            System.out.println(name.substring(x, x + 1));
            if (name.charAt(x)=='i') {
                System.out.println("Found it");
                break;
            }
         //   for (int x = 0; x < name.length(); x++) {
          //      if(name.substring(x,x+1).equalsIgnoreCase("i"))
           //         System.out.println("Found IT!!!");
            //    break;
           // }
           // System.out.println(name.charAt(x));

        }
    }
}
