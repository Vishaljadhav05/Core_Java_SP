@FunctionalInterface
interface II1 
{
    void m1();
}

// class A implements I1
// {
//     public void m1(){
//         System.out.println("In class A....");
//     }
// }

public class A_Lambda1 
{
    // Old approaach
    /* 

    public static void main(String[] args) 
    {
        A ob = new A();
        ob.m1();
    }

    */

    // Using Anonymous class
    public static void main(String[] args) 
    {
        II1 i1 = new II1() { // In Backend a anonymous class is created.
            public void m1()
            {
                System.out.println("Using Anonymous class.");
            }
        }; 

        i1.m1();
    }
}

//Output:-

/*

    Using Anonymous class.

*/ 
