package math.problems;
//BR
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int lowestDiff = findTheDiff(array1,array2);

        System.out.println("Lowest difference is: "+lowestDiff);
    }


    public static int findTheDiff(int[] a1, int[] a2) {
        int tempNumber1 = 0; // hold random numbs
        int lowDiff = 0; // hold actual lowest
        boolean lowDiffSet = false;

        for(int i=0; i < a1.length; i++)  {
            for(int k=0; k < a2.length; k++) {
                tempNumber1 = a1[i] - a2[k];
                if(tempNumber1 >= 0 && tempNumber1 < lowDiff || lowDiffSet == false) {
                    lowDiff = a1[i] - a2[k];
                    lowDiffSet = true;
                }
            }
        }
        return lowDiff;
    }
}
