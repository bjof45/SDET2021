package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
       // Test factorial

        int result1 = math.problems.Factorial.factorialIteration(5);
        int result2 = math.problems.Factorial.factorialRecursion(5);

        Assert.assertEquals(result1, 120);
        Assert.assertEquals(result2, 120);




    }
}
