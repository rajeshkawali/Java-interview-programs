package com.programs.map;
// Java code to demonstrate IdentityHashMap and
// illustration of how it is different from HashMap 
import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;
 
//1. IdentityHashMap uses equality operator â€œ==â€� for comparing keys and values while HashMap uses equals method for comparing keys and values inside Map.
//2. Since IdentityHashMap doesnâ€™t use equals() its comparatively faster than HashMap for object with expensive equals().
//3. IdentityHashMap doesnâ€™t require keys to be immutable as it is not relied on equals().
//4. IdentityHashMap implements Map, Serializable and Clonable interfaces and extends AbstractMap class.
//5. 
//6. 
//7. 

public class IdentityHashMapMain 
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
    {
        // Creating HashMap and IdentityHashMap objects
        Map hm = new HashMap();
        Map ihm = new IdentityHashMap();
 
        // Putting key and value in HashMap and IdentityHashMap Object
        hm.put("hmkey","hmvalue");
        hm.put(new String("hmkey"),"hmvalue1"); 
        ihm.put("ihmkey","ihmvalue"); 
        ihm.put(new String("ihmkey"),"ihmvalue1"); 
         
        // Print Size of HashMap and IdentityHashMap Object
        //hm.size() will print 1 since it compares the objects logically
        // and both the keys are same
        System.out.println("Size of HashMap--"+hm.size());
         
        //ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap--"+ihm.size());
 
         
    }
}