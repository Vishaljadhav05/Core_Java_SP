import java.util.function.Predicate;

public class B_Predicate2 
{
    public static void main(String[] args)
     {
        Predicate<String> p2 = str -> str.length() > 6;
        System.out.println(p2.test("aaa"));
        System.out.println(p2.test("Vishal Jadhav"));

    }
}

// Output:-

/*

false
true

*/