package day32;

public class STringActions {
    public static void main(String[] args) {

        reverseMyName();
       //String name = "AsimHalis";
  printStringWithDash("Furkan Selim");
  printStringWithDash("Asaf Eren");
  printStringWithDash("Selmin Deniz"  );

    }
    public static void printStringWithDash(String name){
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
            if (i!= name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void reverseMyName() {
        String name = "AsimHalis";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
            if (i!= name.length()) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}