package day16;

public class IndexOfWith2Paremeters {
    public static void main(String[] args) {
        //index:     0123456789012345678901234567890123
        String name="I love Java I Love Java Java Java";
        System.out.println(  name.indexOf("Java"));//7
        System.out.println(  name.indexOf("Java", 7));//7
        System.out.println(  name.indexOf("Java", 8));//19
        System.out.println(  name.indexOf("Java", 19));//19
        System.out.println(  name.indexOf("Java", 20));//24

        int firstJavaLocation=name.indexOf("Java");//7
        int startingPointSearchSecondJava=firstJavaLocation+1;
        int secondJavaLocation=name.indexOf("Java", startingPointSearchSecondJava);
        System.out.println("second Java Location = " +secondJavaLocation);//19

        // I do not know how many word in this sentence . I only know there 3+ words
        // and there is only one space in between words
        // I just want to know what is the second word
        // the word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation + 1);

        System.out.println("Second word in this sentence is "
                + name.substring(firstSpaceLocation + 1, secondSpace));


    }
}
