// import java.util.*;

// public class HashMapp {
//     public static void main(String args[]){

//         //create
//         HashMap<String, Integer> hm = new HashMap<>();
//         //Insert
//         hm.put("India", 100);
//         hm.put("china", 150);
//         hm.put("us", 50);

//         System.out.println(hm);

//         //size
//         System.out.println(hm.size());

//         //Is Empty
//         hm.clear();
//         System.out.println(hm.isEmpty());

//         // //get -O(1)
//         // int population = hm.get("India");
//         // System.out.println(population);
//         // System.out.println(hm.get("Indonesia"));

//         // //containskey -O(1)
//         // System.out.println(hm.containsKey("India"));
//         // System.out.println(hm.containsKey("Indonesia"));

//         // //Remove
//         // System.out.println(hm.remove("china"));
//         // System.out.println(hm);
//     }

// }

// import java.util.*;
// public class HashMapp {

//     public static void  main(String args[]){
//         HashMap<String, Integer>hm = new HashMap<>();
//         hm.put("india", 100);
//         hm.put("china",150 );
//         hm.put("us",50 );
//         hm.put("Indonesia", 6);
//         hm.put("Nepal", 5);

//         //Iterate
//         Set<String> keys = hm.keySet();
//         System.out.println(keys);

//         for(String k: keys){
//             System.out.println("key="+k+",value="+hm.get(k));
//         }

//     }
// }

// import java.util.*;

// public class HashMapp {

//     static class HashMap<K,V> {
//         private class Node {
//             K key;
//             V value;

//             public Node (K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; // number of elements
//         private int N; // number of buckets
//         private LinkedList<Node> buckets[];

//         @SuppressWarnings("unchecked")
//         public HashMap(){
//             this.N = 4;
//             this.buckets = new LinkedList[N];
//             for(int i=0; i<N; i++){
//                 buckets[i] = new LinkedList<>();
//             }
//         }

//         private int hashFunction(K key){
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         private int SearchInLL(K key, int bi){
//             LinkedList<Node> ll = buckets[bi];
//             for(int i=0; i<ll.size(); i++){
//                 Node node = ll.get(i);
//                 if(node.key.equals(key)){
//                     return i;
//                 }
//             }
//             return -1;
//         }

//         public void put(K key, V value){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1){
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             } else {
//                 buckets[bi].add(new Node(key, value));
//                 n++;
//             }
//         }

//         public boolean containsKey(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);
//             return di != -1;
//         }

//         public V get(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);
//             if(di != -1){
//                 Node node = buckets[bi].get(di);
//                 return node.value;
//             } else {
//                 return null;
//             }
//         }

//         public V remove(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);
//             if(di != -1){
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             } else {
//                 return null;
//             }
//         }

//         public ArrayList<K> keySet(){
//             ArrayList<K> keys = new ArrayList<>();
//             for(int i=0; i<N; i++){
//                 for(Node node : buckets[i]){
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }
//     }

//     public static void main(String args[]){
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100);
//         hm.put("China",150);
//         hm.put("US",50);
//         hm.put("Indonesia", 6);
//         hm.put("Nepal", 5);

//         ArrayList<String> keys = hm.keySet();
//         for(String key: keys){
//             System.out.println(key);
//         }

//         System.out.println(hm.get("India"));      // 100
//         System.out.println(hm.remove("India"));   // 100
//         System.out.println(hm.get("India"));      // null
//     }
// }
// import java.util.*;
// public class HashMapp {

//     public static void main(String args[]){
//         TreeMap<String, Integer>tm = new TreeMap<>();
//         tm.put("India", 100);
//         tm.put("China",150);
//         tm.put("US",50);

//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100);
//         hm.put("China",150);
//         hm.put("US",50);

//         System.out.println(tm);
//         System.out.println(hm);

//     }
// }    

// import java.util.*;
// public class HashMapp {

//     public static void main(String args[]){
//         int arr[] = {1, 3, 2, 5, 1, 3, 5, 1};
//         HashMap<Integer, Integer>map = new HashMap<>();

