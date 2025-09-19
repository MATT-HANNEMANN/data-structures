import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/**
 * Implement a to do list. Tasks have a priority between 
 * 1 and 9 (with 1 being most urgent), and a description.
 * When the user enters the command 'add priority description', 
 * the program adds a new task. When the user enters next, 
 * the program removes and prints the most urgent task. 
 * The quit command quits the program. 
 * Use a priority queue in your solution.
*/
public class ToDoList
{
    // Instance variable(s)
    private Queue<Task> theList = new PriorityQueue<>();

    int priority;
    String description;

    /**
     * Constructor
    */
    public ToDoList()
    {

    }

    /**
     * Display a menu and accepts commands.
     */
    public void run()
    {
        String option = "";
        System.out.println("To Do List - Please enter an option");
        System.out.println("     add priority description (add a new task)");
        System.out.println("     next (remove and print most urgent task)");
        System.out.println("     quit (exit this program)");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        
        do
        {
            System.out.print("> ");
            option = in.nextLine();
            if (option.startsWith("add"))
            {
                addTask(option);
            } else if (option.equals("next"))
            {
                nextTask();
            }
        } 
        while (! option.equals("quit"));
    }
    




    




    /**
     * Parse the add option line.
     *
     * @param optionStr the option line
    */
    public void addTask(String optionStr)
    {
        // optionStr format: "add priority description"
        // Example: "add 3 Do homework"
        int firstSpace = optionStr.indexOf(' ');
        int secondSpace = optionStr.indexOf(' ', firstSpace + 1);
        if (firstSpace == -1 || secondSpace == -1) {
            System.out.println("Expected: The priority must be an integer between 1 and 9.");
            return;
        }
        int priority = Integer.parseInt(optionStr.substring(firstSpace + 1, secondSpace));
        String description = optionStr.substring(secondSpace + 1);
        theList.add(new Task(priority, description));
    }







    /**
     * Get the next highest priority task and
     * display the description to the user.
    */
    public void nextTask()
    {
        Task next = null;
        int currentPriority = 9;
        
        // Complete this method
        for (Task t: theList)
        {
             if (t.getPriority() < currentPriority)
             {
                 currentPriority = t.getPriority();
                 next = t;
             }
        }

        
        
        
        if (next == null)
        {
            System.out.println("There are no tasks in the list.");
        } else
        {
            System.out.println(next.getDescription());
            theList.remove(next);
        }
    }
}