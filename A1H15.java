import java.util.Iterator;
import java.util.Scanner;
public class A1H15 {
	/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
	 */
	public static void main(String[] args) 
	{
		/*int cnt=0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if(j-i<=0)
				{
					System.out.print(1+cnt+++" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		int i=0;
		int irange=5;
		int jrange=5;
		int cnt=0;
		cnt=loopi(i,irange,jrange,cnt);
	}

	private static int loopi(int i, int irange, int jrange,int cnt) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int j=0;
			cnt=loopj(i,j,irange,jrange,cnt);
			System.out.println();
			i++;
			return loopi(i,irange,jrange,cnt);
		}
		return cnt;
		
	}

	private static int loopj(int i, int j, int irange, int jrange,int cnt) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j-i<=0)
			{
				System.out.print(1+cnt+++" ");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			return loopj(i, j, irange, jrange,cnt);
		}
		return cnt;
		
	}
}
