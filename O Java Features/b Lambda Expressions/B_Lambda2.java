@FunctionalInterface
interface I2 
{
    void m2();
}

// class A implements I2
// {
//     public void m2(){
//         System.out.println("In class A....");
//     }
// }

public class B_Lambda2 
{
    // Using Lambda Expressions
    public static void main(String[] args) 
    {
        I2 i2 = () -> System.out.println("Using Lambda Expression.");
        i2.m2();
    }
}

//Output:-

/* 

     Using Lambda Expression.

*/