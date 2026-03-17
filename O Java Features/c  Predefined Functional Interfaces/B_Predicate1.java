import java.util.function.Predicate;

public class B_Predicate1 
{
    public static void main(String[] args)
     {
        Predicate<Integer> p = no -> no%2 == 0;
        System.out.println(p.test(20));
    }
}

// Output:-

/*

true

*/