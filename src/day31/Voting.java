package day31;

public class Voting {
    public static void main(String[] args) {

  //  int age=15;

        checkEligibility(15);
        checkEligibility(56);
        checkEligibility(12);
    }

    public static void checkEligibility( int age ){
     //  int age=15;
        if(age>18){
            System.out.println("You are aligible to vote");
        } else{
            System.out.println("You are not eligible!!");
        }
    }


}
