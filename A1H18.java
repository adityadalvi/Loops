
public class A1H18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < 17; i+=2)
		{
			for (int j = 0; j <= 9; j++)
			{
				if(j-i<=0&&j+i<17)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		int i=0;
		loopi(i);

	}
	private static void loopi(int i)
	{
		if(i<17)
		{
			int j=0;
			loopj(i,j);
			System.out.println();
			i+=2;
			loopi(i);
		}
	}
	private static void loopj(int i,int j)
	{
		if(j<=9)
		{
			if(j-i<=0&&j+i<17)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopj(i, j);
		}
	}

}
