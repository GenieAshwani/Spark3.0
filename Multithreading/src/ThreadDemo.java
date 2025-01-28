




class Mythread extends Thread{
    //task/job
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("Child Thread "+ i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        Mythread t=new Mythread();
        t.start();
        for (int i=0;i<5;i++)
        {
            System.out.println("Piyus "+i);
        }
    }
}
