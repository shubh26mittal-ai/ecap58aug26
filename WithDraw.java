package exceptions;

public class WithDraw {
	void WithDrawMoney(int amt)
	{
		int oAmt = 10000;
		if(oAmt > amt)
		{
			System.out.println(amt+" is sucessfully taken");
		}
		else {
			System.out.println("Insufficient balance");
			throw new InsufficientBalance ("Your account not having enough cash");
		}
	}

	public static void main(String[] args) {
		WithDrawMoney = new WithDraw();
		money.withDrawMoney(15000);
		

	}

}
