
import java.util.function.Supplier;

// Lottery :-

public class E_Supplier2
{
    public static void main(String[] args)
     {
        
        
        Supplier<String> s2 = () ->
        {
            String[] name = {"Vishal J" , "Vishal R", "Uday" , "Sakshi"};
            int i = (int) (Math.random()*4); // till 3 index
            return name[i];
        }; 

        System.out.println("First Job Cracked by : " + s2.get());

    }
}

// Output:-

/*

First Job Cracked by : Vishal R

*/