
// Normal way

/* 
public class H_Thread1 implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Child Thread");
        }
        
    }

    public static void main(String[] args) {
        
        H_Thread1 ob = new H_Thread1();
        Thread t =new Thread(ob);
        t.start();

        System.out.println("Main Thread");
    }
}

*/


// USing lambda expression
public class H_Thread1 
{
    public void run()
    {
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Child Thread");
        }
        
    }

    public static void main(String[] args) {
        
        
        Thread t =new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
            }
        });
        t.start();

        Thread t2 =new Thread(()->  System.out.println("Child - 2 Thread") );
        t2.start();


        System.out.println("Main Thread");
    }
}


// output:-

/*

Child Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child - 2 Thread


*/