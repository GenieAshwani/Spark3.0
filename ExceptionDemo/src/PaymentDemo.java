public class PaymentDemo {
    public static void main(String[] args) {

        payment(100);
    }

    public static void payment(int price)
    {
        int bal=200;
        System.out.println("transaction initiating....");
        System.out.println("select bank----SBI");
        System.out.println("making paymnet");
        try{
            bal=bal-price;
            System.out.println(10/0);
        }
        catch (Exception e)
        {

            e.printStackTrace();
        }
        finally {

        }


    }
}
