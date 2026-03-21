// Write a program to print the square of each number.

import java.util.ArrayList;
import java.util.stream.Stream;

public class C_StreamAPI
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);


        Stream<Integer> stream1 = al.stream();
        stream1.map(e->e*e).forEach(e-> System.out.println(e));
    }
}

// Output:-

/*

100
400
900
1600
2500

*/
