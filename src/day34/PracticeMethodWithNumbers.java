package day34;

public class PracticeMethodWithNumbers {
    public static void main(String[] args) {
    //for example 376:--->digit1 is 3,digit2 is 7, digit3 is 6,
       // int digit1 , digit2 , digit3 ;
     //  digit1=3;
      //  digit2=7;
      //  digit3=6;
      //  int number=digit1*100+digit2*10+digit3;
     //   System.out.println(" number = "+number);
        build3DigitNumbers(2,5,7);//??? cant print!!
        System.out.println(build3DigitNumbers(5,3,7));//537
        System.out.println(build3DigitNumbers(12,4,67));//40
        System.out.println(build3DigitNumbers(9,3,8));//938
        System.out.println(build3DigitNumbers(11,34,87));//0

    }
    //1, write a method called build3DigitNumber
   // it has 3 int parameters digit1 digit2 digit3
  //  and it will return the 3 digit numbers you have build
  // if any of digit1 digit2 digit3 is not within the range of 0-9 the change it to 0 ,
   //         for example :
   // build3DigitNumber(4,2,4) --->> 424
   // build3DigitNumber(0,2,1) --->> 21
   // build3DigitNumber(65,6,9) --->> 69


public static int build3DigitNumbers(int digit1, int digit2, int digit3){
        if(digit1<0||digit1>9){
            digit1=0;
        }
    if(digit2<0||digit2>9){
        digit2=0;
    }
    if(digit3<0||digit3>9){
        digit3=0;
    }
    int number=digit1*100+digit2*10+digit3;
    return number;
}

}
