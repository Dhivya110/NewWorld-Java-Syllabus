package syllabus;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int  n,a, rem=0, rev=0;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter a value : ");
        a = s.nextInt();

        // 7, 4, 3, 9      ==>  9, 3, 4, 7

while(a>0) {
    rem = a % 10;     //  --> 9  3  4
    rev = rev * 10 + rem;   // 0*10 + 9 =9 ,  9*10 + 3 =  93 , 93*10 +4 =934
    a=a/10;  // 743  74

}
    System.out.println(" the reverse values : " + rev);


        }




    }
