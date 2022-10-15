/*
1
2 1 2
3 2 1 2 3
4 3 2 1 2 3 4
 */
public class A1H20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i+=2)
		{
			int cnt=0;
			for (int j = 0; j <7 ; j++) 
			{
				if(j-i<=0)
				{
					if(j<=i/2)
					{
						System.out.print(1+(i/2)-j+" ");
					}
					else
					{
						System.out.print((2)+cnt+++" ");
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
		
	}

}
