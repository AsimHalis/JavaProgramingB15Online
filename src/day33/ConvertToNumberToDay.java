package day33;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertToNumberToDay {
    public static void main(String[] args) {
        System.out.println(getDayToWeekDay(6));
        System.out.println(getDayToWeekDay(9));
        System.out.println(getWeekDay(5));

        int []allCodes={5,3,11,4,33};
        for (int x = 0; x <allCodes.length ; x++) {
            String day=getDayToWeekDay(allCodes[x]);
            System.out.println("day = "+day);
        }
        System.out.println("------------");
        for (int eachCode: allCodes   ) {
            System.out.println("eaccode = "+getDayToWeekDay(eachCode));
        }

    }

    public static String getDayToWeekDay(int dayCode) {
        String day = "";
        switch (dayCode) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Funday";
        }
        return day;
    }


        public static String getWeekDay( int dayCode2){

        String dayName = "";
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < weekDays.length; i++) {
            if ((i + 1) == dayCode2) {
                dayName = weekDays[i];
            }
        }
        return dayName;
    }
    }
