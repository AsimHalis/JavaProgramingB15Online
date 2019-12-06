package day15;

public class StringCaseInsenstiveCheck {
    public static void main(String[] args) {
        String name = "Halis Can";

        System.out.println("Name contains ca RESULT IS :   " + name.contains("ca"));

        // I wanna check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase(); // "HALIS CAN";
        System.out.println("uppercaseName contains CA or not ? " + uppercaseName.contains("CA"));

        String lowercaseName = name.toLowerCase(); //"halis can";
        System.out.println("lowercaseName contains ca or not ? " + lowercaseName.contains("ca"));

        // This is called method chaining , combining multiple method call
        // make my name all lowercase (String) then check whether it contains lowercase ca
        // THIS WORK BECAUSE name.toLowerCase() result in another String object
        System.out.println(name.toLowerCase().contains("ca")); // THIS WORK BECAUSE,name.toLowerCase()==>String,and contain is work!!
        //System.out.println( name.length().toUppercase()  ); //BAD IDEA!!!THIS NOT WORK BECAUSE name.length()==>int so toUppercase not work!!

    }
}
