import java.io.File;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        System.out.println("before exception");
        System.out.println("calculating....");
        File  file =new File("demo.tex");
        Scanner sc=new Scanner(file);
        System.out.println(10/0); //AE--runtime
        System.out.println("after calulation");
        System.out.println("ashwani");
        System.out.println("ashwani");
        System.out.println("ashwani");
        System.out.println("ashwani");
    }
}
