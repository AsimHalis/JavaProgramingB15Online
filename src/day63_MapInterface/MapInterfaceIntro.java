package day63_MapInterface;

public class MapInterfaceIntro {
    /**Data Structures:
     *            -Array
     *            -Collections Framework
     *            -Map
     *  Map Interface: Accepts key and value, both key and value does not support primitives!
     *
     *           Set<value>
     *           Map<Key,Value>
     *
     *           implrmrnt by HashMap(C), LinkedHashMap(C), and HashTable(C)
     *           Extended by SortedMap(I)
     *           SortedMap(I) id implemented by TreeMap(C)
     *
     *           Map<Key, Value> map1=new HashMap<>();--->does not order as its
     *           Map<Key, Value> map1=new LinkedHashMap<>();----> maintein the insertion order as its!
     *           Map<Key, Value> map1=new HashTable<>();
     *           Map<Key, Value> map1=new TreeMap<>();
     *
     *           SortedMap<Key, Value> = new TreeMap<>();
     *Map Interface:
     *             put(key,value): insert key and value objects to the map
     *             get(key):retrives(veriyi geri cagirma) the value of the given key
     *             remove():removes the given key object and its value
     *             size(): returns the size of the map
     *             comtainsKey():Verifies if the given Key is exist in the map
     *             containValue(): verifyes if the given value is exist in the map.
     *             keySet():retunrs all the kesy as Set interface
     *             clear(): remove everything size will become 0
     *    HashMap<>();--->does not order as its
     *    !!!LinkedHashMap<>();----> maintein the insertion order as its!
     *                 get() is slower than hashmap
     *    HashTable(C): Key and Value cannot benull! and also is synchronized--> Thread-Safe
     *                very slow!!
     *
     *    !!!TreeMap(C):Implementing SortedMap
     *    sorts the keys in ascending order1
     */
}
