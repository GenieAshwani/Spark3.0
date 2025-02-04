package collectionsdemo.ListDemo;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet<Integer> ss=new TreeSet<>();
        ss.add(10);
        ss.add(3);
        ss.add(40);
        ss.add(2);
        System.out.println(ss);
    }
}
