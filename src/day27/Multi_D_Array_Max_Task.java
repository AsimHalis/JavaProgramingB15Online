package day27;

public class Multi_D_Array_Max_Task {
    public static void main(String[] args) {
        int[][] nums={{12,11,10,19},{19,20,15}};
        int max=nums[0][0];//asssume that first element is the max
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                if(max<nums[i][j]){
                    max=nums[i][j];
                }
            }

        }
        System.out.println(max);//20
//solution-2
        int max2=nums[0][0];
      //  for (int eachnumArray: nums ){

     //   }





    }
}
