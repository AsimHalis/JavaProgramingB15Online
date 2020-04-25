package day55_56UpCasting;

class Animal{

}
class Dog extends Animal{
   // Dog IS Animal
}

public class UpCasting {
    //Upcasting: casting subclass to superior type
    Dog obj=new Dog();
    Animal obj2=(Animal) obj;

}
                            /**
                             *   Remotedriver(class) implements WebDriver(interface), JavaScritptExecuter,TakeScreenShoot
                             *   ChromeDriver(class) extends RemoreDriver(class)
                             *
                             *   **** Multiple reference name refer to the same object(same memory)
                             *
                             * There is TWO type of castings between class
                             *   1. UpCasting: Always Allows
                             *      in selenium perspective...
                             *   WebDriver driver=new ChromeDriver();
                             *   JavaScritptExecuter js=new ChromeDriver();==>aftercastinf we dont need this line
                             *   JavaScritptExecuter js=(JavaScritptExecuter)driver;
                             *   js.ExecuteScript("windows.open()")
                             *   TakeScreenShoot ts= (TakeScreenShoot) driver;
                             *
                             *
                             *   2.DownCasting:not allowed


                             */