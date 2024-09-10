package ArraysConcept;

import java.util.Scanner;

public class OddEvenArrayNum {


    public static void main(String[] args) {

        int n, e = 0, o=0 ;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter value : ");
        n = s.nextInt();               //  n ---> size , a ----> array

        int a[] = new int[n];

        for (int i = 0; i < n; i++)       // i mean index
        {
         System.out.println(" enter array of [" + i + "] value is : "); // index position --> array of [0] is 10 , array of [1] is 20
         a[i] = s.nextInt();  // ---> a[0] = 10  ,a[1] = 20  ,    a[2] = 30
                                   
        }


        for (int element : a)
        {
            if (element % 2 == 0) {
                e++;
                System.out.println(" find even number " + element);

            } else {
                o++;
                System.out.println(" find ddd number " + element);
            }
        }
        System.out.println(" total even number " +e);
        System.out.println(" total even number " +o);

    }
}