package syllabus;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

    int n, b ;
    Scanner s = new Scanner(System.in);


        System.out.println(" enter a table : ");
        b = s.nextInt();

        System.out.println(" enter a limit : ");
        n = s.nextInt();

            for (int i = 1; i <= n; i++) {

            System.out.println(b  +"x"  +i  +"="  +(b*i));
 //  3*6=18

            }

}
}
