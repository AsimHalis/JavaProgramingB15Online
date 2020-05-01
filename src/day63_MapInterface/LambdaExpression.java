package day63_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//-> lambda expretion
public class LambdaExpression {
    public static void main(String[] args) {


Predicate<Integer> remove100=p->p ==100;
List<Integer> list1 =new ArrayList<>(Arrays.asList(100,100,100,100));
        System.out.println(list1);//[100, 100, 100, 100]
 list1.removeIf(remove100);
        System.out.println(list1);//[]

 List<Integer> list2 =new ArrayList<>(Arrays.asList(100,200,300,400,500));
 list2.removeIf(halis->halis>200);
        System.out.println(list2);// [100, 200]

 List<Integer> list3 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
 list3.forEach(p->{if(p<5){System.out.print(p+" ");}  });//1 2 3 4
        System.out.println("=======");
 list3.forEach(System.out::print);  //12345678910 print everthing
        System.out.println();
//Task:remove all that ended with "et"
List<String > list4 =new ArrayList<>(Arrays.asList("Mehmet", "Ahmet","Ibrahim","Kerime"));
list4.removeIf(r->r.endsWith("et"));
        System.out.println(list4);//[Ibrahim, Kerime]
        list4.removeIf(m->m=="Kerime");
        System.out.println(list4);//[Ibrahim]

//Task:if list 1 has "M" add the second list and remove first list
List<String > l1=new ArrayList<>();
l1.addAll(Arrays.asList("Mehmet","Mustafa","Selami","Selim","Asaf"));
 List<String > l2=new ArrayList<>();
l1.forEach(m->{if (m.startsWith("M")){ l2.add(m);}});
        System.out.println(l2);//[Mehmet, Mustafa]

 l1.removeIf(B->B.startsWith("M"));
        System.out.println(l1);//[Selami, Selim, Asaf]
}
}
// 5/1/2020 6:06 pm