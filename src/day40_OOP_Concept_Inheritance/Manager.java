package day40_OOP_Concept_Inheritance;

public class Manager extends Employee{
    private int teamSize;// we can add exta option
    public Manager(String name, int income, String department, int teamSize) {
        super(name, income, department);
        this.teamSize = teamSize;
    }

    public void info(){
        /*System.out.println("Name :"+getName());
        System.out.println("income :"+getIncome());
        System.out.println("Department :"+getDepartment());*/
        super.info();

        System.out.println("Team Size :"+teamSize);


    }

}

