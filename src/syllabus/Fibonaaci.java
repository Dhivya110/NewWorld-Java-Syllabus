package syllabus;

import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {

        int a, b, n, c=1, temp=0;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter  value : ");
        n = s.nextInt();


        /*

0 (F(0))
1 (F(1))
1 (F(2) = F(1) + F(0))
2 (F(3) = F(2) + F(1))
3 (F(4) = F(3) + F(2))
5 (F(5) = F(4) + F(3))
8 (F(6) = F(5) + F(4))

 */     System.out.println(" enter a value : ");
        a = s.nextInt();

        System.out.println(" enter b value : ");
        b = s.nextInt();

        System.out.println(" number a is :" + a);
        System.out.println(" number b is :" + b);

        for(int i=1; i<=n ; i++)

          {
           c=a+b;
           System.out.println(" number c is :" + c);

           a=b;      // --> c= 0+1=1  , (  ==> c +b = 1+1=2  ) , c =

           b=c;


       }
}

    }


/*enter a value :
5
 enter a value :
2
 enter b value :
3
 number a is :2
 number b is :3
 number c is :5
 number c is :8
 number c is :13
 number c is :21
 number c is :34
*/