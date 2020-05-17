package day40_OOP_Override_Inheritance3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("welcome to Employee program...");
        String options1 = "options...\n" + "1.Developper \n" + "2.Manager \n" + "q : for Exit the system...";
        System.out.println("*******************");
        System.out.println(options1);
        System.out.println("*******************");

        while (true) {
            System.out.println("Chose the Option");
            String option = scn.nextLine();

            if (option.equals("q")) {
                System.out.println("You are exiting the system...");
                return;
            } else if (option.equals("1")) {
                Developer developer = new Developer("Halis", "Can", 123, "Java");

                String dev_Options1 = "1.Format\n" + "2.info\n" + "q: exit the options";
                System.out.println("*******************");
                System.out.println(dev_Options1);
                System.out.println("*******************");
                while (true) {
                    System.out.println("please chose the options");
                    String dev_Options = scn.next();
                    if (dev_Options.equals("q")) {
                        System.out.println("Exiting the Developer options...");
                        break;
                    } else if (dev_Options.equals("1")) {
                        System.out.println("Enter the operation system(OS) name?");
                        String OS = scn.next();
                        developer.getFormat(OS);

                    } else if (dev_Options.equals("2")) {
                        developer.showInfo();
                    } else {
                        System.out.println("invalid option");
                    }
                }
            } else if (option.equals("2")) {
                Manager manager = new Manager("Ozde", "Can", 456, 15);
                String manag_Option1 = "Manager Options\n" + "1.Make contribution\n" + "2.showInfo\n" + "q: exit the options";
                System.out.println("*******************");
                System.out.println(manag_Option1);
                System.out.println("*******************");
                while (true) {
                    System.out.println("please chose the options");
                    String manag_Option = scn.next();
                    if (manag_Option.equals("q")) {
                        System.out.println("Exiting the Manager Options...");
                        break;
                    } else if (manag_Option.equals("1")) {
                        System.out.println("Input Manager Contrribution value");
                        int value = scn.nextInt();
                        manager.contribution(value);

                    } else if (manag_Option.equals("2")) {
                        manager.showInfo();
                    } else {
                        System.out.println("invalid option");
                    }
                }

            }
            }


        }
    }

