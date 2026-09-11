public interface UPIPayment {

    public void payMoney();

    public void getScratchCard();

    public void getCashBackAsCreditBalance(){};
    
}
class GooglePay extends UPIPayment
{
    public void payMoney(){};

    public void getScratchCard(){};

    public void getCashBackAsCreditBalance(){};
}
class Phonepe  extends UPIPayment
{
    public void payMoney(){};

    public void getScratchCard(){};

    public void getCashBackAsCreditBalance(){};
}