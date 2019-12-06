package day05;

public class VariablePractice {
    public static void main(String[] args) {
        //task1:Age calculate
        //given birth year, please calculate the age
        int birthYear=2001;
        int currentYear=2019;
        int age =currentYear-birthYear;
        System.out.println("I was born in year "+birthYear+" , and I am " +age+" years old.");
        //Task 2: you are speeding today
        //speed limit is some number, and your current speed is this
        //generate this output of :You are driving 1-mph more than speed limit
        int speedLimit=70;
        int currentSpeed=90;
        int overTheLimit=currentSpeed-speedLimit;
        System.out.println("Speed Limit is "+speedLimit+ " mph , and your current speed is "+ currentSpeed +" mph");
        System.out.println("You are "+overTheLimit+" mph more than speed limit! ");


    }
}
