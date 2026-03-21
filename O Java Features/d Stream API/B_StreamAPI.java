// WAP to get all even number in a ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B_StreamAPI
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(15);
        al2.add(20);
        al2.add(25);
        al2.add(30);
        al2.add(33);
        al2.add(40);
        al2.add(75);
        al2.add(39);

        System.out.println("--------------WAY 1 to print evan number using collections and simple logic------------");
        for(int i :al2)
        {
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("--------------WAY 2 to Using Stream API------------");
        Stream<Integer> st = al2.stream();
        List<Integer> l = st.filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(l);

        System.out.println("--------------WAY 3 to Using Stream API------------");
        Stream<Integer> st1 = al2.stream();
        st1.filter(e->e%2==0).forEach(e->System.out.println(e));

        System.out.println("--------------WAY 4 to Using Stream API------------");
        al2.stream().filter(e->e%2==0).forEach(e->System.out.println(e));

        System.out.println("--------------Count the evan number------------");
        System.out.println(al2.stream().filter(e->e%2==0).count());

        
    
    }
    
}

// Output:-

/*

--------------WAY 1 to print evan number using collections and simple logic------------
10
20
30
40
--------------WAY 2 to Using Stream API------------
[10, 20, 30, 40]
--------------WAY 3 to Using Stream API------------
10
20
30
40
--------------WAY 4 to Using Stream API------------
10
20
30
40
--------------Count the evan number------------
4

*/