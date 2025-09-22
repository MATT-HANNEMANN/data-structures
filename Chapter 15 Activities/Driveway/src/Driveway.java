import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        driveway = new Stack<>();
        street = new Stack<>();
    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        driveway.push(licensePlate);
    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Find the index of the license plate in the driveway
        int index = -1;
        for (int i = driveway.size() - 1; i >= 0; i--) 
        {
            if (driveway.get(i) == licensePlate) 
            {index = i;break;}
        }

        // If not found, do nothing
        if (index == -1) return;
        
          // Move cars above the target to the street
          while (driveway.size() - 1 > index) 
          {
              int car = driveway.remove(driveway.size() - 1);
              street.push(car);
          }

          // Remove the target car
          driveway.remove(driveway.size() - 1);

          // Move cars back from street to driveway
          while (!street.isEmpty()) 
            {driveway.push(street.remove(street.size() - 1));}
      }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        for (int i = driveway.size() - 1; i >= 0; i--) 
          {System.out.println(driveway.get(i));}

          
        System.out.println("In Street, starting at first in (one license plate per line):");


        for (int i = street.size() - 1; i >= 0; i--) 
          {System.out.println(street.get(i));}
    }
}
