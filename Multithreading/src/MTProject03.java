public class MTProject03 {
    public static void main(String[] args) {

        Thread t1=new Thread(new MyRunnable());

        System.out.println("Main thread name = "+Thread.currentThread());
        //name
        String t1name=t1.getName();
        System.out.println("default name = "+t1name);

        t1.setName("My-Thread-t1");

       t1.getName();
        System.out.println("default name = "+t1.getName());
    }
}
