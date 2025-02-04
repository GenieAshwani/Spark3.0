package collectionsdemo.ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List al=new ArrayList();
        al.add(10);
        al.add("nirali");
        al.add(40);

        System.out.println(al);

        System.out.println("------------------------------");

        List<Integer> arr=new ArrayList<>(); //cc->10 //(10-->1.5 )+1
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(10);
        System.out.println(arr);

        System.out.println(arr.get(0));

        arr.removeFirst();

        ArrayList al2=new ArrayList();
        al2.add(12);
        al2.add(13);
        arr.addAll(al2);

        ArrayList<String> arr1=new ArrayList<>(20);


    }
}
