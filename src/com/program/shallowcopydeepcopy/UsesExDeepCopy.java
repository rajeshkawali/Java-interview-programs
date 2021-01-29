package com.program.shallowcopydeepcopy;
public class UsesExDeepCopy{ 
  
    public static void main(String[] args) { 
        int[] vals = {3, 7, 9}; 
        ExDeepCopy e = new ExDeepCopy(vals); 
        e.showData(); // prints out [3, 7, 9] 
        vals[0] = 13; 
        e.showData(); // prints out [3, 7, 9] 
  
       // changes in array values will not be  
       // shown in data values.  
    } 
}
/*

			Shallow Copy																Deep Copy
Cloned Object and original object are not 100% disjoint.								Cloned Object and original object are 100% disjoint.
Any changes made to cloned object will be reflected in original object or vice versa.	Any changes made to cloned object will not be reflected in original object or vice versa.
Default version of clone method creates the shallow copy of an object.					To create the deep copy of an object, you have to override clone method.
Shallow copy is preferred if an object has only primitive fields.						Deep copy is preferred if an object has references to other objects as fields.
Shallow copy is fast and also less expensive.											Deep copy is slow and very expensive.


*/