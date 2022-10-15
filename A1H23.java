
public class A1H23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=200;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			sum=sum+(num%10);
			num/=10;
		}
		if((temp%sum)==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("not harshad number");
		}

	}

}
