package day22;

public class CanvasModuleLink1 {
    public static void main(String[] args) {
        String baseURL = "https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg = "This will lead you to day ";


//        for (int moduleNumber = 3317; moduleNumber <=3317+35 ; moduleNumber++) {
//            System.out.println(moduleNumber);
//        }
        for (int day = 1; day <= 22; day++) {

            System.out.println(dayMsg + day);
            //  if day is 21 the number is 3317 according to requirement
            //  if day is 22 the number is 3318 according to requirement

            System.out.println(baseURL + (3317 - 21 + day));

        }

    }
}