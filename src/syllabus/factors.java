package syllabus;

import java.util.Scanner;

public class factors {

    public static void main(String[] args) {

        int n, a, b, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter a value : ");
        n = s.nextInt();

        // a =  1,2, 3, 4, 5, 6, 7, 8  (8 numbers should ) ;    -->  1,8 = 1 , 2,8 =0  3, 8 =1 , 4,8 =0  5,8 =1
        //  o/p : 8,2,4,6 ,1,2
        // (if i use 5 , should comes 5 numbers)


        /*

        5  / 1 = 0 (so, 1 is a divisor)
        5  / 2 = 2 (so, 2 is a divisor)
        5  / 3 = 1 (so, 3 is not a divisor)
        5  / 4 = 1 (so, 4 is a divisor)
        5  / 5 = 0 (so, 5 is not a divisor)

        */

        for (int i = 1; i <= n; i++) {

            if (n % i == 0)
            {
               System.out.println("  value is : " + i);
            }
        }
    }
}

