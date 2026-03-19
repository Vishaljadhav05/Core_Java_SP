// How to get Stream Instance

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_StreamAPI1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println("--------------WAY 1 to get Stream Instance------------");
        Stream<Integer> st = al.stream();
        // System.out.println(st); // java.util.stream.ReferencePipeline$Head@47fd17e3
        st.forEach(e->System.out.println(e));

        System.out.println("--------------WAY 2 to get Stream Instance------------");
        Stream<Object> s2 = Stream.of(al);
        s2.forEach(e-> System.out.println(e));


        System.out.println("--------------WAY 3 to get Stream Instance------------");
        Stream<Integer> s3 = Stream.of(100,200,300,400,500);
        s3.forEach(e-> System.out.println(e));

        Stream<String> s4 = Stream.of("Ram","Shyam","Dinesh","Amar");
        s4.forEach(e-> System.out.println(e));

        System.out.println("--------------WAY 4 to get Stream Instance------------");
        int[] arr = {85,545,4,54,64};
        IntStream s5 = Arrays.stream(arr);
        s5.forEach(e -> System.out.println(e));


        System.out.println("--------------WAY 5 to get Empty Stream Instance------------");
        Stream<Object> s6 =  Stream.empty();
        s6.forEach(e -> System.out.println(e));

        System.out.println("--------------WAY 6 to get Stream Instance------------");
        Stream<Object> s7 = Stream.builder().build();
        s7.forEach(e -> System.out.println(e));
    }
    
}

// Output:-

/*

--------------WAY 1 to get Stream Instance------------
10
20
30
40
50
--------------WAY 2 to get Stream Instance------------
[10, 20, 30, 40, 50]
--------------WAY 3 to get Stream Instance------------
100
200
300
400
500
Ram
Shyam
Dinesh
Amar
--------------WAY 4 to get Stream Instance------------
85
545
4
54
64
--------------WAY 5 to get Empty Stream Instance------------
--------------WAY 6 to get Stream Instance------------

*/