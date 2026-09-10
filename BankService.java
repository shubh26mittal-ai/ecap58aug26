Class BankServices
{
    public long deposit(long amount, String accountNumber)
    {
        return amount;
    }
    public void printPassBook()
    {
        //print pass book from date - to date
    }
    public void getLoanInterestInfo(String loanType)
    {
        if(loanType.equals(anobject:"homeLoan"))
        {}
        if (loanType.equals(anobject:"personalLoan")){}
        if (loanType.equals(anobject:"CarLoan")){}
    }
    public void sendOTP(string medium)
    {
        if (medium.equals(anobject:"Email"))
        {
            //use javaMailSendingAPI
        }
    }

}
Class PrintService
{
    public void printPassBook()
    {
        //print pass book from date - to date
    }
}
Class LoanService
{
    public void getLoanInterestInfo(String loanType)
    {
        if(loanType.equals(anobject:"homeloan"))
            {}
        if (loanType.equals(anobject:"personalLoan")){}
        if (loanType.equals(anobject:"CarLoan")){}
        if (loanType.equals(anobject:"BikeLoan")){}
    }
}
Class NotificationServices
{
    public void sendOTP(String medium)
    {
        if(medium.equals(anobject:"email"))
        {
            //use javaMailSendingAPI
        }
        if(medium.equals(anobject:"phone")){}
        if(medium.equals(anobject:"whatsapp")){}
    }
}
interface NotificationService
{
    public abstract void sendOTP (String medium);

}
Class EmailNotificationService extends NotificationService
{
    public void sendOTP(String medium)
    {
        //write logic to send otp using email
    }
}
Class PhoneNotificationService extends NotificationService
{
    public void send OTP(String medium)
    {
        //write logic to send otp smartphone
    }
}
Class WhatsappNotificationService extends NotificationService
{
    public void send OTP(String medium)
    {
        //write logic to send otp whatsapp
    }
}