//         for(int i=0; i<arr.length; i++){
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         for(Integer key: map.keySet()){
//             if (map.get(key)>arr.length/3) {
//                 System.out.println(key);
//             }
//         }
//     }
// }

// import java.util.*;

// public class HashMapp {

//     public static boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }

//         HashMap<Character, Integer> map = new HashMap<>();

//         // Count frequency of characters in s
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         // Decrease count for characters in t
//         for (int i = 0; i < t.length(); i++) {
//             char ch = t.charAt(i);
//             if (map.get(ch) != null) {
//                 if (map.get(ch) == 1) {
//                     map.remove(ch);
//                 } else {
//                     map.put(ch, map.get(ch) - 1);
//                 }
//             } else {
//                 // Extra character found in t
//                 return false;
//             }
//         }

//         return map.isEmpty();
//     }

//     public static void main(String args[]) {
//         String s = "race";
//         String t = "care";

//         System.out.println(isAnagram(s, t)); 
//     }
// }

// import java.util.*;
// public class HashMapp {

//     public static void main(String args[]){
//         HashSet<Integer>set = new HashSet<>();

//         set.add(1);
//         set.add(2);
//         set.add(4);
//         set.add(2);
//         set.add(1);

//         System.out.println(set);
//         set.clear();
//         System.out.println(set.size());
//         System.out.println(set.isEmpty());

//     }
// }

// import java.util.*;
// public class HashMapp {

//     public static void main(String args[]){
//         HashSet<String>cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Noida");
//         cities.add("Bengaluru");

//         // Iterator it = cities.iterator();
//         // while (it.hasNext()) {
//         //     System.out.println(it.next());
//         // }

//         // for(String city : cities){
//         //     System.out.println(city);
//         // }

//         LinkedHashSet<String>lhs = new LinkedHashSet<>();
//         lhs.add("Delhi");
//         lhs.add("Mumbai");
//         lhs.add("Noida");
//         lhs.add("Bengaluru");
//         lhs.remove("Delhi");
//         System.out.println(lhs);

//         TreeSet<String>ts = new TreeSet<>();
//         ts.add("Delhi");
//         ts.add("Mumbai");
//         ts.add("Noida");
//         ts.add("Bengaluru");
//         ts.remove("Delhi");
//         System.out.println(ts);

//     }
// }

// import java.util.*;
// public class HashMapp {

//     public static void main(String args[]){
//         int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
//         HashSet<Integer>set = new HashSet<>();

//         for(int i=0; i<num.length; i++){
//             set.add(num[i]);
//         }
//         System.out.println("ans ="+set.size());
//     }
// }

//union & Intersection of 2 arrays

// import java.util.*;
// public class HashMapp {

//     public static void main (String args[]){
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         HashSet<Integer>set = new HashSet<>();

//         //union
//         for(int i=0; i<arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++){
//             set.add(arr2[i]);
//         }
//         System.out.println("union =" + set.size());

//         //intersection
//         set.clear();
//           for(int i=0; i<arr1.length; i++){
//             set.add(arr1[i]);
//         }
//         int count = 0;
//          for(int i=0; i<arr2.length; i++){
//             if (set.contains(arr2[i])) {
//                 count++;
//                 set.remove(arr2);
//             }
//         }
//         System.out.println("intersection ="+ count);

//     }
// }

//fint iteration from tickets

// import java.util.*;
// public class HashMapp {

//     public static String getStart(HashMap<String, String> tickets) {
//         HashMap<String, String> revMap = new HashMap<>();

//         for (String key : tickets.keySet()) {
//             revMap.put(tickets.get(key), key);
//         }

//         for (String key : tickets.keySet()) {
//             if (!revMap.containsKey(key)) {
//                 return key; // starting point
//             }
//         }
//         return null;
//     }

//     public static void main(String args[]) {
//         HashMap<String, String> tickets = new HashMap<>();
//         tickets.put("chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getStart(tickets);
//         System.out.print(start);

//         while (tickets.containsKey(start)) {
//             System.out.print("->" + tickets.get(start));
//             start = tickets.get(start);
//         }
//         System.out.println();
//     }
// }

//Largest subarray with 0 sum

// import java.util.*;
// public static void main(String args[]){
//     int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

//     HashMap<Integer, Integer>map = new HashMap<>();

//     int sum = 0;
//     int len = 0; 
//     for(int j=0; j<arr.length; j++){
//         sum += arr[j];
//         if (map.containsKey(sum)) {
//             len = Math.max(len, j-map.get(sum));
//         }else{
//             map.put(sum, j);
//         }
//     }
//     System.out.println("Largest subarray with sum as 0 =>"+len);
// }

import java.util.*;

public static void main(String args[]) {
    int arr[] = { 10, 2, -2, -20, 10 };
    int k = -10;

    HashMap<Integer, Integer> map = new HashMap<>();
    // (sum, count)
    map.put(0, 1);
    int sum = 0;
    int ans = 0;

    for (int j = 0; j < arr.length; j++) {
        sum += arr[j];
        if (map.containsKey(sum - k)) {
            ans += map.get(sum - k);
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    System.out.println(ans);
}