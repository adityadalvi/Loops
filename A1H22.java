/*
Write a program to print the first 15 numbers of the Pell series. In mathematics, the Pell numbers are an infinite
sequence of integers. The sequence of Pell numbers startswith 0 and 1, and then each Pell number is the sum of
twice the previous Pell number and the Pell number before that.: The first few terms of the
sequence are : 0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,�
 */
import java.util.Scanner;
public class A1H22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int f=0;
		int s=1;
		int next=0;
		for(int i=0;i<num;i++)
		{
			System.out.print(f+" ");
			next=f+(2*s);
			f=s;
			s=next;
		}

	}

}
