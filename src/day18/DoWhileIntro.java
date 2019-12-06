package day18;

public class DoWhileIntro {
    public static void main(String[] args) {
        //{} curly braces, () parenthesis, ; semi colom, [] square bracket
        // : colon, % remainder operator, ! exclamation mark
        // | pipe, & Ampersand, / forward slash
        //\ back slash, " double quote, ' single quote

        // do{
       // take some action and repeat
   // }while(some condition is true);
        int x=1;
        do{
            System.out.println(x);
            ++x;
        }while(x<=5);//semi colon is mandatory!!
        System.out.println("-----------");
        //count 5 to 1
int y=5;
do{
    System.out.println(y);
    --y;
}while(y>=1);
    }
}
