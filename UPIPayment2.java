class CreditCard
{
    public void do transaction (long amount)
    {
        System.out.println(x:"Payment is  done using credit card ");

    }
}
class DebitCard
{
    public void do transaction (long amount)
    {
        System.out.println(x:"Payment is  done using debit card ");

    }
}
class ShoppingMall
{
    private DebitCard debitCard;
    public ShoppingMall (DebitCard debitCard);
    {
        this.debitCard = debitCard;
    }
    public void doPurchase (long amount)
    {
        debitCard.doTransaction(amount);
    } 
    public static void main(String[]args)
    {
        DebitCard db = new DebitCard();
        ShoppingMall sm = new ShoppingMall();
        sm.doPurchase(amount:5000);
    }
}
//above code is tightly couples with debit card to overcome this isser

interface BankCard()
{
    public void do Transaction (long amount); 
}

class CreditCard extend BankCard
{
    public void do Transaction (long amount)
    {
        System.out.println("Payment is done using CreditCard");
    }
}
class DebitCard extend BankCard
{
    public void do Transaction (long amount)
    {
        System.out.println("Payment is done using DebitCard");
    }
}

class ShoppingMall
{
    private BankCard bankcard;
    public Shopping Mall (BankCard bankcard)
    {
        this.bankcard = bankcard;
    }
    public void do purchase (long amount)
    {
        bankcard.do transaction (amount);
    }
    public static void main(String[]args)
    //BankCard db = new DebitCard();
      Bankcard db = new CreditCard();
    ShoppingMall sm = new Shopping Mall (dn);
    sm.dopurchase(5000);
}