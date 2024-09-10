package ArraysConcept;

import java.util.Scanner;

public class DuplicateArray {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter value : ");
        n = s.nextInt();


        int a[]=new int[n];
        // n={ 4, 1, 8, 4, 5, 3, 1,9 }   duplicate value : 4, 1


        for (int i = 0; i < n-1; i++)       // i mean index
        {
            System.out.println(" enter array of [" + i + "] value is : "); // index position --> array of [0] is 10 , array of [1] is 20
            a[i] = s.nextInt();  // ---> a[0] = 10  ,a[1] = 20  ,    a[2] = 30

        for(int j=i+1 ; j<n; j++)
        {
            if(a[i]==a[i])
            {
                System.out.println(a[i]);

            }


        }







    }
}
}