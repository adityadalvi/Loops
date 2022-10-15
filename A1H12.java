import java.util.Scanner;
public class A1H12 {
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int num=sc.nextInt();
		for (int i = 0; i <num; i++)
		{
			for (int j =0; j <num; j++)
			{
				if(j-i<=0)
				{
					System.out.print(1+j+" ");
				}
				
			}
			System.out.println();
		}

	}

}
