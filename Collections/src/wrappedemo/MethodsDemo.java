package wrappedemo;

public class MethodsDemo {
    public static void main(String[] args) {
        String num="233";
        int val=Integer.parseInt(num); //parse string to int
        System.out.println("parse value = "+val);


        int n=10;   //primitive to string
        String s=Integer.toString(n); //
        System.out.println("String "+s);

        Integer a=14;
        Integer b=12; //new Integer(10);
        Integer c= new Integer(10);
        System.out.println("compare "+Integer.compare(a,b));
        System.out.println("c--------->"+c);

        Integer res = Integer.valueOf("1233");

        boolean t=true;
        Boolean bol=true;
        System.out.println(bol);
    }
}
