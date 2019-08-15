import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class HangmanMaker
{
    private ArrayList <String> s;
    private Scanner in;
    
    public HangmanMaker() throws FileNotFoundException {
        s = new ArrayList <String>();
        in = new Scanner(new FileReader("Wordbank"));
    
        init();
    }

    private void init() {
    	while (in.hasNextLine()) {  
           s.add(in.nextLine().toUpperCase());
        } 
    	
    	Collections.shuffle(s);
    }

    public String getNext() {
        return s.remove(s.size()-1);
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }
}
