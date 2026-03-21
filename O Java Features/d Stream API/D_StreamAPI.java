// WAP to convert all the names to uppercase

import java.util.ArrayList;
import java.util.stream.Stream;

public class D_StreamAPI 
{
    public static void main(String[] args) {
        
        ArrayList<String> al4 = new ArrayList<>();

        al4.add("Vishal");
        al4.add("Uday");
        al4.add("Shivam");
        al4.add("Rohit");
        al4.add("Anuj");

        Stream<String> str1 = al4.stream();

        str1.map(e->e.toUpperCase()).forEach(e-> System.out.println(e));
    }
}

// Output:-

/*

VISHAL
UDAY
SHIVAM
ROHIT
ANUJ

*/