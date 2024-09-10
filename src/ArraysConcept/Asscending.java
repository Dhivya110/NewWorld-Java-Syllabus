package ArraysConcept;

import java.util.Arrays;
import java.util.Scanner;

public class Asscending
{

    public static void main(String[] args) {

        int n,temp;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter value : ");
        n = s.nextInt();

        // n = 3, 5, 1, 8, 2   ---> o/p : 1, 2, 3,5, 8
       
        int a[]= new int[n];
        // [3, 5, 1, 8, 2 ] ---> single line print

        //  for each loop (used to print line by line ) , we can choose ( Arrays.toString )
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("before sort :" + Arrays.toString(a) );

          for(int i=0; i<n; i++)

        {
           for(int j=i+1 ; j<n; j++)
           {
             if(a[i] > a[j])
             {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;



             /*
             input : {2, 4, 1, 6, 2, 9, 5}

              First Pass (i = 0):

Compare arr[0] and arr[1]: 2 and 4 (no swap needed)
Compare arr[1] and arr[2]: 4 and 1 (swap needed, array becomes {2, 1, 4, 6, 2, 9, 5})
Compare arr[2] and arr[3]: 4 and 6 (no swap needed)
Compare arr[3] and arr[4]: 6 and 2 (swap needed, array becomes {2, 1, 4, 2, 6, 9, 5})
Compare arr[4] and arr[5]: 6 and 9 (no swap needed)
Compare arr[5] and arr[6]: 9 and 5 (swap needed, array becomes {2, 1, 4, 2, 6, 5, 9})
Second Pass (i = 1):

Compare arr[0] and arr[1]: 2 and 1 (swap needed, array becomes {1, 2, 4, 2, 6, 5, 9})
Compare arr[1] and arr[2]: 2 and 4 (no swap needed)
Compare arr[2] and arr[3]: 4 and 2 (swap needed, array becomes {1, 2, 2, 4, 6, 5, 9})
Compare arr[3] and arr[4]: 4 and 6 (no swap needed)
Compare arr[4] and arr[5]: 6 and 5 (swap needed, array becomes {1, 2, 2, 4, 5, 6, 9})
Third Pass (i = 2):

Compare arr[0] and arr[1]: 1 and 2 (no swap needed)
Compare arr[1] and arr[2]: 2 and 2 (no swap needed)
Compare arr[2] and arr[3]: 2 and 4 (no swap needed)
Compare arr[3] and arr[4]: 4 and 5 (no swap needed)
Fourth Pass (i = 3):

Compare arr[0] and arr[1]: 1 and 2 (no swap needed)
Compare arr[1] and arr[2]: 2 and 2 (no swap needed)
Compare arr[2] and arr[3]: 2 and 4 (no swap needed)
Fifth Pass (i = 4):

Compare arr[0] and arr[1]: 1 and 2 (no swap needed)
Compare arr[1] and arr[2]: 2 and 2 (no swap needed)
Sixth Pass (i = 5):

Compare arr[0] and arr[1]: 1 and 2 (no swap needed)
At the end of these passes, the array is sorted: {1, 2, 2, 4, 5, 6, 9}.



             */




             }

           }
        }


        System.out.println("After sort :" + Arrays.toString(a) );


    }
}