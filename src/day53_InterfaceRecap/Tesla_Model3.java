package day53_InterfaceRecap;

public class Tesla_Model3 implements Cars,ElectricVehicles {
    public void start(){
        System.out.println("Voice Control\" Tesla start\" ");
    }
    public void charge(){
        System.out.println("Tesla Charging");
    }
    public  void SelfDrive(){
        System.out.println("Tesla Self driving mode");
    }

    @Override
    public void fly() {
        System.out.println("Tesla is flying later");
    }
}
