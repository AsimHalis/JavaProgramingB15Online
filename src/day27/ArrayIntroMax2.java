package day27;

public class ArrayIntroMax2 {
    public static void main(String[] args) {
        int[] scores={100,34,56,80,23,7,8,34,12,90};
  int min=scores[0];
  for(int i=0 ; i<scores.length; i++){
      if(min>scores[i]){
          min=scores[i];
      }
        }
        System.out.println("Minimum Number = " +min);
        int secondMin=scores[0];
        for(int i=0 ; i<scores.length; i++){
            if(scores[i]==min){
                continue;
            }
            if(secondMin>scores[i]){
                secondMin=scores[i];
            }
        }
        System.out.println("Second minimum Number = " +secondMin);

        int tridMin=scores[0];
        for(int i=0 ; i<scores.length; i++){
            if(scores[i]==min||scores[i]==secondMin){
                continue;
            }
            if(tridMin>scores[i]){
                tridMin=scores[i];
            }
        }
        System.out.println("Third minimum Number = " +tridMin);




    }
}
