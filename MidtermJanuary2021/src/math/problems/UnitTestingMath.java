package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
       // Test factorial

        int result1 = math.problems.Factorial.factorialIteration(5);
        int result2 = math.problems.Factorial.factorialRecursion(5);

        Assert.assertEquals(result1, 120);
        Assert.assertEquals(result2, 120);

    // Test fibonacci

        String answer = "0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986,102334155";
        String programAnswer = math.problems.Fibonacci.createFibonacci(40);

        Assert.assertEquals(programAnswer,answer);

        //  Find the lowest diff
        int [] a1 = {30,12,5,9,2,20,33,1};
        int [] a2 = {18,25,41,47,17,36,14,19};

        Assert.assertEquals(math.problems.FindLowestDifference.findTheDiff(a1,a2), 1);

        // find the missing number
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        // we use the highest and lowest number from array to find this and from example you gave, 9 is missing

        Assert.assertEquals(math.problems.FindMissingNumber.findTheDiff(1,10,array),9);
    }
}
