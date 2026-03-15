import java.io.Serializable;
import java.rmi.Remote;

public class D_MarkerInterfaceDemo1 implements Cloneable,Serializable, Remote // here Cloneable,Serializable, Remote interfae is marker interface
{
    public static void main(String[] args) {
        System.out.println("Marker Interface Implementing Class.");
    }
}

//Output:-

/*
   Marker Interface Implementing Class.
*/
