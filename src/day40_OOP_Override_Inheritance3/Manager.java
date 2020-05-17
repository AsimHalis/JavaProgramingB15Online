package day40_OOP_Override_Inheritance3;

public class Manager extends Employees {
    private int teamSize;
    public Manager(String name, String lastName, int id,int teamSize) {
        super(name, lastName, id);
        this.teamSize=teamSize;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mannager team size :"+teamSize);
    }
    public void contribution (int amount){
        System.out.println(getName()+"'s Extra Manager Contribution is  :" +amount);
    }
}
