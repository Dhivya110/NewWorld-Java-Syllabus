package ArraysConcept;

import java.util.Arrays;


public class SpecificIndexArray {

    public static void main(String[] args) {

        int a[]= {20, 40, 10, 50, 70};
        int index =1;
        int value = 56;

        System.out.println("before insert" +Arrays.toString(a));

        for(int i=a.length-1; i>index; i--)
        {
            a[i]=a[i-1];
        }
a[index]=value;

        System.out.println("after insert" +Arrays.toString(a));

    }
}