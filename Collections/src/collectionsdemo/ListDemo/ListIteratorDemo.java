package collectionsdemo.ListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(22);
        al.add(45);
        al.add(34);

        ListIterator<Integer> listIterator = al.listIterator();
        while (listIterator.hasNext())
        {
            Integer data = listIterator.next();
            System.out.println(data);
        }
    }
}
