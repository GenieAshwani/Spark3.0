import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value...");
        int a=sc.nextInt();
        System.out.println("enter the second value");
        int b=sc.nextInt();
        int res = sum(a, b);
        System.out.println("result is = "+res);
        int div = div(a, b);
        System.out.println("div is = "+div);
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int div(int a,int b)
    {
        return a/b;
       /* try {
              int res=a/b;
              return res;
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            return 0;
        }*/
    }
}
