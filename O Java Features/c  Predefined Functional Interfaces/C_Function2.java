
import java.util.function.Function;

public class C_Function2
{
    public static void main(String[] args)
     {
        
        Function<String, String> f2 = str -> str.concat(" is a java developer..."); 

        System.out.println(f2.apply("Vishal"));
        System.out.println(f2.apply("Krishna"));

        Function<String, Integer> f22 = str -> str.length(); 

        System.out.println(f22.apply("Vishal"));
        System.out.println(f22.apply("Krishna"));



    }
}

// Output:-

/*

Vishal is a java developer...
Krishna is a java developer...
6
7

*/