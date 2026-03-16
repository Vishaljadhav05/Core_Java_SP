@FunctionalInterface
interface I4 
{
    void m4(int a);
}

@FunctionalInterface
interface I44 
{
    void m44(int a,int b);
}

@FunctionalInterface
interface I444 
{
    void m44(String str);
}

public class D_Lambda4
{
    // Using Lambda Expressions
    public static void main(String[] args) 
    {
        I4 i4 = (a) ->  // If more than one statements then it is compulsory to write them in curly {} braces.
            {
                System.out.println("Using Lambda Expression.");
                System.out.println("Value of a : " + a);
            };

        i4.m4(8);

         I44 i44 = (a,b) ->  // If more than one statements then it is compulsory to write them in curly {} braces.
            {
                System.out.println("Using Lambda Expression.");
                System.out.println("Sum of a & b is : " + (a+b));
            };

        i44.m44(100,76);

        I444 i444 = (name) -> System.out.println(name.length());
        i444.m44("Vishal");
    }
}

// Output:-


/*

  Using Lambda Expression.
  Value of a : 8
  Using Lambda Expression.
  Sum of a & b is : 176
  6

 */