package ArraysConcept;

import java.util.Scanner;

public class ArrayConcepts {

    public static void main(String[] args) {


        //  1) simple assign print

       // int z[];  --->   decalarion
       // int y[] = new int[5];    --->  initialization




        int a[] = {10, 20, 30, 40, 50};   // (initialization & Declaration)

        System.out.println("value is :" +a[2]);

//  2) using to find length (total values )


        for(int j=0; j<a.length; j++)

        {
            System.out.println("length is :" +a[j]);
        }

// 3) for each

        for(int element : a)
        {
            System.out.println (element);
        }
//  --------------------------



        //  4) scanner

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter sacnner  n value : ");
        n = s.nextInt();

        int array[] = new int[n];

        for (int i = 0; i <n; i++)
        {
            System.out.println("Value at n " + n);
            array[i] = s.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Value at index " + array[i]);
        }


      //  4) scanner  before using for loop

        int n1[]= new int[10];

        for (int i = 0; i <10; i++)
        {
            Scanner s1 = new Scanner(System.in);
            System.out.println(" enter n1 value : ");
            n1[i] = s.nextInt();
        }

for( int element1 : n1)
{
            System.out.println("element value is :" +n);
        }



    }
}


