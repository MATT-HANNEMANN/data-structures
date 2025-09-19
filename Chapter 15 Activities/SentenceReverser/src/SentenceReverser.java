import java.util.Scanner;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
        String[] sentences = sentence.split("\\.");
        String result = "";
        for (int i = 0; i < sentences.length; i++) {
            
            String s = sentences[i].trim();
            
            if (s.length() == 0) continue;
            String[] words = s.split(" ");
            
            for (int j = words.length - 1; j >= 0; j--) {
                result += words[j];
                if (j > 0) {
                    result += " ";
                }
            }
            result += ". ";
        }
        // Remove last space if present
        if (result.length() > 0 && result.charAt(result.length()-1) == ' ') {
            result = result.substring(0, result.length()-1);
        }
        return result;
    }
}