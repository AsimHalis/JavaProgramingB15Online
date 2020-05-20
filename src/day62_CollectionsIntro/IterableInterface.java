package day62_CollectionsIntro;

import javax.imageio.ImageTranscoder;
import java.util.*;

public class IterableInterface {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
           list.addAll(Arrays.asList(1,1,1,2,3,3,4,5,6,7,1,1,1));
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)==1){
                list.remove(i);
            }
        }
        //Task: iterater metod u kullanarak tum duplicate leri kaldirabiliyoruz!!
        System.out.println(list);//[1, 2, 3, 3, 4, 5, 6, 7, 1]
        System.out.println("%%%%%%%%%%%%%%%");
        List<Integer> list2= new ArrayList<Integer>();
        list2.addAll(Arrays.asList(1));
       Iterator<Integer> it= list2.iterator();

        boolean a=it.hasNext();//returns boolean- true or false
        System.out.println(a);//true
        System.out.println(it.next());//1
        boolean b=it.hasNext();
        System.out.println(b);//false

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

        List<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,1,2,3,3,4,5,6,7,1,1,1));
//remove all data elements that are equal to 1
        Iterator<Integer> it3=list3.iterator();
        while (it3.hasNext()){
            int num = it3.next();
                if (num==1){
                   it3.remove();
                 }
        }
        System.out.println(list3);//[2, 3, 3, 4, 5, 6, 7]
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Set<Integer> set=new LinkedHashSet<Integer>();
        set.addAll(Arrays.asList(10,20));

                 Iterator<Integer> iterate=set.iterator();

        System.out.println(iterate.hasNext());//true
        System.out.println(iterate.next());//10

        System.out.println(iterate.hasNext());//true
        System.out.println(iterate.next());//20

        System.out.println(iterate.hasNext());//false
                         try {
                             System.out.println(iterate.next());//NoSuchElementException
                             System.out.println("try block");
                             }
                          catch (Exception e){
                             System.out.println("catch block");
                             }


    }
}
