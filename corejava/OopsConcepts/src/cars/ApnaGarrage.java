package cars;

public class ApnaGarrage extends BmwCar{
    public static void main(String[] args) {
        ApnaGarrage apnaGarrage=new ApnaGarrage();
        apnaGarrage.modification();

        apnaGarrage.drive();
    }

    public void modification()
    {
        System.out.println("old color "+color);
        color="red";
        System.out.println("modify colo = "+color);
    }
}
