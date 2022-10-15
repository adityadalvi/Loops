/*
WRITE A PROGRAM toprint:
ABCDEFGFEDCBA
ABCDEF FEDCBA
ABCDE   EDCBA
ABCD     DCBA
ABC       CBA
AB         BA
A           A
 */
public class A1C5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i++)
		{
			int cnt=0;
			for (int j = 0; j < 13; j++)
			{
				if(j+i<=6||j-i>=6)
				{
					if(j<=6)
					System.out.print((char)(65+j));
					else
					{
						System.out.print((char)(70-cnt++));
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
