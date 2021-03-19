package string.problems;
import org.testng.*;

import java.util.HashMap;
import java.util.Map;


public class UnitTestingStringProblem {
    public static void main(String[] args) {
       // test anagram

        boolean testAnagram = string.problems.Anagram.isAnagram("mom","omm");
        Assert.assertEquals(testAnagram,true);

    //test determine largest word
        String testDLW = string.problems.DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        Assert.assertEquals(testDLW,"10 biological");

        // test duplicate word
        Map<String, Integer> map = new HashMap<>();
        map.put("java",3);
        map.put("is", 3);
        map.put("language",2);

        Map<String,Integer> testDW = string.problems.DuplicateWord.findDuplicateWords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        Assert.assertEquals(map,testDW);

        // test palindrome

        boolean testPalindrome = string.problems.Palindrome.checkForPalindrome("mom");
        Assert.assertEquals(testPalindrome, true);

        System.out.println("If we made it here, we passed all of our checks!");

    }
}
