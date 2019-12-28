package day34;

public class LoginActivity {
    public static void main(String[] args) {
         loginvoid ("my username", "abc123");
         loginvoid("user","abc123");

        boolean result=loginreturn("user" , "abc123") ;
        System.out.println("result = " + result);
        boolean result2=loginreturn("aaaa","bbb");
        System.out.println("result2 = " + result2);

    }

    public static void loginvoid(String user, String password) {
      if(user.equals("user")&& password.equals("abc123"))  {
          System.out.println("LOG IN SUCCESSFULL");
      }
        else{
          System.out.println("LOG IN FAILED");
        }
    }

    public static boolean loginreturn(String user, String password) {
        return user.equals("user") && password.equals("abc123");
    }


}
