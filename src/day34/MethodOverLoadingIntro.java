package day34;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        System.out.println("Method overloading");//Method overloading
        System.out.println(12);//12
        //two version of subString method
        //           01234567890
        String name="Overloading";
        System.out.println(name.substring(6));//ading
        System.out.println(name.substring(2,6));//erlo
        //two version of indexof method
        System.out.println(name.indexOf("di"));//7
        System.out.println(name.indexOf("o",2));//5

        System.out.println("---------------");

        sayHello();
        sayHello("halis");
        sayHello("deniz");
        sayHello(100);
        System.out.println(sayHello("Asim", "Halis"));
    }

public static void sayHello(){
    System.out.println("Hello,WORLD");
}
public static void sayHello(String name){
    System.out.println("HELLO "+name);
}
public static void sayHello(int num){
    System.out.println("hello "+ num);
}
public static String sayHello(String firstName,String lastName){
        return "Hello "+firstName+" "+lastName;

}

}
