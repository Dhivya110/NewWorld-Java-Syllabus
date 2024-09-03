package syllabus;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year , year1, year2   ;

        Scanner s = new Scanner(System.in);

        System.out.println("enter value : ");
        year = s.nextInt();

        System.out.println("enter value : ");
        year1 = s.nextInt();

        System.out.println("enter value : ");
        year2 = s.nextInt();

        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("leap year :" + year);
        } else {
            System.out.println("notleap year :" + year);
        }

        if (year1 % 4 == 0 || year1 % 100 == 0 && year1 % 400 == 0) {
            System.out.println("leap year :" + year1);
        } else {
            System.out.println("notleap year :" + year1);
        }

        if (year1 % 4 == 0 || year1 % 100 == 0 && year2 % 400 == 0) {
            System.out.println("leap year :" + year2);
        } else {
            System.out.println("notleap year :" + year2);
        }


    }
}
