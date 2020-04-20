package day53_InterfaceRecap;

public class Toyoto_Hybird implements Cars,ElectricVehicles,GasVehicles {


    @Override
    public void start() {
        System.out.println("Toyota Push the start button");
    }

    @Override
    public void charge() {
        System.out.println("Toyota Charging");
    }

    @Override
    public void SelfDrive() {
        System.out.println("Toyota Self driver mode");
    }

    @Override
    public void fly() {
        System.out.println("Toyota is flying");
    }

    @Override
    public void PumpGas() {
        System.out.println("Toyota pumping gas");
    }

    @Override
    public void SelfParking() {
        System.out.println("Toyota Self parking mode");
    }
}
