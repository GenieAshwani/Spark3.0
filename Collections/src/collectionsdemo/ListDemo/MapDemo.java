package collectionsdemo.ListDemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(2,"ewoewe");

        System.out.println(map);

        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer, String> enty = iterator.next();
            System.out.println("key--> "+enty.getKey()+" value---> "+enty.getValue());
        }

        for(String val:map.values())
        {
            System.out.println(val);
        }

        map.forEach((k,v)-> System.out.println("key  "+k+ " val "+v));

        String s = map.get(3);
        System.out.println(s);


    }
}
