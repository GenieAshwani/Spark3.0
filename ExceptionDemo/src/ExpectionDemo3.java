import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExpectionDemo3 {
    public static void main(String[] args) throws FileNotFoundException {

        m1();
    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1");
            m2();
    }
    public static void m2() throws FileNotFoundException {
        System.out.println("m2");
            m3();

    }
    public static void m3() throws FileNotFoundException
    {
        System.out.println("m3");
        m4();
    }
    public static void m4() throws FileNotFoundException
    {
        System.out.println("m4");
       // throw new ArithmeticException("Zero Divide");
       // System.out.println(10/0);//runtime
        File file = new File("demo.tex");
        Scanner sc = new Scanner(file);
    }
}
