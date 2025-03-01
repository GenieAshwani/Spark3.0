package org.example;

public class Sparrow3 {

    Bird3 bird3;  // field/member/variable

    Sparrow3(Bird3 bird3)
    {
        this.bird3=bird3;
    }
    public void flyHigh()
    {
        // first need to fly
       // int fly=super.fly();  // tight coupling
        int fly =bird3.fly();
        if(fly>=1)
        {
            System.out.println("start fly high....");
        }
    }
}
