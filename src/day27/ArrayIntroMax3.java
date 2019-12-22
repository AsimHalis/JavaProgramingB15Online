package day27;

public class ArrayIntroMax3 {
    public static void main(String[] args) {
        int [] nums={100,1000,90,234,6789};
    int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(max<nums[i]){
         max=nums[i];
            }
        }
        System.out.println("firsd max number ="+max);



    }
}
