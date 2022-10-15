import java.util.Scanner;
public class A1H14 {
/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int num=sc.nextInt();
		for (int i = 0; i <num; i++)
		{
			for (int j=0; j<num; j++)
			{
				if(j-i<=0)
				{
					System.out.print((1+i)-j+" ");
				}
				
			}
			System.out.println();
		}
		

	}

}
