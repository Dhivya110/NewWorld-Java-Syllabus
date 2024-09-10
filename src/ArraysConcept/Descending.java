package ArraysConcept;

import java.util.Arrays;

public class Descending {

    public static void main(String[] args) {

        int temp;
        int a[]= new int[]{2,1,5,9,3,7};     //  (Using  predefined  input}


        System.out.println("before sort :" + Arrays.toString(a) );

        for(int i=0; i<a.length; i++)

        {
            for(int j=i+1 ; j<a.length; j++)
            {
                if(a[i] < a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }
        }


        System.out.println("After sort :" + Arrays.toString(a) );


    }
}




