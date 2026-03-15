interface StaticInterface
{
    void m1();
    // We cannot use default with th static method
    static void show() // We were not able override the static method in implemented class
    {
        System.out.println("Static Interface : Show Method...");
    }
}

class A implements StaticInterface
{
    public void m1(){
        System.out.println("Implemented class.");
    }

    public void show() // It will be treated as different Method
    {
        System.out.println("class : Show Method...");
    }
}

public class C_StaticMethodDemo1 
{
    public static void main(String[] args) 
    {
        A a = new A();
        a.show();
        a.m1();
        a.show();
        StaticInterface.show(); // can be call with direct interface name.
    }
}

//Output:-

/*

    class : Show Method...
    Implemented class.
    class : Show Method...
    Static Interface : Show Method...

*/
