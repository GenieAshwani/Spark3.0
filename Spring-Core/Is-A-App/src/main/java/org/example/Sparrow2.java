package org.example;

public class Sparrow2 extends Bird{

    public void flyHigh()
    {
        // first need to fly
        int fly=super.fly();  // tight coupling
        if(fly>=1)
        {
            System.out.println("start fly high....");
        }
    }
}
