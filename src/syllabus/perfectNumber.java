package syllabus;

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {

        int n, a , c=0 ;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter a value : ");
        n = s.nextInt();
/*
        8  % 1 = 0 (so, 1 is a divisor)
        8  % 2 = 0 (so, 2 is a divisor)
        8  % 3 = 2 (so, 3 is not a divisor)
        8  % 4 = 0 (so, 4 is a divisor)
        8  % 5 = 3  (so, 5 is not a divisor)
        8  % 6 = 2  (so, 6 is not a divisor)
        8  % 7 = 1  (so, 7 is not a divisor)
        8  % 8 = 0 (so,  8 is  a divisor)  but not take

      NOTE : perfect number will be : 6 only
*/

        // n = 8 ===>   ( 1, 2, 4, 8)
        // n =  1+ 2 + 4  ===>  o/p : 7 ( not perfect)

        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i);

                c=c+i;
            }

        }

        if(c==n) {
            System.out.println(n+ " perfect ");
        }

        else {

            System.out.println(n+ " im perfect" );
        }

    }
}