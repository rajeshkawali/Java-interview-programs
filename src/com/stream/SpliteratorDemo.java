package com.stream;
import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo
{
    public static void main(String[] args)
    {
        // Create an array list for doubles.
        ArrayList<Integer> al1 = new ArrayList<>();

        // Add values to the array list.
        al1.add(1);
        al1.add(2);
        al1.add(-3);
        al1.add(-4);
        al1.add(5);

        // Use tryAdvance() to display(action) contents of arraylist.
        System.out.print("Contents of arraylist:\n");

        // getting Spliterator object on al1
        Spliterator<Integer> splitr = al1.spliterator();

        // Use tryAdvance() to display(action) contents of arraylist.
        // Notice how lambda expression is used to implement accept method
        // of Consumer interface

        while(splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println("-----------------------------------");
        // Use tryAdvance() for getting absolute values(action) of contents of arraylist.
        // Create new list that contains absolute values.
        ArrayList<Integer> al2 = new ArrayList<>();
        splitr = al1.spliterator();

        // Here our action is to get absolute values
        // Notice how lambda expression is used to implement accept method
        // of Consumer interface
        while(splitr.tryAdvance((n) -> al2.add(Math.abs(n))));
        System.out.print("Absolute values of contents of arraylist:\n");

        // getting Spliterator object on al2
        splitr = al2.spliterator();
        while(splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println("-----------------------------------");
        //To perform hasNext() and next() operations in single statement using forEachRemaining() method.
        Spliterator<Integer> spliterator = al1.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}
/*
Contents of arraylist:
1
2
-3
-4
5
-----------------------------------
Absolute values of contents of arraylist:
1
2
3
4
5
-----------------------------------
1
2
-3
-4
5
*/