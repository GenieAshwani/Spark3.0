package StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
      //how to create string object
        String s1=new String("raj"); //1st
        System.out.println(s1.hashCode());
        String s2=s1+"wewe";
        System.out.println(s2.hashCode());
    }
}
