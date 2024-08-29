package syllabus;

import java.awt.*;

public class Operatores {

    public static void main(String[] args) {

        // Assignment   (+,-,*, /)
        int h = 20 , j=90;
        int s= h+j;
        int s1=h-j;
        int s2=h*j;
        int s3=h/j;

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // relational ( ==, != , > ,<)

        int a2=80 , b2=90;

        System.out.println(a2 == b2);
        System.out.println(a2 != b2);
        System.out.println(a2 > b2);
        System.out.println(a2 < b2);
        System.out.println(a2 >= b2);
        System.out.println(a2 <= b2);



        // logical ( && , || )

        int a3=80 , b3=90;

        System.out.println("Logical and : " + (a3< b3 && a3 < b3));
        System.out.println(" Logical or : " + (a3>b3 || a3 < b3));

        // Arithmetic

        int a = 2;

        System.out.println("int : " + a);

        a = a + 10;  // ---> a+=10;

        System.out.println("int : " + a);

        a *= 10;   // -->

        System.out.println("int : " + a);

        a /= 10;     // ---> quotient  (up)

        System.out.println("int : " + a);

        a %= 10;   //--->   remainder  (down)

        System.out.println("int : " + a);




        // Conditional / Ternary ( ? , : )

        int x = 10;
        int y = 45;

        int z=x>y?x:y;      //---> x :y   x = true statement   y = false statement
        System.out.println("conditional  value  : " +z);




// unary operator  ( ++ ,-- )

        int u = 55;

        System.out.println(u);     //  ---> o/p : 55

     /*     u++;    //  ---> u=u+1;    // -->  56   ---> this first view of increament

        System.out.println(u);   //  ---> o/p :  56

      */

         System.out.println(u++);          // ---> this is last view of increment

        System.out.println(u);

        System.out.println(++u);



        // bitwise operator (& , | , ^ , ~ )

        int a5 = 20 , b5 = 30 ;

        System.out.println( " and is : " + (a5 & b5 ));

        System.out.println( " OR is : " + (a5 | b5));

        System.out.println(" xor is : " + (a5 ^ b5) );

        System.out.println( " Not is : " + ( ~ b5) );



    }
}

