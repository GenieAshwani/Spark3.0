
class MyRunnable1 implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i +"Ladkin Pasand...");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}


public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable1 m=new MyRunnable1();

        //creating a thread using runnable instance
        Thread t1=new Thread(m);

        //start thread
        t1.start();

        t1.join(); ///main---t1.join

        System.out.println("Card print krwa do....");

    }
}
