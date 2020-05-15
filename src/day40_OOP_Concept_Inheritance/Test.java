package day40_OOP_Concept_Inheritance;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager("Halis Can",10000,"QA");
        manager.info();
        manager.changeDepart("IT");
        manager.info();
    }
}
