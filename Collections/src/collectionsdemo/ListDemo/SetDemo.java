package collectionsdemo.ListDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(11);
        set.add(110);
        set.add(122);
        set.add(1);
        System.out.println(set);

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        //1--->2--->3--->4
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);

    }
}
