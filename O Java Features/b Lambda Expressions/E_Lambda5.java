
@FunctionalInterface
interface I5 
{
    void m5(int a);
}

@FunctionalInterface
interface I55 
{
    void m55(int a,int b);
}

public class E_Lambda5
{
    // Using Lambda Expressions
    public static void main(String[] args) 
    {
        I5 i5 = (a) ->  // If we have only one parameter then We can also remove curly braces from here.
            {
                System.out.println("Produuct : " + a*a);
            };

        i5.m5(8);

        I5 i55= a ->  System.out.println("Produuct : " + a*a);
        
        i55.m5(5);
     
        I55 i = (a,b) -> System.out.println("Product is: " + a*b); // If we have multiple parameters then we cannot remove curly braces.
        i.m55(18, 3);
    }
}

// Output:-


/*

  Produuct : 64
  Produuct : 25
  Product is: 54

 */