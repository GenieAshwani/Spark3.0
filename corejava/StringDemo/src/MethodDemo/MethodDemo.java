package MethodDemo;

public class MethodDemo {
    public static void main(String[] args) {

        print(); //calling
       int s= samose();
       System.out.println("samosa = "+s);
       display("raj");
       display("raj",21);

        int sum = sum(10, 10);
        System.out.println("sum of num = "+sum);


    }


    //method with no return and no para
    public static void print()
    {
        System.out.println("hello bhaiya....");
    }

    //with return and no para
    public static int samose()
    {
        return 2;
    }


    //method with no return and with one argu
    public static void display(String name) //parameter
    {
        System.out.println("Name of student = "+name);
    }

    public static void display(String name,int age) //parameter
    {
        System.out.println("Name of student = "+name);
        System.out.println("age of student = "+age);
    }

    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
}
