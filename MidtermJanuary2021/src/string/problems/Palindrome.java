package string.problems;
// BR

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String ourString = "davad";
        boolean isIt = checkForPalindrome(ourString);

        if(isIt) {
            System.out.println("Palindrome alert! - "+ourString.toLowerCase());
        }

    }

    public static boolean checkForPalindrome(String aWord) {
        int tempLength = aWord.length();
        int j = tempLength;
        aWord = aWord.toLowerCase();
        String stringTwo = "";

        for(int i = 1; i <= tempLength; i++) {
            stringTwo = stringTwo + aWord.substring(tempLength-i,j);
            j--;
        }

       if(aWord.equals(stringTwo))
           return true;

        return false;
    }
}
