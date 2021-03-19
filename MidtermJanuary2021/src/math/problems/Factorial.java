package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
//BR
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int result = factorialIteration(5);
        int result2 = factorialRecursion(5);

        System.out.println("Iteration = "+result);
        System.out.println("Recursion = "+result2);
    }

    public static int factorialIteration(int number) {
        int tempNumber = 1;

        for(int i=1;i <= number; i++)
            tempNumber = tempNumber * i;

        return tempNumber;
    }

    public static int factorialRecursion(int number) {

        if(number == 0) {
            return 1;
        }
        else {
            return number*factorialRecursion(number-1);

        }
    }

}
