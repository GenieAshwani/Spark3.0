package org.example;

public class Car {
    private Engine engine;

    /*Car(Engine engine)
    {
        System.out.println("Argument cons.....");
        this.engine=engine;
    }*/

   /* public void setEngine(Engine engine) {
        System.out.println("Setter method.....");
        this.engine = engine;
    }*/

    public void drive()
    {
        int start = engine.start();
        if (start>=1)
        {
            System.out.println("Car running....");
        }
        else {
            System.out.println("Engine not start....");
        }
    }
}
