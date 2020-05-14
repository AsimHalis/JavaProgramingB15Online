package AAA_InterviewQuestion;

public class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            if (checkPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean checkPrime(int number){
        for (int i = 2; i <number ; i++) {
             if (number%i==0){
                 return false;
             }
        }return true;
    }

//=====2. way ????======
public static boolean checkPrime2(int number){

    if(number<=1){
        return false;}

    for (int i = 2; i <Math.sqrt(number) ; i++) {
        if (number%i==0){
            return false;
        }
    }return true;
}
}