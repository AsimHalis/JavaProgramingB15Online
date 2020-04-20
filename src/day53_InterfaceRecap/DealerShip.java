package day53_InterfaceRecap;

public class DealerShip {
    public static void main(String[] args) {
        Tesla_Model3 obj1=new Tesla_Model3();
        obj1.charge();
        obj1.fly();
        obj1.start();

        Jeep_Wrangler obj2=new Jeep_Wrangler();
        obj2.PumpGas();
        obj2.SelfParking();
        obj2.start();

        Toyoto_Hybird obj3=new Toyoto_Hybird();
        obj3.charge();
        obj3.fly();
        obj3.start();
        obj3.SelfParking();
        obj3.PumpGas();
        obj3.SelfDrive();




    }
}
