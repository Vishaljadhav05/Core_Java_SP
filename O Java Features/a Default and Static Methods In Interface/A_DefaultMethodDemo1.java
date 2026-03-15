
interface I1 {

    void show();
    // void disp(){ ------- }

    default void disp(){
        System.out.println("Display Method in interface.");
    }
}

class C1 implements I1 {

    @Override
    public void show() {
        System.out.print("Show Method in class."); 
    }
}

public class A_DefaultMethodDemo1 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.disp();
        c.show();
    }
}


//Output:-

/*

 Display Method in interface.
 Show Method in class.

*/