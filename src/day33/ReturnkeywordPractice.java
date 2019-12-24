package day33;

import org.w3c.dom.ls.LSOutput;

public class ReturnkeywordPractice {
    public static void main(String[] args) {

        System.out.println(ageYearconvert(1965));
        System.out.println(ageYearconvert(1200));
        System.out.println(ageYearconvert(2014));
    }

    public static int ageYearconvert(int birthYear) {
      int age=0;
        if (birthYear <= 1900 || birthYear >= 2020) {
           return 0;
        }

            return  2019 - birthYear;
        }
    }

