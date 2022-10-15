
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=30;
		int count=0;
		for(int i=num1;i<=num2;i++)
		{
			for(int j=2;j<(i/2);j++)
			{
				if(i%j==0)
				{
					count=0;
					break;
				}
				else
				{
					count=1;
				}
				
			 }
			if(count==1)
				System.out.println(i);
			
		 }
		
	}

}
