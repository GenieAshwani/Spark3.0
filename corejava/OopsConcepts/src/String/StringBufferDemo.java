package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abcd");
        StringBuffer newobject = sb.append("sddsd");
        System.out.println(newobject.hashCode());
        System.out.println(sb.hashCode());
    }
}
