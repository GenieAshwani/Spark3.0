package org.example;

public class Sparrow{

    public void flyHigh()
    {
        // first need to fly
        //int fly=super.fly();
        Bird2 b=new Bird2(); // load
        int fly=b.fly();
        if(fly>=1)
        {
            System.out.println("start fly high....");
        }
    }
}
