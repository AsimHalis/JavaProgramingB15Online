package day62_CollectionsIntro;

import java.awt.geom.NoninvertibleTransformException;
import java.lang.reflect.Array;
import java.util.*;

public class ListInterface {
  //  List<Integer> list1= new List<>(); ==> because object are created from classes that is concered!
                                   //    ==> interface we can not creat object give me compile error

    List<Integer> list2= new ArrayList<>();
    List<Integer> list3= new LinkedList<>();
    List<Integer> list4= new Vector<>();
    List<Integer> list5= new Stack<>();

    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<>();
        arraylist.add(10);
        arraylist.add(20);
        arraylist.remove(1);
        System.out.println(arraylist);//-->[10, 20]

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(30);
        linkedList.add(40);
        linkedList.remove(0);
        System.out.println(linkedList);//-->[30, 40]

        System.out.println("11$$$$$$$$$$$$$$$$$$$$$$$$$$");
        String[] arr={"A","B","C", "C"};

        List<String> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);//--->[A, B, C ,C]

        System.out.println("2222$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Vector<Integer> vt= new Vector<Integer>();
                     vt.add(1);
                     vt.add(2);
                     vt.remove(0);
        System.out.println(vt);//--->[1, 2]
        System.out.println("3333$$$$$$$$$ Stack  $$$$$$$$$$$$$$");
        Stack<Integer> st=new Stack<Integer>();
        st.add(55);
        st.add(22);
        st.add(33);
        st.add(44);
        System.out.println(st);//-->[55, 22, 33, 44]
        st.pop();//-->44  LIFO( Last In First Out)
        System.out.println(st);//--->[55, 22, 33]

        System.out.println("?????????????  SET  ?????????????");
            List<Integer> list1= new ArrayList<>();
            list1.addAll(Arrays.asList(100,100,100));
                    System.out.println(list1);//--->[100, 100, 100]
                    System.out.println(list1.get(1));//-->100

            Set<Integer> st1=new HashSet<>();
                         st1.add(100);
                         st1.add(100);
                         st1.add(100);
                   System.out.println(st1);//--->[100] Does not take duplicates
                // System.out.println(st1.get(1)); set does not have index number
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        Set<Integer> hashset=new HashSet<>();
        hashset.add(100);
        hashset.add(10);
        hashset.add(7);
        hashset.add(4);
        hashset.add(8);
        hashset.add(100);

        System.out.println(hashset);//-->HashSet is not keep the object order as it is!!-->[100, 4, 7, 8, 10]

        System.out.println("@@@@@@@@@@@@@@@@@");
        Set<Integer> linkedhashset=new LinkedHashSet<>();
        linkedhashset.add(100);
        linkedhashset.add(10);
        linkedhashset.add(7);
        linkedhashset.add(4);
        linkedhashset.add(8);
        linkedhashset.add(100);//-->LinkedHashSet is keep the order as it is!![100, 10, 7, 4, 8]

        System.out.println(linkedhashset);

        System.out.println("&&&&&&&&&&&&&&&&&&&");
        SortedSet<Integer> list7=new TreeSet<>();
        list7.addAll(Arrays.asList(100,10,7,4,8,100));

        System.out.println(list7);//--->>[4, 7, 8, 10, 100]

        System.out.println("++++++++++++++++++++");
       List<Integer> list6=new ArrayList<>();
       list6.addAll(Arrays.asList(10,2,5,9,4,2));
          Collections.sort(list6);//--->How to sort with duplicate list
        TreeSet<Integer> ts= new TreeSet<>(list6);
        System.out.println(list6);//--->[2, 2, 4, 5, 9, 10]
        System.out.println(ts);    //-->[2, 4, 5, 9, 10] Remove the duplicate with sort same time!

        System.out.println("???????????????????????");
        String str="ZZAAABBBCCDDDJJRR";
        String[] arr1=str.split("");
        System.out.println(Arrays.toString(arr1));//--->[Z, Z, A, A, A, B, B, B, C, C, D, D, D, J, J, R, R]
        //============================================================
        LinkedHashSet<String> hst= new LinkedHashSet<>(Arrays.asList(arr1));
        System.out.println(hst);       //--->[Z, A, B, C, D, J, R]
        String result2=hst.toString().replace("[","").replace("]","").replace(", ","");
        System.out.println(result2);    //--->ZABCDJR
        //=================================
         TreeSet<String> tre=new TreeSet<>(Arrays.asList(arr1));
          System.out.println(tre);          //--->[A, B, C, D, J, R, Z]
          String result=tre.toString().replace("[","").replace("]","").replace(", ","");
          System.out.println(result);        //-->ABCDJRZ


    }
}
