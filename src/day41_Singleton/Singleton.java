package day41_Singleton;

public class Singleton {
    /**Sometime we want to make a class that only generate single oblect
     *  throught the entire application.
     *
     *  This is a design pattern called Singleton
     *  -- add private static field with same type as class
     *  -- add private constructor
     *  --add public method with return type same as class type
     */

   private  static Singleton instance;
   public static Singleton getInstance(){
       if (instance==null){
           instance=new Singleton();
       }else {
           System.out.println("We already have this object");
       }
       return instance;
   }
   private Singleton(){
       System.out.println("No ARG CONSTUCTOR BEING CALLED!!");
   }
}
