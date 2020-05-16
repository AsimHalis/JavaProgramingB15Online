package day40_OOP_Concept_Inheritance;

public class Employee {
        private String name;
        private int income;
        private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

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
        System.out.println("New Department :"+newDepart);
    }


}

