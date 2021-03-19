package string.problems;
// BR

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        double avgLength = 0;
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> wordOccurrences = findDuplicateWords(st);

        for(Map.Entry<String, Integer> word:wordOccurrences.entrySet()) {
            System.out.println("The word "+word.getKey()+" appeared "+word.getValue()+" times");
            avgLength = avgLength + word.getKey().length();
            System.out.println("Word length is: "+word.getKey().length());
        }
        avgLength = Math.ceil(avgLength / wordOccurrences.size());

        System.out.println("Average word length is: "+(int)avgLength+" (rounding up)");
    }


    public static Map<String, Integer> findDuplicateWords(String wordGiven) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String tempWord =  wordGiven.replaceAll("\\W+", " ").toLowerCase(); // replace each non-word character with a space, get the correct words and lowercase it, Java and java are different
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(tempWord.split(" "))); // make array by splitting the sentence, hoping the words are separated by single spaces
        int tempCount = 0;

    for(int i = 0; i < words.size(); i++) {
        if(map.containsKey(words.get(i))) {
            tempCount = map.get(words.get(i));
            tempCount = tempCount + 1;
            map.put(words.get(i), tempCount);
            tempCount = 0;
        }
        else {
            map.put(words.get(i), 1);
        }
    }
    return map;
    }

}
