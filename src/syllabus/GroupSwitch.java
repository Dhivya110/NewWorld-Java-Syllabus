package syllabus;

import java.util.Scanner;

public class GroupSwitch
{
    public static void main(String[] args)
    {

      char n ;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter values : ");
        n = s.next().charAt(0);

        switch(n)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            System.out.println("vowels :" +n);
             break;

            default:
                System.out.println("consonants :" +n);
                break;

        }
   }
}
