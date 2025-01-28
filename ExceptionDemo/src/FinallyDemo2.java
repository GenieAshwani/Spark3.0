import java.security.KeyPair;

public class FinallyDemo2 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1()
    {
        try {
            System.out.println("try block");
            return;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Catch block");
        }
        finally {
            System.out.println("finally block");
        }
    }
}
