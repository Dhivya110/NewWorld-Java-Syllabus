package syllabus;

public class TypeCasting {

    public static void main(String[] args) {

        // 1) Widening ( byte to long )


        int a = 10;
        double b = a;

 System.out.println("int :" +a);

        System.out.println("double :" +b);




       //  2) Narrowing ( long to byte )


     double d = 20.6;
     int c = (int) d ;

        System.out.println("double :" +d);

        System.out.println("int :" +c);


}
}
