public class ThrowDemo {
    public static void main(String[] args) {
        int div = div(10, 2);
        System.out.println("div = "+div);
        int div1 = div(10, 0);
        System.out.println("div1=="+div1);
    }

    public static int div(int div,int divisior)
    {
        if(divisior==0)
        {
            throw new ArithmeticException("cannont divide by zero");
        }
        return div/divisior;
    }
}
