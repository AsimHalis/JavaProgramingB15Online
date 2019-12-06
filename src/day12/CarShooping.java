package day12;

public class CarShooping {
    public static void main(String[] args) {
        String carBrand="Tesla";
        int carPrice=30000;
        int budget=40000;
        if((carBrand.equals("corolla")||carBrand.equals("Tesla"))&&carPrice<=budget){// true||false&&false==>true
            System.out.println("CAR AQUIRED");
        }
        else {
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }


    }
}
