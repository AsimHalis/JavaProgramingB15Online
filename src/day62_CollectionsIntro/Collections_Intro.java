package day62_CollectionsIntro;

public class Collections_Intro {
    /**Data stracture:in order to manage data efficiently and in an orginized manner, we need data structures
     * The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects
     *   There is 3 main Data structure
     *       1.Array
     *       2.Collections FrameWork
     *       3.Maps
     *
     * 1.Array:Collections of Data(same data type). size is fixed. has index number, can be multi-dimensional
     *         support primitives and object
     *         we can have duplicates
     *
     * 2.Collections framework: Cosnsist of multiple interfaces, each interfaces has multiple implementations!
     *          Interfaces in Collections frame work:
     *              1.Iterable(Interface)
     *              2.Collection(I)
     *              3.List(I)
     *              4.Set(I)
     *              5.SortedSet(I)
     *              6.Queue(I)
     *              7.Deque(I)
     *    All those interfaces are presented in java.util package. and only support Objects!
     *
     * 1.Iterable(I):Root interface, super type of all interfaces in collections framework.Extended by Collection(I)
     *
     *
     *
     * 2.Collections(I): Extended by three interfaces: List(I), Set(I), Queue(I)
     * 3.List(I) : implemented By a.ArrayList(Class), b.LinkedList(C), c.Vector(C)
     *             List interface has index number, dynamic sized, accepts dublicates.
     *
     *                    List<Integer> list2= new ArrayList<>();
     *                    List<Integer> list3= new LinkedList<>();
     *                    List<Integer> list4= new Vector<>();
     *                     List<Integer> list4= new Stack<>();
     *
     *            a.Arraylist : ArrayList is Array based class, internally uses the array
     *            b.LinkedList: Each objects are doublly linked in the LinkedList
     *                        double linked:adding&removing(add(), remove()) data are faster
     *                        retrieving(gerialma) data(get()) is slower
     *                    !!! LinkedList not Array based class
     *            c.Vector : Vector is synchronized(by one by) and only preferred in multi-threads!!!!
     *                     advantage: Thread safe in multi-thread environment
     *                     dis-advantage: slower
     *                 Vector has a child class that call: Stack
     *             Stack : synchronized
     *     pop(): LIFO( Last In First Out) remove the last object from the stack
     *            Synchronized keyword used for achieve==> Thread safe is multi-thread environment
     *                      multi-thread:multiple threads try to get access to same resources
     *
     *4.Set(I): Does not take duplicates, does not have index numbers
     *          implemented by(tarafindan uygulanmak) HashSet(C) and LinkedHashSet(C)
     *          Extended(genisletilmis) by SortedSet(I)(SortedSet is implemented by TreeSet(C)
     *          Set<Integer> st1=new HashSet<>();
     *          Set<Integer> st2=new LinkedHashSet<>();
     *          Set<Integer> st3=new TreeSet<>();
     *     ONLY Accepts unique Object!
     *
     *5.SortedSet(I) : Sorts the object in Ascending order, does not accept duplicates
         *          implemented by TreeSet(C)
     *
     *6.Queue(I): Does not have index numbers, does accept duplicates
     *               implemented by PriorityQueue
     *               Extended by Deque(I)
     *               poll():FIFO==>First In First Out
     *                         return the first object as same data type, at the same time
     *                         it removes the first object from the Queue
     *7.Deque(I) is implemented by ArrayDeque(C) and LinkedList(C)
     *          *LinkedList(C) is implementing both List(I) and Deque(I)
     *          ******************
     *          addFirst(object): adds the given object to the starting point of the Deque
     *          removeFirst();
     *          removeLast();
     *          getFirst();
     *          getLast();
     *
     */
}
