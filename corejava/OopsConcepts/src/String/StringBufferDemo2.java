package String;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        String s1="ashwani";
        String s2=s1.concat("upadhyaya");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        StringBuffer sb1=new StringBuffer("ashwani");
        StringBuffer sb2 = sb1.append("aupadhyay");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1==sb2);

        StringBuilder stringBuilder=new StringBuilder("asasas");
        StringBuilder res = stringBuilder.append("wewewe");
        System.out.println(stringBuilder);
        System.out.println(res);
        System.out.println(res==stringBuilder);
    }
}
