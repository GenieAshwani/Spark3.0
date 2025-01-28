public class TryWithMultipleCatch {
    public static void main(String[] args) {

        try {
            m1();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException ar)
        {
            ar.printStackTrace();
        }
        catch (Exception exe)
        {
            exe.printStackTrace();
        }


    }

    public static int m1()
    {
        int arr[]=new int[2];
        if(arr.length>1)
        {
            return arr[4]; //AIOFB
        }
        else return arr[0]/arr[1]; //AE
    }
}
