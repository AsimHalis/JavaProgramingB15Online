package day45_OOP_Inheritance;

/**
 * /**Inheritance:one of the concepts of OOP!! easiest way to get rich!!
 *
 *  * !!used for building relationships between classes!!
 *  * !!it build super and sub relationships between classes
 *
 *  * !!we use "extends" keyword to build super and sub relationship between classes
 *  *
 *  *      public class   A(dog)      extend      B(Animal)
 *  *                      sub                       super
 *  * sub class(A): it's also called child class! so class can inherit the
 *  *            visible and protected features from the super class!
 *  * super class(B):it's also called parent class,
 *  * super class cannot inherit any feature from the sub class
 *  *
 *  * features that have public or protected access modifiers: can be inherited any where, even outside the package.
 *  * features that have default access modifier:  can only be inherited to the classes that are in the same package with
 *  * features that have private access modifier : can never be inherited
 *
 *   * one class can only extend one class, but one class can be extended by multiple classes
 *     super class can have multiple sub classes
 *
 *      benefit of inheritance :1. reusability
 *                             2. easy to maintain
 *
 */

class TestBase {
    static String chromeDriver="Chorome";

    public static void TakeScreenShot() {
        System.out.println("Took ScreenShoot");
    }

    protected static void clooseBrowser(){
        System.out.println("Browser closed");
    }
    private static void getLink(){
        System.out.println("Went to link");

    }
}


public class Inheritance extends TestBase {
    //sub              //super
    public static void main(String[] args) {
        System.out.println(chromeDriver);
        TakeScreenShot();
        clooseBrowser();
        //getLink();

    }
}
