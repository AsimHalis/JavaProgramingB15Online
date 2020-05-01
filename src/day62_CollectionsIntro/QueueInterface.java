package day62_CollectionsIntro;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(30);
        System.out.println(q1);//--->[10, 20, 30, 40, 30]
        q1.poll();  //  *Queue(I): poll(): FIFO ==>First In First Out
        System.out.println(q1);//-->[20, 30, 30, 40]
        q1.poll();
        System.out.println(q1);//-->[30, 40, 30]
        q1.poll();
        System.out.println(q1);//-->[30, 40]

        Queue<String> q2=new PriorityQueue<>();
        q2.add("Selami");
        q2.add("Ali");
        q2.add("Veli");
        q2.add("Aba");

        System.out.println(q2);//--->[Aba, Ali, Veli, Selami]
        q2.poll();
        System.out.println(q2);//-->[Ali, Selami, Veli]
        System.out.println("###########Deque###########");
        Deque<Integer> DQ=new ArrayDeque<>();//[]
        DQ.addFirst(10);//[10]
        DQ.addFirst(20);//[20,10]
        DQ.addFirst(30);//[30,20,10]
        DQ.addLast(40);//[30,20,10,40]
        System.out.println(DQ);
        DQ.removeFirst();//[20,10,40]
        DQ.removeLast();//[20,10]
        System.out.println(DQ);
        System.out.println(DQ.getFirst());//20
        System.out.println(DQ.getLast());//10
        System.out.println(DQ.remove());//20


    }
}
