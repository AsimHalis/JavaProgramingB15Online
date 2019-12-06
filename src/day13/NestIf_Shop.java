package day13;

public class NestIf_Shop {
    public static void main(String[] args) {

        boolean youWantToShop=true;
        String preference="Store";

        if(youWantToShop==true){
           if(preference.equals("Store")){
               System.out.println("Going to store for shopping");
           }
           else {
               System.out.println("Going to online for shopping");
           }
        }
else {
            System.out.println("Good Job stay home coding!!!");
        }

    }


}
