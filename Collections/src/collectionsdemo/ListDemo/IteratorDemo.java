package collectionsdemo.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(22);
        al.add(45);
        al.add(34);

        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext())
        {
            Integer data = iterator.next();
            System.out.println(data);
            if(data==22)
            {
                iterator.remove();
            }

        }

        System.out.println(al);
    }
}
