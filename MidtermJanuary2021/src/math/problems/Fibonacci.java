package math.problems;
//BR
public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
System.out.println(createFibonacci(40));


    }
    // ArrayList<Integer>
    public static String createFibonacci(int count) {
        int tempCount = 1; // we automatically start out with 0,1 , wasn't sure if we counted those or not?
        int tempNumber1 = 0;
        int tempNumber2 = 1;
        int tempNumber3 = 0;
        String tempString = "";
        tempNumber3 = tempNumber1+tempNumber2;
        tempString = tempString + tempNumber1+","+tempNumber2+","+tempNumber3;

        do {

            tempCount++;

            if(tempCount != count) {
                tempString = tempString+",";
            }
            else
                 break;

            tempNumber1 = tempNumber2;
            tempNumber2 = tempNumber3;
            tempNumber3 = tempNumber1+tempNumber2;
            tempString = tempString+tempNumber3;

        } while(tempCount <= count);
    return tempString;
    }

}
