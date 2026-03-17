
interface I1
{
    public boolean test(int no);
}

class A implements I1
{
    public boolean test(int no)
    {
        return no%2 == 0;
    }
}

public class A_PredicateNot1 
{

    public static void main(String[] args) 
    {
        I1 i1 = new A();
        System.out.println(i1.test(20));

        I1 i11 = no -> no %2 ==0;
        System.out.println(i11.test(13));
    }
}

// Output:-

/*

true
false

*/