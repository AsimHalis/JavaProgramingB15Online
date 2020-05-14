package day39_Recapp;

public class OverLoading {

    public static void main(String[] args) {
     sum(2,3,4);
     sum(5,10);
     sum("Halis","Can");
     //return:====
        info("halis","can");
        info(43);
        info("Selmin",11);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a+b+c);

    }
    public static void sum(int a, int b) {
        System.out.println(a+b);

    }
    public static void sum(String a, String b) {
        System.out.println(a+" "+b);

    }
    // return:+++++++++++
    public static String info(String a, String b){
        String name= a+" "+b;
        System.out.println(name);
        return name;
    }
    public static int info(int age){
        System.out.println("Age is ="+age);
        return age;
    }
    public static String info(String a,int age){
        System.out.println(a+"'s Age is = "+age);
        String info=a+age;
        return info;
    }
}