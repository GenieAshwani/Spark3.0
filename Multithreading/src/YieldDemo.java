
class MyThread3 extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);

            //call yield to give chance
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 t1=new MyThread3();
        t1.setName("t1-thread");

        Thread.sleep(3000);
        for(int i=0;i<5;i++)
        {
            System.out.println("main thread");
        }
    }
}
