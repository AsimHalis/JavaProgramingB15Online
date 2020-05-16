package day40_OOP_Concept_Inheritance2;

public class Dog extends Animal {

    public Dog(String name, int weight, int height, int legNumber) {
        super(name, weight, height, legNumber);
        this.teetCount=teetCount;
    }

    private int teetCount;

    public int getTeetCount() {
        return teetCount;
    }

    public void setTeetCount(int teetCount) {
        this.teetCount = teetCount;
    }
    public void animalSpeed(int speed) {
        System.out.println("Dog runing " + speed);
        super.animalSpeed(30);
    }



    }
