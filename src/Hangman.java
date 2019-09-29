import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * A class representing a Hangman object
 * @author robinsal
 *
 */
public class Hangman
{
    private ArrayList <String> wordList;
    private Scanner in;
    
    public Hangman() throws FileNotFoundException {
        wordList = new ArrayList <String>();
        
        try {
        	in = new Scanner(new FileReader("Wordbank"));
        } catch (FileNotFoundException e) {
        	in = new Scanner(new FileReader("../Wordbank"));
        }
        init();
    }

    /**
     * adds all words from the word bank to an ArrayList and shuffles the list
     */
    private void init() {
    	while (in.hasNextLine()) {  
           wordList.add(in.nextLine().toUpperCase());
        } 
    	
    	Collections.shuffle(wordList);
    }

    /**
     * 
     * @return the next element from the word list
     */
    public String getNext() {
        return wordList.remove(wordList.size()-1);
    }

    /**
     * 
     * @return true if list is empty
     */
    public boolean isEmpty() {
        return wordList.isEmpty();
    }
}
