package TypesOfVar;

public class InstanceDemo {

    //jo var class under and methods k bahar
    String name="divya";  //instance
    public static void main(String[] args) {
        InstanceDemo ob1=new InstanceDemo();
        System.out.println(ob1.name);
        ob1.name="jagat";
        System.out.println(ob1.name);

        System.out.println("-----------------------------------");
        InstanceDemo ob2=new InstanceDemo();
        System.out.println(ob2.name);
        ob2.name="ram charan";
        System.out.println(ob2.name);
    }

}
