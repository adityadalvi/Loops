//Write a menu driven program to find all prime, even and odd numbers between 1 to 100 (Variations)
import java.util.Scanner;
public class A1H10 {
//Write a program to display 1 to 10 by implementing different loops.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");//(1-even,2-odd,3-prime)
		int num=sc.nextInt();
		int num1=1;
		int num2=100;
		switch(num)
		{
		case 1:
			for(int i=0;i<=100;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
				
			}
			break;
		case 2:
			for(int i=0;i<=100;i++)
			{
				if(i%2!=0)
				{
					System.out.println(i);
				}
				
			}
			break;
		case 3:
		
			for(int i=2;i<100;i++)
			{
				int cnt=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						cnt++;
						break;
					}
					else
					{
						cnt=0;
					}
				}
				if(cnt==0)
				{
					System.out.println(i);
			
				}
			}
			break;
		default:
			System.out.println("out of bound number");
		}
		
		

	}

}
