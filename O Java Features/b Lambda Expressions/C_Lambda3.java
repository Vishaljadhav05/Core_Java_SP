@FunctionalInterface
interface I3 
{
    void m3();
}


public class C_Lambda3 
{
    // Using Lambda Expressions
    public static void main(String[] args) 
    {
        I3 i3 = () ->  // If more than one statements then it is compulsory to write them in curly {} braces.
            {
                System.out.println("Using Lambda Expression.");
                System.out.println("Multiple statements..");
            };

        i3.m3();
    }
}

//Output:-

/*

  Using Lambda Expression.
  Multiple statements..

 */
