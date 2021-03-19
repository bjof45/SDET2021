package string.problems;

import java.util.ArrayList;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */


        execPermutation("ABC");
    }

    public static void execPermutation(String aWord) {
        ArrayList<String> letters = new ArrayList<String>();
        int tempNumber = 0;
        String tempWord = "";

        // fill our array with letters in the string
        for(int i=0; i < aWord.length(); i++)
            letters.add(aWord.substring(i,1+i));

        for(int i=0; i < letters.size(); i++) {
            tempNumber = i;
              tempWord = tempWord + letters.get(i);
            for(int j=0; j < letters.size(); j++) {
                if (j == tempNumber)
                    continue;

                tempWord = tempWord + letters.get(j);
            }
            System.out.println(tempWord);
            tempWord = "";

        }



    }



    }

