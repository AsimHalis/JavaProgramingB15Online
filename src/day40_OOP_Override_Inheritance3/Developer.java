package day40_OOP_Override_Inheritance3;

public class Developer extends Employees {
    private String language;
    public Developer(String name, String lastName, int id,String language) {
        super(name, lastName, id);
        this.language=language;
    }
    public void getFormat(String operatingSystem ){
        System.out.println(getName()+" "+getLastName()+" "+" uploding this "+operatingSystem+" operating System");

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("developer extra languages "+language);
    }
}
