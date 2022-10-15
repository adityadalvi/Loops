import java.util.Scanner;
public class Practice2{
/*
 ****
 ***
 **
 *
 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 
 */
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows req.=");
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		
		int num=sc.nextInt();
		for (int i = 0; i < num; i++)
		{
			for (int j=num; j>i; j--) 
			{
				System.out.print("*");
			}
		System.out.println();	
		}*/
		
		/*
		 1 2 3 4 5
		 1 2 3 4
		 1 2 3
		 1 2
		 1
		 
		int num=sc.nextInt();
		for (int i = 1; i <=num; i++) 
		{
			for (int j = num; j>=i; j--)
			{
				System.out.print(((num+1)-j)+" ");
			}
		System.out.println();	
		}*/
		
		/*
7654321
765432
76543
7654
765
76
7
		 */
		int num=sc.nextInt();
		for (int i = 0; i <num; i++)
		{
			for (int j = num; j>i; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	

}
