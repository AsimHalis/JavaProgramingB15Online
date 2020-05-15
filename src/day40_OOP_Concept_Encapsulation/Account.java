package day40_OOP_Concept_Encapsulation;

public class Account {
    private String username;
    private String password;
    private int balance;

    public Account(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
         }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    //======== I will add 2 more method=======

    public void makePayment(int payment){
            balance+=payment;
        System.out.println("New Balance :" +balance);
    }
    public void witDraw(int payment){
       if ((balance-payment)<0){
           System.out.println("there is not enough balance");
           System.out.println("New Balance :" +balance);
       }else{
           balance-=payment;
           System.out.println("New Balance :" +balance);
       }
    }


}
