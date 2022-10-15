import java.util.Iterator;

public class PrimeNumbersBetween1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <=100; i++)
		{
			int cnt=0;
			for (int j = 2; j <i; j++) 
			{
				if(i%j==0)
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
