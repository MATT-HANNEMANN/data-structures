import java.util.Scanner;
import java.util.Stack;

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

    // "Mary had a little lamb" - "lamb little a had Mary"

    	
        Stack<String> ReverseSentence1 = new Stack<>();
        Stack<String> ReverseSentence2 = new Stack<>();



        



        String word = "";
        int sentenceMarker = 1;
       for (int i = 0; i < sentence.length(); i++)
        {

            if(sentence.charAt(i) != ' ') {
                word += sentence.charAt(i);}
      
            
               




                else 
                {
                    
                    if (sentenceMarker == 1) 
                       { ReverseSentence1.push(word);
                        word = "";}
           

              
                     else if (sentenceMarker == 2) 
                      { ReverseSentence2.push(word);
                        word = "";}

                }



                    if (sentence.charAt(i) != '.') 
                        {sentenceMarker = 2;}



           
           }






        }

        {
        String ReversedSentenceString = "";




        for (String aWord: ReverseSentence1) {
            ReversedSentenceString += aWord + " ";
        }

        ReversedSentenceString += ". ";

        for (String bWord: ReverseSentence2) {
            ReversedSentenceString += bWord + " ";}
        

        return ReversedSentenceString;
        

        //return "hello";

        //...






    }
