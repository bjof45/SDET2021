package string.problems;
//BR
import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String word1 = "gainly";
        String word2 = "playin";

        if(isAnagram(word1,word2))
            System.out.println("Survey says that "+word1+" and "+word2+" is an anagram!");

        else
            System.out.println("Survey says that "+word1+" and "+word2+" isn't an anagram!");
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()) // automatically fail if the length isn't the same
            return false;

        if(str1.equals(str2))
            return false; // also auto fail if the strings are exact match before we do anything

        Map<String, Integer> m1 = findTheLargestWord(str1);
        Map<String, Integer> m2 = findTheLargestWord(str2);

        // Use TreeMap to sort out by key
        m1 = new TreeMap<String, Integer>(m1);
        m2 = new TreeMap<String, Integer>(m2);

        if(m1.equals(m2))
           return true;

        return false;
    }

    public static Map<String, Integer> findTheLargestWord(String wordGiven){
        Map<String, Integer> map = new HashMap<String, Integer>();
        String st = "";
        int tempLength = wordGiven.length();
        int tempNumber = 0;

        for(int i = 1; i <= tempLength; i++) {
            tempNumber = i-1;
            st = wordGiven.substring(tempNumber,i);
            if(map.containsKey(st)) {
                tempNumber = map.get(st);
                tempNumber++;
                map.put(st, tempNumber);
            }

            else {
                tempNumber = 1;
                map.put(st, tempNumber);
                tempNumber = 0;
            }
        }

        return map;
    }
}
