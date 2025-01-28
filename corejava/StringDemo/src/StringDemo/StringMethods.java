package StringDemo;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //length
        String s="ashwani genie";
        System.out.println(s.length());

        //concatenation
        String s1="ashwani";
        String s2="upadhayay";
        String s3=s1+" "+s2;
        System.out.println(s3);

        //String to char
        String s4="Ashwani";
        char[] arr = s4.toCharArray();
        System.out.println("to char array="+ Arrays.toString(arr));

        //charAt
        String s11="leela";
        System.out.println("chat at 1 "+s11.charAt(1));

        String s12="hello";
        String s13="hello";
        System.out.println(s12.equals(s13));
        System.out.println(s12==s13); //true

        String s14=new String("hello");
        String s15=new String("hello");

        System.out.println(s14==s15); //false- address
        System.out.println(s14.equals(s15)); //content

        int a=10;
        int b=10;
        System.out.println(a==b);

        //indexOf
        //replace
        //subString

    }
}
