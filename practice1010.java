
public class practice1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=101111;
		int temp=num;
		int temp1=num;
		int sum=0;
		int num2=1;
		while(temp>0)
		{
			int rem=temp%10;
			if(rem==0)
			{
				num2=0;
				break;
			}
			temp=temp/10;
		}
		if(num2==0)
		{
			while(temp1>0)
			{
				int rem1=temp1%10;
				if(rem1==1)
				{
					sum=sum+1;
				}
				temp1/=10;
			}
		}
		System.out.println(sum);

	}

}
