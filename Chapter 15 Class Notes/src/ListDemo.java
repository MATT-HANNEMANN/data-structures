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

        ListIterator<String> iterator = Staff.listIterator(); // | Tony, Natasha, Peter, Steve

        /* The next method advances teh iterator OVER the next element in the list. */
        iterator.next(); // Tony | Natasha, Peter, Steve 

        /* The next method also returns the element that the iterator passes over */
        String avenger = iterator.next(); // Natasha | Peter, Steve
        System.out.println(avenger); //should print Natasha


        /* The add method inserts an element at the interator position */
        /* The Iterator is then positioned after the element was added */
        iterator.add("Clint"); // Tony, Natasha, Clint | Peter, Steve
        iterator.add("Bruce"); // Tony, Natasha, Clint, Bruce | Peter, Steve
        System.out.println(Staff); 

        /* The remove method can ONLY be called after calling nect or previous  */
        /* iterator.remove(); this line owuld cause na IllegalStateException  */
        /* The remove method removes the element returned after calling next or previous  */

        iterator.next(); // Tony, Natasha, Clint, Bruce, Peter | Steve
        iterator.remove(); // Tony, Natasha, Clint, Bruce | Steve
        System.out.println(Staff);

        /* The set method updates the element returned by the last call to next or previous */

        iterator.previous(); // Tony, Natasha, Clint | Bruce, Steve
        iterator.set("Thor"); // Tony, Natasha, Clint, Thor | Steve
        System.out.println(Staff);

        /* The hasNext method is used to determine if there is a nect node after the iterator. The hadNext is ofter used in the confition of a while loop */

        iterator = Staff.listIterator(); // | Tony, Natasha, Clint, Thor, Steve
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if (n.equals("Natasha"))
            {iterator.remove();}
            //System.out.println(n);
        }
        
        
        for (String n : Staff)
            {System.out.println(n + " ");}

        System.out.println();




        /* ConcurrentModificationException - CANNOT modify a linked list while using an iterator, UNLESS you use the iterator to do the modification. */
        iterator = Staff.listIterator(); // | Tony, Clint, Thor, Steve
        
        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Tony")) {
                //Staff.remove("Tony"); ConcurrentModificationException
            }
        }
        


        for (String n: Staff){
            if (n.equals("Tony")){
                Staff.add("T,Challa");
            }
        }
   
        System.out.println(Staff);









    }
}
