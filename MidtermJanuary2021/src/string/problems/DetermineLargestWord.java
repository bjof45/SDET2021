package string.problems;
// BR
import java.util.*;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        // System.out.println("Largest word and size: "+wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(wordGiven.split(" "))); // make array by splitting the sentence, hoping the words are seperated by single spaces
        int tempLength = 0;

        for(int i=0; i < words.size(); i++) {
            if(words.get(i).length() > tempLength) {
                tempLength = words.get(i).length();
                st = words.get(i);
            }
        }
        map.put(tempLength, st);
        return map;
    }
}
