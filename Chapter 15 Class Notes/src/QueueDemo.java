import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> jobs = new LinkedList<>();

        jobs.add("Harry: Quarter 2 Report");
        jobs.add("Connor: Recipe got Banana Bread");
        jobs.add("Katherine: Top Secret Document");
        
        System.out.println("Printing: " + jobs.remove());
        
        // add some more print jobs
        jobs.add("Vardhan: Grocery List");
        jobs.add("Katherine: Really Top Secret Document");
        jobs.add("Katherine: Can I get fired for this?");
        
        System.out.println("Printing: " + jobs.remove());
        System.out.println("Printing: " + jobs.remove());

        jobs.add("Boss: Katherine Termination Letter");

        //print out the rest of the queue
        //while (!jobs.isEmpty())
        //{
        //    String job = jobs.remove();
        //    System.out.println("Printing: " + job);
        //}
        //
        // OR

        for (int i= 0; i < jobs.size(); i++ )
        {
            String job = jobs.remove();
            System.out.println("Printing: " + job);
            jobs.add(job);
        }
        
}
}