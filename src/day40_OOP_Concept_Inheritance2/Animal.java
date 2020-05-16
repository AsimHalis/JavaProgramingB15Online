package day40_OOP_Concept_Inheritance2;

public class Animal {
    private String  name;
    private int weight;
    private int height;
    private int lengNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLengNumber() {
        return lengNumber;
    }

    public void setLengNumber(int lengNumber) {
        this.lengNumber = lengNumber;
    }

    public Animal(String name, int weight, int height, int lengNumber) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.lengNumber = lengNumber;
    }
  public void info(){
      System.out.println("info :"+name+" "+weight+" "+height+" "+lengNumber);
  }
  public void animalSpeed(int speed){
      System.out.println("Animal runing "+speed);


 }
}
