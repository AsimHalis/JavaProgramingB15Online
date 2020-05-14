package day39_Recapp;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i =2; i <400; i++) {
            if(prime(i))
            System.out.println(i);
        }
    }
    public static boolean prime(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

