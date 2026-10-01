package stringsdsa;

public class PalindromeString {

	public static void main(String[] args) {
		String str="Madam";
		int left=0;
		int right=str.length()-1;
		boolean palindrome=true;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				palindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(palindrome==true)
		{
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");//Not a palindrome
		}

	}

}
