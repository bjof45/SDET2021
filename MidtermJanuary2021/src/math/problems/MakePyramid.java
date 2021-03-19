package math.problems;
//BR
public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        for(int i=1; i <= 6; i++) {
            for(int k=i; k <= 6; k++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println("");
        }
    }
  }
