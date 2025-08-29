import java.util.LinkedList;


/**
 * A test program to reverse the entries in a linked list.
*/
public class ReverseTester
{
    public static void main(String[] args)
    {
        LinkedList<String> employeeNames = new LinkedList<>();
        employeeNames.addLast("Dick");
        employeeNames.addLast("Harry");
        employeeNames.addLast("Romeo");
        employeeNames.addLast("Tom");

        System.out.println("BEFORE: " + employeeNames);
        ListUtil.reverse(employeeNames);
        System.out.println("AFTER:" + employeeNames);
        System.out.println("Expected: [Tom, Romeo, Harry, Dick]");
    }
}