package ModifersDemo;

public class PublicDemo {

    public String name="Abhishek";
    public static void main(String[] args) {
        PublicDemo publicDemo=new PublicDemo();
        System.out.println(publicDemo.name);
    }

    public void printName()
    {
        System.out.println(name);
    }
}
