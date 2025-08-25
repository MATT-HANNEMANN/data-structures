import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList <String> Staff = new LinkedList<>();
        Staff.addLast("Tony");
        Staff.addLast("Natasha");
        Staff.addLast("Peter");
        Staff.addLast("Steve");

        System.out.println(Staff);

        //List is Currently: [Tony, Natasha, Peter, Steve]
        /* 
         * The ListIterator method creates a new list iterator
         * That is positioned at the head of the list.
         * the | is used to represent the Iterator position. 
        */

        ListIterator<String> iterator = staff.listIterator(); // | Tony, Natasha, Peter, Steve

        /* The next method advances teh iterator OVER the next element in the list. */
        iterator.next(); // Tony | Natasha, Peter, Steve 

        /* The next method also returns the element that the iterator passes over */
        String avenger = iterator.next(); // Natasha | Peter, Steve
        System.out.println(avenger); //should print Natasha
    }
}
