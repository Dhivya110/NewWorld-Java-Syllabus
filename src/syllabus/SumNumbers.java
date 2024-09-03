package syllabus;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        int n, avg, sum = 0, a;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter value : ");
        n = s.nextInt();

     /*

a= 2 , 8, 9, 6

sum = 0 + 2 = 2
sum = 2 + 8 = 10
sum = 10 + 9 = 19
sum = 19 + 6 = 25

      */

        for (int i = 1; i <= n; i++)
        {
            System.out.println("enter number :");
            a = s.nextInt();

            sum = sum + a;

        }
            avg = sum / n;
            System.out.println("sum value is :" + sum);
            System.out.println("avg value is :" + avg);

        }
    }


