package day53_InterfaceRecap;

public class Jeep_Wrangler implements Cars,GasVehicles {
    @Override
    public void start() {
        System.out.println("jeep Call Mechanic");
        System.out.println("jeep oil change");
        System.out.println("jeep jump start");
    }

    @Override
    public void PumpGas() {
        System.out.println("jeep Pumping Gas");
    }

    @Override
    public void SelfParking() {
        System.out.println("jeep Self parking mode");
    }
}
