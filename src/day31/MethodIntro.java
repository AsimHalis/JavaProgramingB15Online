package day31;

public class MethodIntro {

    public static void main(String[] args) {
        //  two way to call static method!!!!
   MethodIntro.sayHello();//1-ClassName.methodName(External Data if needed)
        System.out.println("----Second way------");
   sayHello();//2-methodName(external data if needed)if you are in same class you can directly called them!!
        System.out.println("----The End----");
    }// main method ends here!!
    //Do not create a method inside main method!!
        public static void sayHello() {

            System.out.println("Hello World");
            System.out.println("My name is Furkan Selim");
            System.out.println("I love Java");
// 1:30.....
        }
  }
