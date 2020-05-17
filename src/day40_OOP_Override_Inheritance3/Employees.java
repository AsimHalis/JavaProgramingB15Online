package day40_OOP_Override_Inheritance3;

public class Employees {
    private String name;
    private String lastName;
    private int id;

    public Employees(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
    public void showInfo(){
        System.out.println("Employees info...");
        System.out.println("Name :" +name);
        System.out.println("last Name :"+lastName);
        System.out.println("ID :"+id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
