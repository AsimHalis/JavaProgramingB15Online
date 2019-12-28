package day34;
// what is return keyword is used
//

// break VS return
// break -->> loop : break out of the loop
//--> switch : break out of the case
// --> can we use it to exit method?? NOO!!!!!!!

// return -->> inside a method
// return the value out of a method with return type
// the moment the return keyword is reached it will terminate the method
// Can it be used in void method ??
// Yes BUT ONLY IN THIS WAY : return ;
// what is the benefit of using in void method
// to terminate the method early
public class ReturnPractice {
    public static void main(String[] args) {


     printMin4CharacterLengtName("jon");
     printMin4CharacterLengtName("Java Shark");

    }
    public  static void printMin4CharacterLengtName(String name){
        //if the name has less than 4 chars, get out  of the method!!

        if(name.length()<4){
            System.out.println("Invalid NAME!!");
            return;//this return is being used to get out of the method early!
        }
        System.out.println(name);
    }
}
