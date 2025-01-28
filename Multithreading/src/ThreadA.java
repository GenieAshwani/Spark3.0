public class ThreadA {
    public static void main(String[] args) throws InterruptedException {

        ThreadDemo5 t1=new ThreadDemo5();
        t1.start();
        synchronized (t1)
        {
            System.out.println("main thread calling wait()....");
            t1.wait(); ///main
            System.out.println("main thread got notification....");
        }
    }
}

class ThreadDemo5 extends Thread
{
    int sum=0;
    @Override
    public void run() {
        synchronized (this)
        {
            System.out.println("child thread start cal....");
            for(int i=0;i<=10;i++)
            {
                sum=sum+i;
            }
            System.out.println("sum is  = "+sum);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("child thread will give notification");
            this.notify();
            this.notifyAll();
        }

    }
}
