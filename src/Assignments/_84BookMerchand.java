package Assignments;
import java.util.Scanner;
public class _84BookMerchand {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        if (isPremiumCustomer) {
            if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
                System.out.println("1");
            } else if (nbooksPurchased >= 8) {
                System.out.println("2");
            }
            else{
                System.out.println("0");
            }
        }
           else  {
                if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
                    System.out.println("1");}
                    else if (nbooksPurchased >= 12) {
                        System.out.println("2");
                    }
                    else {
                    System.out.println("0");
                }
                }

            }
        }


