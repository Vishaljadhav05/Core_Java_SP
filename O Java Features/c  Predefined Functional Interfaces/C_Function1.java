import java.util.function.Function;

public class C_Function1
{
    public static void main(String[] args)
     {
        
        Function<Integer,Integer> f1 = sal -> sal*12; 

        System.out.println(f1.apply(10000) + " lpa");
        System.out.println(f1.apply(40000) + " lpa");


    }
}

// Output:-

/*

120000 lpa
480000 lpa

*/