package day35;

public class CharacterPracticeSum {
    public static void main(String[] args) {

        String str="A34B123C5X";
        //Get the number out of this String and sum it up;
       char[] allChar=str.toCharArray();
       int sum=0;
       for (char each : allChar){
           if (Character.isDigit(each)){
               System.out.println("each = " + each);
              int eachNum=Integer.parseInt(each+"");
              sum+=eachNum;
           }
       }
        System.out.println("sum : "+sum);//sum : 18
       
       
       
    }
} 
