package day11;

public class LogikalOperators {
    public static void main(String[] args) {
        System.out.println("TRUTH TABLE &&");
        System.out.println(true&&true);//true
        System.out.println(true&&false);//false
        System.out.println(false&&true);//false
        System.out.println(false&&false);//false

        System.out.println("TRUTH TABLE ||");
        System.out.println(true||true);//true
        System.out.println(true||false);//true
        System.out.println(false||true);//true
        System.out.println(false||false);//false
        System.out.println("==========================");
        int num=20;
                System.out.println(num>100||num<10);//==>false
                System.out.println(num>10||num<40);//==>true
        System.out.println(true||false||true);//==>true
        // more than 2 conditions at the same time ,  3 conditions
        //true || false --->> true
        System.out.println("result of true || false || false  ");
        System.out.println(true || false || false);//true

        System.out.println("result of true && true && false   ");
        //   true  && false  ----->> false
        System.out.println(true && true && false);//false
        // false || false ->false || true -->> true

        System.out.println("running this -->>> num==50  || num==51   ||  num==55   ");
        System.out.println(num == 50 || num == 51 || num == 55);

        // == is checking for equality , != is checking for inequality

        System.out.println("running this -->>> num>50 && num != 52  || num==57   ");
        // check
        // x is more than 50
        // and x is not equal to 52
        // or  x equal to 57
        // true && true
        //true || false --->> true
        System.out.println(num > 50 && num != 52 || num == 57);

        System.out.println(false || true && true);
        // && is called short circuit AND
        // -->> it does not check the next condition as long as the first condition is false
        // -->> just like if you have multiple condition for rocket launching
        //   isEngineRunning  , isCommunicationSystemWorking , isAirEnough

        // isEngineRunning  && isCommunicationSystemWorking &&  isAirEnough
        // if isEngineRunning is false then it does not go and check next conditions

        // &  -->> CHECK EACH AND every condition no matter what

        // isEngineRunning  & isCommunicationSystemWorking &  isAirEnough
        // if isEngineRunning is false
        // it still check isCommunicationSystemWorking
        // it still check isAirEnough
        // and eventually give you the outcome

        System.out.println("************1111111*******************");
        System.out.println( 7>5  &&  1>7 );
       System.out.println( 4>5  &&  8>7 );
       System.out.println( 1>5  &&  3>7 );
        System.out.println("************2222222*******************");
       System.out.println( 7>5  &  1>7 );
       System.out.println( 4>5  &  8>7 );
        System.out.println( 1>5  &  3>7 );
        System.out.println("***********3333********");
        //System.out.println(  9/0 ); // ERROR!! CAN NOT DIVIDE BY 0
        // I want to check whether dividing 9 by 0 is 3
        System.out.println(9> 10 && 9 / 0 == 3);
        System.out.println("**********4444444******");
        System.out.println(5 > 10 & 9 / 0 == 3);
    }
}
