public class ATM {


    //data hide
    private int bal=1000;
    private String location="agra";
    private String BankName="HDFC";
    private String AccNo="212121";

    public int getBal()
    {
        return  bal;
    }
  /*  public void setBal()
    {
        this.bal=0;
    }*/
    public String getAccNo()
    {
        return AccNo;
    }

    private void details()
    {
        System.out.println(location);
    }
}
