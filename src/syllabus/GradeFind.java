package syllabus;

import java.util.Scanner;

public class GradeFind
{
    public static void main(String[] args) {

        int grade;
        Scanner s= new Scanner(System.in);
        System.out.println("enter value :");
        grade = s.nextInt();

        // a = 90-100  , b=89-80 , c = 79-70 , d = >70

        if( grade >= 90 && grade <=100)
        {
            System.out.println("A grade is : " +grade);

        }
        else if (grade <=89 && grade >=80 )
        {
            System.out.println("B grade is : " +grade);
        }

        else if (grade <=79 && grade >=70 )
        {
            System.out.println("C grade is : " +grade);
        }

        else
        {
            System.out.println("D grade is");
        }

    }
    }



