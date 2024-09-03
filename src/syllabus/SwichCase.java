package syllabus;

import java.util.Scanner;

public class SwichCase {


    //  switch

    public static void main(String[] args) {

        int sum, a, b, c;

        Scanner s = new Scanner(System.in);
        System.out.println(" enter values : ");
        System.out.println(" addition");
        System.out.println(" subtraction");
        System.out.println(" multiplication");
        System.out.println(" division");

        sum = s.nextInt();

        System.out.println("Enter two numbers: ");
        a = s.nextInt();
        b = s.nextInt();

        switch (sum) {
            case 1:
            {
                c = a + b;
                System.out.println("addition :" + c);
                break;
        }

            case 2: {
                c = a - b;
                System.out.println("subtraction :" +c);
                break;
            }

            case 3: {
                c = a / b;
                System.out.println("multiplication :" +c);
                break;
            }


            case 4: {
                c = a % b;
                System.out.println("division :" +c);
                break;
            }


            default: {
                System.out.println("invalid");
            }
        }
    }
}


/*

        String Country;
        int sum;

        Scanner s = new Scanner(System.in);
        System.out.println("enter values : ");
        switch("Country")

        {
            case "india" :
            {
                System.out.println("country is 1");
                break;
            }

            case "canada" :
            {
                System.out.println("country is 2");
                break;
            }

            case "japan" :
            {
                System.out.println("country is 3");
                break;
            }

            default:
            {
                System.out.println("invalid");
            }
        }


    }
    */



