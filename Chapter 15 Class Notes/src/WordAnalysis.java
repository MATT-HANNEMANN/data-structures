import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        // Determine the current working directory
        //System.out.println(System.getProperty("user.dir"));


        //Read the dictionary file and the novel file
        Set<String> dictionaryWord = readWords("words");
        Set<String> novelWord = readWords("war-and-peace.txt");

        // Print all the words that are in the novel but not in the dictionary
        for (String word : novelWord) {
            if (!dictionaryWord.contains(word)) {
                System.out.println(word);}
        }

        // Print the number of unique words in the novel
        System.out.println("There are " + novelWord.size() + " unique words in the novel.");

        // Print the number of uniquq words with >3 letter
        Iterator<String> iterator = novelWord.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length() <= 3){
                iterator.remove();
            }
        }
        System.out.println("There are " + novelWord.size() + " unique words with more than 3 letters");
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        // We use a HashSet instead of a TreeSet because the order
        Set<String> words = new HashSet<>();

        Scanner in = new Scanner(new File(filename), "UTF-8");

        // Use any character that is not a letter as a delimiter
        in.useDelimiter("[^a-zA-Z]+");

        while (in.hasNext()) {
            // Add words to the set (duplicates are automatically ignored)
            words.add(in.next().toLowerCase());
        }

        return words;


    }
}
