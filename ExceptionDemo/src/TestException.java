import java.io.File;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        System.out.println("before exception");
        System.out.println("calculating....");
        try {
            System.out.println(" Still calculating....1");
            System.out.println(" Still calculating....2");
            System.out.println(" Still calculating....3");
            File file = new File("demo.tex");
            Scanner sc = new Scanner(file);
            System.out.println(" Still calculating....4");
            //System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("catch working....");
            System.out.println(e);
        }
        System.out.println("after calulation");
        System.out.println("ashwani");
        System.out.println("ashwani");
        System.out.println("ashwani");
        System.out.println("ashwani");
    }
}
