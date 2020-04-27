package day57_Exceptions;
// Exceptions: Unwanted or Unexpected event!!!
    /** There are two type of exceptions:
     * unchecked exception:(unexpected) Exceptions that occurs during runtime!
     *      Ex: int[] arr={1,2,3}, sout(arr[20]);
     *
     *    Selenium Ex:No such Element exceptions,
     *               nullpointer exception
     *               WebDriverException;
     *
     *      WebDriver driver=new FireFoxDriver();-->IF OU DONT HAVE FIREFOX
     *                    driver/get("URL");
     *RuntimeException class is the parent class of the all the unchecked exceptions
     *All the RuntimeExceptions are unchecked exception
     *
     * checked exception:(unwanted) occurs during the compile time.
     * Those exceptions need to be handled IMMEDIATELY! Exceptions that happens during complile time
     * Because it will give compile error
     *                Ex: Thread.sleep(1000);
     *
     *      Exception Handling1:
     *      1.try&catch (block):
     *      used for handling the exception
     *            try{
     *                exception statements/code}
     *            catch(ExceptionClass name){
     *                               statements}
     *      only one of those blocks gets executed
     *      try block: only gets executed if the exception is checked exception
     *      catch block: only gets executed if the exception is unchecked (Runtime Exception)
     */
public class Exceptions_Handling_Class {
        public static void main(String[] args) {
            try{
                System.out.println(9/0);//==>uncheck exception
                System.out.println("try block");
            }catch (Exception e){
                System.out.println("catch block");
                    }finally {//==>finaly block MUST be declared with try&catch block
                System.out.println("finally block");
            }
            System.out.println("=====================");
            try{
                Thread.sleep(2000);//===>check exception
                System.out.println("try block");
            }catch (Exception e){
                System.out.println("catch block");
            }finally {
                System.out.println("finally block");
            }




        }

}
