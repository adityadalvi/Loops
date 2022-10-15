/*
WRITE A PROGRAM to print followingPattern
1 2 3 45
2 3 4 5
3 4 5
45
5
45
3 4 5
2 3 4 5
1 2 3 45
 */
public class A1C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 5; j++)
			{
				if(j+i<=4||j-i<=-4)
				{
					if(i<=4)
					{
						System.out.print(1+j+" ");
					}
					else
					{
						System.out.print(9-i+j+" ");
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
