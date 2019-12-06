package day06;

public class CompountOperator2 {
    public static void main(String[] args) {
        //+=,-=,*=,/=,%=, are called shorthand operator, compound operator
        //on both side of the assignment
        int studentOnline=263;
        //studentOnline=studentOnline+5;
        studentOnline +=5;
        System.out.println("5 peaple joined the class " + studentOnline);
        //studentOnline=studentOnline-3;
        studentOnline -=3;
        System.out.println("3 peaple left the class " + studentOnline);
       // studentOnline=studentOnline*2;
        studentOnline *=2;
        System.out.println("The student count double " + studentOnline);
        //studentOnline=studentOnline/3;
        studentOnline /=3;
        System.out.println("the student dropped to 1/3 : "+ studentOnline);

    }
}
