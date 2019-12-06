package day11;

public class StringEquality {
    public static void main(String[] args) {
        String name1 = "Rabia";  // String literal
        String name2 = new String("Rabia");
        String name3 = "Rabia";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("USING == METHODS");
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        //  The correct way of comparing String to get consistent result is
        // using one of the String object behaviour / method called
        // equals method
        //   str1.equals(str2)
        System.out.println("USING EQUALS METHODS");
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));

        // BOTTOM LINE IS : DO NOT EVER USE == TO CHECK STRING EQUALITY

    }
}
