package syllabus;

import java.util.Scanner;

// married = eligible , unmaried - male - 35 age = eligible , maried - female - 25 age = eligible

public class InsuranceFind {
    public static void main(String[] args) {

        String category;
        Scanner s = new Scanner(System.in);
        System.out.println("enter category :");
        category = s.next();


        if (category.equalsIgnoreCase( "unmarried"))
        {
            String gender;
            int age;

            System.out.println("enter gender :");
            gender = s.next();

            System.out.println("enter age :");
            age = s.nextInt();

            if (gender.equalsIgnoreCase( "male" )  && age >= 35) {
                System.out.println(" eligible for insurance : ");

            } else if (gender .equalsIgnoreCase( "female")  && age >= 25) {
                System.out.println(" eligible for insurance : ");

            } else {
                System.out.println(" Not eligible for insurance : ");
            }
        }

        else if (category.equalsIgnoreCase( "married"))
        {
            System.out.println(" eligible for insurance : " + category);
        }
        else
        {
            System.out.println("invalid");
        }

    } }




/* {   if char using :

        char category;
        Scanner s = new Scanner(System.in);
        System.out.println("enter category :");
        category = s.next().charAt(0);
     */

       /*

        if (category == 'a')
        {

            char gender;
            int age;

            System.out.println("enter gender :");
            gender = s.next.charAt(0);

            System.out.println("enter age :");
            age = s.nextInt();

            if (gender == 'm'  && age >= 35) {
                System.out.println(" eligible for insurance : ");

            } else if (gender == 'f'  && age >= 25) {
                System.out.println(" eligible for insurance : ");

            } else {
                System.out.println(" Not eligible for insurance : ");
            }
        }

        else if (category == married )
        {
            System.out.println(" eligible for insurance : " + category);
        }
        else
        {
            System.out.println("invalid");
        }

    } }

         */

