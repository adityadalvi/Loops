import java.util.Scanner;
public class Practice3{

 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows req.=");
		
		/*
	*
   **
  ***
 ****
*****
	 
	 
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) 
		{
			for (int j =num; j>i; j--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
/*
    1
   12
  123
 1234
12345   
 */
		int num=sc.nextInt();
		for (int i = 1; i<=num; i++)
		{
			for (int j = num; j >i; j--) 
			{
				System.out.print(" ");
			}
			for (int j2 =1; j2 <=i; j2++) 
			{
				System.out.print(j2+"");
			}
		System.out.println();	
		}
		/*
		
		char ch=sc.next().charAt(0);
		for (char i = 'A'; i <=ch; i++) 
		{
			for (char j = ch; j>i; j--) 
			{
				System.out.print(" ");
			}
			for (char j ='A'; j <=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
		
		
	}
	

}
