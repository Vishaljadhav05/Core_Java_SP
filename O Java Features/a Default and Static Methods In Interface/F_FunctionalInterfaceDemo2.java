@FunctionalInterface
interface V1 
{
    void method1();
}

@FunctionalInterface
interface V2 extends V1
{
    void method1(); //we can override

    // void method2(); // we Cannot create new method in functional interface
}


public class F_FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        
    }
}
