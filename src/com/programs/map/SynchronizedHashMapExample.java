package com.programs.map;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
public class SynchronizedHashMapExample {   
    public static void main(String[] args) {
        //Creating HashMap object which is not synchronized
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //Adding elements to map         
        map.put("ONE", 1);         
        map.put("TWO", 2);         
        map.put("THREE", 3);         
        map.put("FOUR", 4);         
        map.put("FIVE", 5);        
        //Getting synchronized map
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);  
        Set<String> keySet = synchronizedMap.keySet();        
        System.out.println("Keys.............");         
        //While iterating over synchronizedMap, you must use synchronized block.   
        synchronized (synchronizedMap) {
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                System.out.print(it.next()+" ");// FIVE ONE FOUR TWO THREE
            }
        }
         
        Collection<Integer> values = synchronizedMap.values();
        System.out.println("\nValues............."); 
        //While iterating over synchronizedMap, you must use synchronized block.      
        synchronized (synchronizedMap){
            Iterator<Integer> it = values.iterator();
            while (it.hasNext()){
                System.out.print(it.next()+" ");// 5 1 4 2 3
            }
        }
    }    
}