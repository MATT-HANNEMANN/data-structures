import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        Map<String, Color> favColors = new HashMap<>();

        favColors.put("Sreeram", Color.GREEN);
        favColors.put("Cam", Color.BLUE);
        favColors.put("Nimai", Color.RED);

        // Two different elements with the same value
        favColors.put("Kaitlyn", Color.GREEN);

        // The same key CANNOT have 2 different values
        // Using put on a key that exists, changes the value
        favColors.put("Cam", Color.ORANGE);

        // Create a set of keys ina a map
        Set<String> keys = favColors.keySet();
        for (String key: keys) {
            // [name] ([hashCode]): [color]
            System.out.println(key + "(" + key.hashCode() + "): " + favColors.get(key));
        }



    }
}
