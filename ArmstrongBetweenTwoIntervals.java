
public class ArmstrongBetweenTwoIntervals 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=200;i++)
		{
			int temp=i;
			int num=i;
			int num1=i;
			int cnt=0;
			int sum=0;
			while(num>0)
			{
				cnt++;
				num=num/10;
			}
			
			while(num1>0)
			{
				int rem=num1%10;
				sum=sum+(int)(Math.pow(rem,cnt));
				num1=num1/10;
			}
			if(temp==sum)
			{
				System.out.println(i);
			}
		}
	}

}
