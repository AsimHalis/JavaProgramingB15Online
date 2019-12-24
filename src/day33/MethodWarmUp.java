package day33;

public class MethodWarmUp {
    public static void main(String[] args) {
         String spelledName=getSpelledName("Asim");
        System.out.println("spelledName = "+ spelledName);
       System.out.println(getSpelledName("Halis"));
        System.out.println(getSpelledName2("Furkan"));
        System.out.println("Eren");
    }

    public static String getSpelledName(String name){

     String result="";
        for (int x = 0; x <name.length() ; x++) {
            result=result+name.charAt(x);
            if(x!=name.length()-1){
                result = result+ "-" ;
            }
        }
        return result;

    }
    public static String getSpelledName2(String name) {

        String result = "";
        for (int i = 0; i < name.length() - 1; i++) {
            result += name.charAt(i) + "-";
        }
        return result+name.charAt(name.length()-1);
    }




}
