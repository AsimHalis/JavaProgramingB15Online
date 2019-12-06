package Assignments;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String Split=scan.next();

        if (Split.equals("Yes")){
            System.out.println("Number of people:");

            int people=scan.nextInt();

            System.out.println("Check amount:");
            double amount=scan.nextDouble();
            System.out.println("Service Quality:");
            String ServiceQ=scan.next();

            if (ServiceQ.equals("Poor")){
                System.out.print("Number of people entered: ");
                int i=1;
                while (i<=people){
                    System.out.print("&");
                    i++;
                }
                System.out.println();
                System.out.println("Number of people entered: "+i);
                System.out.println("Total to pay: "+(amount+amount*5/100));
                System.out.println("Total tip: "+amount*5/100);
                System.out.println("Total per person: "+(amount+amount*5/100)/people);
                System.out.println("Tip per person: "+(amount*5/100)/people);
            }
            if (ServiceQ.equals("Fair")){
                System.out.print("Number of people entered: ");
                int i=1;
                while (i<=people){
                    System.out.print("&");
                    i++;
                }
                System.out.println();
                System.out.println("Number of people entered: "+i);
                System.out.println("Total to pay: "+(amount+amount*10/100));
                System.out.println("Total tip: "+amount*10/100);
                System.out.println("Total per person: "+(amount+amount*10/100)/people);
                System.out.println("Tip per person: "+(amount*10/100)/people);
            }
            if (ServiceQ.equals("Good")){
                System.out.print("Number of people entered: ");
                int i=1;
                while (i<=people){
                    System.out.print("&");
                    i++;
                }
                System.out.println();
                System.out.println("Number of people entered: "+i);
                System.out.println("Total to pay: "+(amount+amount*15/100));
                System.out.println("Total tip: "+amount*15/100);
                System.out.println("Total per person: "+(amount+(amount*15/100)/people));
                System.out.println("Tip per person: "+(amount*15/100)/people);
            }
            if (ServiceQ.equals("Great")){
                System.out.print("Number of people entered: ");
                int i=1;
                while (i<=people){
                    System.out.print("&");
                    i++;
                }
                System.out.println();
                System.out.println("Number of people entered: "+i);
                System.out.println("Total to pay: "+(amount+amount*20/100));
                System.out.println("Total tip: "+amount*20/100);
                System.out.println("Total per person: "+(amount+amount*20/100)/people);
                System.out.println("Tip per person: "+(amount*20/100)/people);
            }
            if (ServiceQ.equals("Excellent")){

                System.out.print("Number of people entered: ");
                int i=1;
                while (i<=people){
                    System.out.print("&");
                    i++;
                }
                System.out.println();
                System.out.println("Total to pay: "+(amount+amount*25/100));
                System.out.println("Total tip: "+amount*25/100);
                System.out.println("Total per person: "+(amount+amount*25/100)/people);
                System.out.println("Tip per person: "+(amount*25/100)/people);
            }
        }

    }





}
