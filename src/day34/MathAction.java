package day34;
import day31.Calculator;
import java.util.Arrays;

public class MathAction {
    public static void main(String[] args) {
// call build3DigitNumbers method here
        //build3DigitNumbers is under day34
        int result1=PracticeMethodWithNumbers.build3DigitNumbers(6,4,0);
        System.out.println("resuld1= "+ result1);

           //in order to use Arrays class
        //that coming from java.util package(NOT YOUR PACKAGE)
        int [] nums={2,5,78};
        System.out.println("Arrays.toString(nums) = "+ Arrays.toString(nums));
     //How can i call static method called calculate in calculator under day31 package
     //first think first , it's not under current package day34
        //so we ned to import the class --->> import day31.Calculator
        //in order to call static method of Calculator
        //calculator.yourStatic MethodNmae(...)
   Calculator.add3Numbers(12,34,56);
   Calculator.add(34,45);


    }
}