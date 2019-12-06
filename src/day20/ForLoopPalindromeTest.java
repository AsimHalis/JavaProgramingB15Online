package day20;

public class ForLoopPalindromeTest {
    public static void main(String[] args) {
        //if you reverse a string if it does not change
        //it means the string is Palindrome
        //kayak,level, elle,madam,aziza,..
        String name="aziza";
        System.out.println("name = :"+ name);

        String reverseName="";
        for (int x = name.length()-1; x >=0 ; x--) {
            reverseName=reverseName+name.charAt(x);
                    }
        System.out.println("reverseName = "+ reverseName);

        if(name.equalsIgnoreCase(reverseName)){
            System.out.println("Palindrome Test Has Pass");
        }
        else {
            System.out.println("Palindrome Test Has Failed");
        }



    }
}
