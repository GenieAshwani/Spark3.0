package collectionsdemo.ListDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(11);
        vector.add(23);

        Enumeration env=vector.elements();
        //impl
        //object
        while (env.hasMoreElements())
        {
            Integer data= (Integer) env.nextElement();
            System.out.println(data);
        }

    }
}
