package day14;

public class StringReview {
    public static void main(String[] args) {
     String str="I like Pumpkin";
        System.out.println(str.equals("pumpkin"));
        //contain:
        //it checks whether a string exists in another string
        //and return true or false
        System.out.println("Does it contain Pumpkin");
        System.out.println(str.contains("Pumpkin"));//true
boolean gotPumkin=str.contains("Pumpkin");
        System.out.println("gotPumkin = " + gotPumkin);
        //startsWith endsWith
        // check whether a string start with another string 
        // check whether a string end with another string 
        // and return true or false result 
        boolean startedWithI= str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);
        boolean endWithPumpkin=str.endsWith("kin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);



    }

}
