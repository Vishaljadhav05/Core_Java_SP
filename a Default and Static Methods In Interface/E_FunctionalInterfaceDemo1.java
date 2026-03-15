@FunctionalInterface // anotation for functional interface
interface FunctionalInterfaces // This interface is called as functional interface because it han only one interface.
{
    void FI();
}

@FunctionalInterface 
interface FunctionalInterfaces2  //Still functional interface after creating default and static method in it.
{
    void FI();

    default void FI2(){
        System.out.println("Default.");
    }
    static void FI3(){
        System.out.println("Default.");
    }
}

class B implements FunctionalInterfaces
{
    public void FI()
    {
        System.out.println("Functional Interface Implementaion.");
    }
}
public class E_FunctionalInterfaceDemo1 
{
    public static void main(String[] args) 
    {
        B b = new B();
        b.FI();
    }
}

//Output:-

/*

    Functional Interface Implementaion.

*/
