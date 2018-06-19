package com.programs.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class IteratorAndListIterator
{
    @SuppressWarnings("rawtypes")
	public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
        //Traversing list elements in forward direction using Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+","); //  OUTPUT : FIRST,SECOND,THIRD,
          
            //iterator.remove(); //Removing an element
            //System.out.println(list);    //Output : []
        }
        System.out.println("\n---------------------------"); 
        //Traversing list elements in forward direction using ListIterator
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext())
        {
        	
            //System.out.println(listIterator.nextIndex()+" : "+listIterator.next()); //Getting index of next element
            /*
              	0 : FIRST
				1 : SECOND
				2 : THIRD
             */
           System.out.print(listIterator.next()+" "); //  OUTPUT : FIRST SECOND THIRD
            
          //Modifying an element returned by next()
          //listIterator.set("MODIFIED");
          //System.out.println(list);       //Output :    [MODIFIED, MODIFIED, MODIFIED]
        }
        System.out.println("\n---------------------------"); 
        //Traversing list elements in backward direction using ListIterator
        while (listIterator.hasPrevious())
        {
        	System.out.println(listIterator.previousIndex()+" : "+listIterator.previous());
        	/*
        	 	2 : THIRD
				1 : SECOND
				0 : FIRST
        	 */
           // System.out.print(listIterator.previous()+" "); //  OUTPUT : THIRD SECOND FIRST
        }
        //Iterating list from index 2 using ListIterator
        ListIterator<String> listIterator2 = list.listIterator(1);
        while (listIterator2.hasNext())
        {
            System.out.print(listIterator2.next()+" "); //output : SECOND THIRD
        }
    }
}