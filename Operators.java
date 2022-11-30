public class Operators
{
    public static void main(String args[])
    {
        //Arithmetic Operators (Binary)
        int A = 10;
        int B = 5;
        System.out.println("Addition = " + (A+B));
        System.out.println("Subtraction = " + (A-B));
        System.out.println("Multiply = " + (A*B));
        System.out.println("Division = " + (A/B));
        System.out.println("Modulo = " + (A%B));

        //Arithmetic Operators (Unary)
        int a = 10;
        System.out.println("Post Increment = " + (a++));
        System.out.println("Post Decrement = " + (a--));
        System.out.println("Pre Increment = " + (++a));
        System.out.println("Pre Decrement = " + (--a));

        //Relational Operators
        System.out.println("Equal to? = " + (A==B));
        System.out.println("Not Equal to? = " + (A!=B));
        System.out.println("Greater than? = " + (A>B));
        System.out.println("Less than? = " + (A<B));
        System.out.println("Greater than or Equal to? = " + (A>=B));
        System.out.println("Less than or Equal to? = " + (A<=B));

        //Logical Operators
        System.out.println("Logical AND = " + ((3>2) && (5>0)));
        System.out.println("Logical OR = " + ((3>2) /*|| (5>0)*/));
        System.out.println("Logical NOT = " + (!(5>0)));

        //Assignment Operators
        A = A + B;
        System.out.println("Equal to = " + A);
        
        A += B;
        System.out.println("Plus Equal to = " + A);
        
        A -= B;
        System.out.println("Minus Equal to = " + A);
        
        A *= B;
        System.out.println("Multiply Equal to = " + A);
        
        A /= B;
        System.out.println("Divide Equal to = " + A);
    }
}