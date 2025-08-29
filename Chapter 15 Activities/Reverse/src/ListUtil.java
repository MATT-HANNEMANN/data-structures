import java.util.LinkedList;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        LinkedList<String> TemporaryNames = new LinkedList();

        int x = 3;
        while (x >= 0)
            {TemporaryNames.addLast(strings.get(x));     x--;}

        strings.clear();
        strings.addAll(TemporaryNames);
    }
}