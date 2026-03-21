// WAP to sort the Strings

import java.util.ArrayList;
import java.util.stream.Stream;

public class E_StreamAPI 
{
    public static void main(String[] args) {
        
        ArrayList<String> al5 = new ArrayList<>();

        al5.add("Vishal");
        al5.add("Uday");
        al5.add("Shivam");
        al5.add("Rohit");
        al5.add("Anuj");

        Stream<String> stream5 = al5.stream();

        // stream5.sorted().forEach(e->System.out.println(e));

        stream5.sorted((x,y)-> -x.compareTo(y)).forEach(e->System.out.println(e));
    }
}

// Output:-

/*

// Ascending Order
// stream5.sorted().forEach(e->System.out.println(e));

Anuj
Rohit
Shivam
Uday
Vishal


// Descending Order
// stream5.sorted((x,y)-> -x.compareTo(y)).forEach(e->System.out.println(e));

Vishal
Uday
Shivam
Rohit
Anuj

*/