
@FunctionalInterface
interface I6 
{
    int getLength(String name);
}

@FunctionalInterface
interface I66
{
    void m66(int a,int b);
}

public class F_Lambda6
{
    // Using Lambda Expressions
    public static void main(String[] args) 
    {
        I6 i6 = (name) ->  
            {
                int length = name.length();
                return length;
            };

        System.out.println("Length : " + i6.getLength("Vishal"));
        
        System.out.println("--------------------------");

        I6 i66 = (name) -> name.length(); // If we can return the value in one line then not need to write the return keyword.

        System.out.println("Length : " + i66.getLength("APJ Abdul Kalam"));
        
    }
}

// Output:-


/*

  Length : 6
  --------------------------
  Length : 15

 */