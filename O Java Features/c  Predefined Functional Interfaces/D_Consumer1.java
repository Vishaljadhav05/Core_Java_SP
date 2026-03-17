
import java.util.function.Consumer;

public class D_Consumer1
{
    public static void main(String[] args)
     {
        
        Consumer<String> c1 = str -> System.out.println("hii : " + str.concat("@gmail.com"));
        c1.accept("Vishal");
        c1.accept("Krishna");

    }
}

// Output:-

/*

hii : Vishal@gmail.com
hii : Krishna@gmail.com

*/