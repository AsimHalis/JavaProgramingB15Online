package day11;

public class WarmUp {
    public static void main(String[] args) {
   /*
    * Create class called WarmUp1_LightOnOff
    Create a variable  targetOption as String and assign one of below options  for example bd
    You have 4 switches in your home to turn on
          Bd — bedroom
          Lr  — living room
          ki  — kitchen
          Ha— Hallway
    Use switch statement to write a program to print which room light is turned on
    For example if Bd was targetOption
        then print  you have turned on bedroom light
* */
     String targetOption="Ha";
     //Bd-bedroom, Lr-living room, ki-kitchen, ha-Hallway
             switch (targetOption) {
                 case "Bd":
                     System.out.println("You have turned on bedroom light");
                     break;
                 case "Lr":
                     System.out.println("You have turned on Livin groom light");
                     break;
                 case "Ki":
                     System.out.println("You have turned on kitchen light");
                     break;
                 case "Ha":
                     System.out.println("You have turned on Hallway light");
                     break;
                 default:
                     System.out.println("Wrong Option");

             }
    }
}
