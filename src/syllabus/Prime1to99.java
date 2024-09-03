package syllabus;

import java.util.Scanner;

public class Prime1to99 {

    public static void main(String[] args) {

        int n, a ,b ;
        Scanner s = new Scanner(System.in);

        System.out.println(" enter a value : ");
        a = s.nextInt();

        System.out.println(" enter b value : ");
        b = s.nextInt();


        int f = 0;

        // n = 1 to 18  --> o/p : 2,3,5,7,11,13,15,17

        // a= 11  , b= 22  ---> o/p : 11, 13, 17, 19
           for( n=a; n<=b; n++)      //---> (n=1 ; n<=99 ; n++) --> without using a, b input
           {
            for ( int i = 1; i <= n; i++) {

                if (n % i == 0)
                {
                    f++;
                }
            }

            if (f == 2)
            {
                System.out.println( " prime value is : " +n);

            }
            f=0;
        }
    }
}