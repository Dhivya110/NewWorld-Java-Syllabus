package syllabus;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int fact = 1, num1;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter value : ");
        num1 = s.nextInt();

        //  for (int i = num1; i > 0; i--)

        for (int i= 1 ; i <= num1; i++)
        {
            fact = fact * i;


            /*
            5! = 5 * 4 * 3 * 2 * 1 = 120.

            fact = 1 * 1 = 1
            fact = 1 * 2 = 2
            fact = 2 * 3 = 6
            fact = 6 * 4 = 24
            fact = 24 * 5 = 120
            */

           }
        System.out.println("fact values :" + fact);

    }

}


