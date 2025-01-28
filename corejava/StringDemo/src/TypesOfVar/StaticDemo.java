package TypesOfVar;

public class StaticDemo {
   static String name="divya"; //static-instance
    int a=10;
    public static void main(String[] args) {
        //StaticDemo ob1=new StaticDemo();
        System.out.println("before change.... ");
        System.out.println(StaticDemo.name);


        StaticDemo.name="raj";
        System.out.println("after update......");
        System.out.println(StaticDemo.name);


        System.out.println("---------------------------");
        //StaticDemo ob2=new StaticDemo();
        System.out.println("obj2 .....");
        System.out.println(StaticDemo.name);

        //System.out.println(a); // non-static // instance
    }

    public void m1()
    {

        System.out.println(name);
        System.out.println(a);
    }
}
