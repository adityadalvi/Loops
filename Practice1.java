import java.util.Scanner;
public class Practice1 {
/*
 *
 **
 ***
 ****
 
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 
 */
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows req.=");
		
		/*
		 *
		 **
		 ***
		 ****
		 
		int num=sc.nextInt();
		for (int i = 0; i <num; i++)
		{
			for (int j = 0; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*
		 1
 		 1 2
 		 1 2 3
 		 1 2 3 4
 		 1 2 3 4 5
		
		int num=sc.nextInt();
		for (int i = 1; i <=num; i++)
		{
			for (int j = 1; j<=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		 }*/
		
		/*
		 1
		 2 2
		 3 3 3
		 4 4 4 4
		 5 5 5 5 5
		 
		 
		 int num=sc.nextInt();
		 for (int i = 1; i<=num; i++)
		 {
			 for (int j = 1; j <=i; j++) 
			 {
				 System.out.print(i+" ");
			 }
			System.out.println();
		 }*/
		
		/*
		 A
		 A B
		 A B C
		 A B C D
		 A B C D E
		 
		char ch=sc.next().charAt(0);
		 for (char i ='A'; i<=ch; i++) 
		 {
			 for (char j='A'; j <=i; j++)
			 {
				 System.out.print(j+" ");
			}
			 System.out.println();
		}*/
		/*
		 A
		 B B
		 C C C
		 D D D D
		 E E E E E
		 
		char ch=sc.next().charAt(0);
		for (char i ='A'; i<=ch; i++) 
		{
		for (char j = 'A';j <=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
		*/
		/*
7
76
765
7654
76543
765432
7654321
*/
		int num=sc.nextInt();
		for (int i = 1; i<=num; i++)
		{
			for (int j = 0; j <i; j++) 
			{
				System.out.print(num-j+" ");
			}
			System.out.println();
		}
		
	}
	

}
