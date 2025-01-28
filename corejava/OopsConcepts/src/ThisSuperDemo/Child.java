package ThisSuperDemo;

public class Child extends Parent{
    String name;

    int a=10;
    final int b=20;

    //parent k cheze use kro to = super
    //current class ----->this

    public static void main(String[] args) {
        Child c=new Child();
        c.details();
    }
    public void details()
    {
        a=12;

        super.name="Parent";
        this.name="Child";
        System.out.println(super.name+"    "+this.name);
        System.out.println("parent ka method ....");
        super.details();
    }

}
