import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //Queue<String> students = new PriorityQueue<>();
        //students.add("Neel");
        //students.add("Jonathon");
        //students.add("Cam");
        //students.add("Kaitlyn");
        //students.add("Dylan");

        // The next highest priority object is moved to the front of the queue
        //when the head of the queue is removed
        //while (students.size() > 0)
        //    {System.out.println(students.remove());}



        Queue<WorkOrder> toDo = new  PriorityQueue<>();

        toDo.add(new WorkOrder(3, "Water plants"));
        toDo.add(new WorkOrder(2, "make dinner"));
        toDo.add(new WorkOrder(1, "Conquer the world"));
        toDo.add(new WorkOrder(9, "play videogames"));
        toDo.add(new WorkOrder(1, "study for the SE 1 test"));

        System.out.println(toDo);

        while (toDo.size() > 0)
            {System.out.println(toDo.remove());}

    }
}
