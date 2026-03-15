interface DbDriver 
{
    void getDriverClass();
    void getDriverUrl();

    public default void getDriverDetails() // If need we can override this default method in implemented class.
    {
        System.out.println("Driver Details :- ");
    }
    
}

class MySqlConnection implements DbDriver
{

    @Override
    public void getDriverClass() {
        System.out.println("com.mysql.jdbc.Driver");
    }

    @Override
    public void getDriverUrl() {
        System.out.println("jdbc:mysql://localhost:3306/db_demo");
    }
}

class OracleConnection implements DbDriver
{

    @Override
    public void getDriverClass() {
        System.out.println("oracle.jdbc.OracleDriver");
    }

    @Override
    public void getDriverUrl() {
       System.out.println("jdbc:oracle:this:@localhost:1521:xe");
    }

    public void getDriverDetails()
    {
        System.out.println("Oracle details:-");
    }

}
public class B_DefaultMethodDemo2 
{
    public static void main(String[] args) 
    {
        MySqlConnection msc = new MySqlConnection();
        msc.getDriverDetails();
        msc.getDriverClass();
        msc.getDriverUrl();

        System.out.println("-----------------------------------------");
        OracleConnection oc = new OracleConnection();
        oc.getDriverDetails();
        oc.getDriverClass();
        oc.getDriverUrl();
    }
}

//Output:-

/*

    Driver Details :- 
    com.mysql.jdbc.Driver
    jdbc:mysql://localhost:3306/db_demo
    -----------------------------------------
    Oracle details:-
    oracle.jdbc.OracleDriver
    jdbc:oracle:this:@localhost:1521:xe

 */