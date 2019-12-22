package day29;

public class HeroIdentity {
    public static void main(String[] args) {
        String  hero1="Superman-Clark J Kent";
        String[] fullNameSplit=hero1.split("-");

        int heroCode=fullNameSplit[0].length();//Superman
        int lengthFullname=fullNameSplit[1].length();//Clark J Kent


        String star="";
        for (int i = 0; i <lengthFullname ; i++) {
           star =star+"*";
        }
        System.out.print("Superman-");
        System.out.print(star);
        String heroX=hero1.replace(fullNameSplit[1],star);
        System.out.println();
        System.out.println(heroX);
    }
}
