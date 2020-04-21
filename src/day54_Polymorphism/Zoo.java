package day54_Polymorphism;

class Animal{
     public void talk(){
         System.out.println("Animal Talk");
            }
}
class Tiger extends Animal{
    public void Hunt(){
        System.out.println("Tiger Hunt");
    }
}

class Octopus extends Animal{
    public void Swim(){
        System.out.println("Octobus Hunt");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Tiger obj1=new Tiger();
        Animal obj2= new Tiger();//==>  Tiger is a Animal
                                //==>   Zoo has a Animal
                               //==>   Zoo has a Tigerl
    }
}
