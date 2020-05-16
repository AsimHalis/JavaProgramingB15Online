package day40_OOP_Concept_Inheritance;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager("Halis Can",10000,"QA",10);
        manager.info();
        manager.changeDepart("DevTeam");
        manager.info();
        System.out.println("****** superclass ******");
        Employee employee=new Employee("Ozde",15000,"QA");
        employee.info();
        employee.changeDepart("RemoteTeam");
        employee.info();
        System.out.println("**** maintenance class***");
        Maintenance maintenance=new Maintenance("Selim",25000,"MainTeam");
        maintenance.info();
        maintenance.changeDepart("DevelopTeam");
        maintenance.info();
    }
}
