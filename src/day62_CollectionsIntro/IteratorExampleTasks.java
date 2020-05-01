package day62_CollectionsIntro;

import java.util.*;

public class IteratorExampleTasks {
    public static void main(String[] args) {
//---->Task: remove "e and "E""
        String[] name={"Erhan", "Ehally", "Nadire", "yusufe", "Ibrahim"," Tarbiz"};
        Set<String > names=new LinkedHashSet<String >();
        names.addAll(Arrays.asList(name));
        Iterator<String> removeE=names.iterator();//==>this method retuns iterator interface
        while (removeE.hasNext()){
            String str= removeE.next();
            if(str.contains("e")||str.contains("E")){
                // if(str.toLowerCase().contain("e))
                removeE.remove();
            }
        }
        System.out.println(names);//--->[Ibrahim,  Tarbiz]
        System.out.println("((((((((((((((((((((((()))))))))))))))))))))))))))");
 //---->Task2: remove "more than 100"
        List<Integer> numbers=new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(100,900,300,30,45,202));
        Iterator<Integer> removeGreder= numbers.iterator();
        while (removeGreder.hasNext()){
            //want to use for loop-->for ( Iterator<Integer> removeGreder= numbers.iterator();removeGreder.hasNext();)
            Integer int2=removeGreder.next();
            if (int2>100){
                removeGreder.remove();
            }
        }
        System.out.println(numbers);//[100, 30, 45]
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//---->Task3: remove "Duplicate name Ali"
        String[] student={"Ali","Ali","Ali","Ali","Selami","Veli","Ali", "Ali"};
        List<String> nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(student));
        Iterator<String> remDuplicate= nameList.iterator();
        while (remDuplicate.hasNext()){
            String str3=remDuplicate.next();
            if (str3.equalsIgnoreCase("Ali")){
                remDuplicate.remove();
            }
        }
        System.out.println(nameList);

//---->Task4:  write a program that can remove all even numbers from a List Interface
        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,3,6,12,11,34,45,56,67,78,90));

           //for(initialization; Condition ; Iterator)
             for (Iterator<Integer> removeEven=list1.iterator(); removeEven.hasNext();){
                 int a =removeEven.next(); //unboxing
                 if (a %2==0){
                     removeEven.remove();

                 }
             }
        System.out.println(list1);//---> [11, 45, 67]
    }
}
