package Poly;

public class Test {
    public static void main(String[] args) {

        System.out.println("-----------parent----------");
        Wish w=new Wish();
        w.greet();
        System.out.println("------------child-----------");

        Notification n=new Notification();
        n.greet();

        System.out.println("--------------parent-child-----------");
        Wish w1=new Notification();
        w1.greet();


    }
}
