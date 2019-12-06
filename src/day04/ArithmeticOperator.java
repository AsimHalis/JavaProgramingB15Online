package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        System.out.println(5+6);//11
        System.out.println(5-2);//3
        System.out.println(5*4);//20
        System.out.println(5/3);//1

        System.out.println(5+6.0d);//11.0
        System.out.println(5-2.0d);//3.0
        System.out.println(5*4.0d);//20.0
        System.out.println(5/3.0d);//1.666666666667

        System.out.println(5/3.0f);//1.666666
        //store above number in variables
        //and replace above statement with variable instead

        int result1= 5+6;
        int result2= 5+2;
        int result3= 5*4;
        double result4= 5/3d;
        System.out.println(result1+"\n"+result2+"\n"+result3+"\n"+result4);

        //Akbar code note
        System.out.println("**************************");
        int num1 = 5 ;
        double num2 = 3.0d ;
        float num3 = 3.0f ;
        double result6 = num1 + num2;
        double result7 = num1 - num2;
        double result8 = num1 * num2;
        double result9 = num1 / num2;
        float result10 =  num1 / num3;
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);
    }
}
