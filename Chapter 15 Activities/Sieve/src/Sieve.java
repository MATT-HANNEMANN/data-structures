import java.util.ArrayList;
import java.util.Scanner;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();


        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++)
        {
            numbers.add(i);
        }
        
        System.out.println(numbers);


        // Make a set increasing by 2 going all the way to n

        // Erase all multiples of 2

        // Erase all multiples of 3

        // implement the solution in the sieve class

        // test with 50, 100, 150


    }
}