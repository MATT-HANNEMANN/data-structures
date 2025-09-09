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



         System.out.println(); ////////////////////////////////////////////////////////////////////////////////////////////



        ArrayList<Integer> numbers = new ArrayList<Integer>(); //used for the multiples





        for (int i = 2; i <= n; i++)
            {numbers.add(i);}
        
        System.out.println("ORIGINAL SET: " + numbers);




         System.out.println(); ////////////////////////////////////////////////////////////////////////////////////////////




        ArrayList<Integer> multiplesOf2 = new ArrayList<Integer>(numbers);
        for (int i = 0; i < multiplesOf2.size(); i++)
            { if (multiplesOf2.get(i) % 2 == 0) {multiplesOf2.remove(i);} }

        System.out.println("Removed Multiples of 2: " + multiplesOf2);

        


         System.out.println(); ////////////////////////////////////////////////////////////////////////////////////////////



        
        ArrayList<Integer> multiplesOf3 = new ArrayList<Integer>(numbers);
        for (int i = 0; i < multiplesOf3.size(); i++)
            { if (multiplesOf3.get(i) % 3 == 0) {multiplesOf3.remove(i);} }

        System.out.println("Removed Multiples of 3: " + multiplesOf3);
        
        


         System.out.println(); ////////////////////////////////////////////////////////////////////////////////////////////




        ArrayList<Integer> solution = new ArrayList<Integer>(); 
        
        for (int i = 0; i < solution.size(); i++)
            { if (solution.get(i) % 2 == 0 || solution.get(i) % 3 == 0) {solution.remove(i); i--;} }

        System.out.println("Solution: " + solution);


    }
}