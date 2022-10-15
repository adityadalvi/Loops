
public class A1H3 {
//Write a program to find if given number is prime or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int cnt=0;
		for (int i = 2; i < num; i++)
		{
			if(num%i==0)
			{
				cnt++;
				break;
			}
		}
		if(num==1)
		{
			System.out.println("Not prime-Not composite");
		}
		else if(cnt==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
