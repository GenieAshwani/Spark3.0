package DemoPro;

import ModifersDemo.ProtectedDemo;

public class ProtectedSubClass extends ProtectedDemo {
    public static void main(String[] args) {
        ProtectedDemo protectedDemo=new ProtectedDemo();
        //System.out.println(protectedDemo.msg);
        //System.out.println(msg);
    }

    public void showMsg()
    {
        System.out.println(msg);
    }
}
