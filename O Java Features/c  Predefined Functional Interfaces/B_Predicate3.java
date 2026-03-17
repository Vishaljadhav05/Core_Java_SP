import java.util.function.Predicate;

public class B_Predicate3 
{
    public static void main(String[] args)
     {
        Predicate<String> p3 = pass -> pass.length() > 6;
        Predicate<String> p33 = pass -> pass.equals("admin@123");

        // System.out.println(p3.test("aaa@123"));  // true
        // System.out.println(p33.test("Vishal@---")); // false

        Predicate<String> p = p3.and(p33);  
        //  and means both condition must be true
        // Or means 1 condition true can lead to true output.
        System.out.println(p.test("admin@123"));
        System.out.println(p.test("admin@12345678"));


    }
}

// Output:-

/*

true
false

*/