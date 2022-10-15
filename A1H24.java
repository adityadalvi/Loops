/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class A1H24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 13; i++)
		{
			int cnt=0;
			for (int j = 0; j < 7; j++) 
			{
				if(j-i<=0&&j+i<=12)
				{
					System.out.print(1+cnt+++" ");
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
