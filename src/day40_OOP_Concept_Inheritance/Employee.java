package day40_OOP_Concept_Inheritance;

public class Employee {
        private String name;
        private int income;
        private String department;

    public Employee(String name, int income, String department) {
        this.name = name;
        this.income = income;
        this.department = department;
    }
    public void info(){
        System.out.println("Name :"+name);
        System.out.println("income :"+income);
        System.out.println("Department :"+department);
    }

    public void changeDepart(String newDepart){
        System.out.println("Department has changed ");
        this.department=newDepart;
        System.out.println("New Department "+this.department);
    }


}

