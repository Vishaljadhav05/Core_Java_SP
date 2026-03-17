
import java.util.function.Supplier;

public class E_Supplier1
{
    public static void main(String[] args)
     {
        double a =Math.random(); // It will provide any random value between 0-1
        System.out.println(a);
        
        Supplier<Integer> s1 = () ->(int)(Math.random()*100); // It will provide any random value between 0-100

        System.out.println(s1.get());

    }
}

// Output:-

/*

0.8372533816440056
18

*/