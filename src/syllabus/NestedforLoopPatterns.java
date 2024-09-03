package syllabus;

import java.util.Scanner;

public class NestedforLoopPatterns {

    public static void main(String[] args) {

        int n, n1;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter value : ");
        n = s.nextInt();


        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j < n; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

    }
}


    // Tips:
/*

1. n'th value same -->  square
2. if intialize (i) value in (j) loop ---> traingle



 */