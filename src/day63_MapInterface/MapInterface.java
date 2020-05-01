package day63_MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Double> employees = new HashMap<>();
        //put():adds keys and value
        employees.put("Halis", 110000.99);
        employees.put("Ozde", 120000.99);
        employees.put("Selmin", 500000.98);
        System.out.println(employees);//-->{Halis=110000.99, Ozde=120000.99}
        double salary1 = employees.get("Halis");//-->110000.99
        System.out.println(salary1);
        System.out.println(employees.get("Selmin"));//500000.98
        employees.remove("Halis");
        System.out.println(employees);//{Ozde=120000.99, Selmin=500000.98}
        System.out.println(employees.size());//--> 2
        System.out.println(employees.containsKey("Selmin"));// true
        System.out.println(employees.keySet());// [Ozde, Selmin]
        //---------------------Map accept Duplicate or No-----------
     Map<String,Integer> map1=new LinkedHashMap<>();
        map1.put("A",100);
        map1.put("A",10);
        map1.put("A",20);
        map1.put("A",70);
        System.out.println(map1);//{A=70}
        map1.put("B",70);
        System.out.println(map1);// {A=70, B=70}
        map1.put(null,null);
        System.out.println(map1);// {A=70, B=70, null=null}
     System.out.println("!!!!!!!!!!   TreeMap   !!!!!!!!!!!!!!!!!!!");
        TreeMap<String,Integer> map3=new TreeMap<>();
        map3.put("B",1000);
        map3.put("A",400);
        map3.put("Z",2400);
        map3.put("T",40);
        System.out.println(map3);//{A=400, B=1000, T=40, Z=2400}





    }
}
