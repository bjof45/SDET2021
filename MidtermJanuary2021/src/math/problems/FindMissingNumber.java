package math.problems;
//BR
/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         int high = findHigh(array);
         int low = findLow(array,high);
         int tempNumber = low;


        System.out.println("We're missing "+findTheDiff(low,high,array));
    }

    public static int findTheDiff(int a, int b, int [] a1) {

        int tempNumber = a;

        for(int i=a; i < b; i++) {
            for(int j=0; j < a1.length; j++)
                if(a1[j] != i) {
                    tempNumber = i;
                }

        }
        return tempNumber;
    }
    public static int findHigh(int [] array) {
        int high = 0;

        for(int i=0; i < array.length; i++) {
            if (array[i] > high)
                high = array[i];
        }

        System.out.println("Highest number is: "+high);
        return high;
        }



    public static int findLow(int [] array, int help) {
        int low=help;

         for(int i=0; i < array.length; i++) {

             if(array[i] < low)
                 low = array[i];
         }
        System.out.println("Lowest number is: "+low);
         return low;
    }
}
