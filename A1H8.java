
public class A1H8 {
//Write a program to check and display if a given number is palindrome or not. (Variations)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121213;
		int ori=num;
		int sum=0;
		
		while(num>0)
		{
			sum=(sum*10)+(num%10);
			num=num/10;
		}
		if(sum==ori)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
