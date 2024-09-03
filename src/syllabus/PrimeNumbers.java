package syllabus;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        int n, a ;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter a value : ");
        n = s.nextInt();

        int f=0;
        // a= 7 ---> 1, 7,  ---> prime
        // a=9  ---> 1,9, 3, 6  ---> not prime

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f++;
            }
        }
            if(f==2)
            {
            System.out.println(" prime : ");

        }
            else
        {
            System.out.println(" not prime : ");

        }


    }
}




