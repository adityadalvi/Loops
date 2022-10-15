//Write a program to display the Fibonacci series
//0,1,1,2,3,5,8,13,21,34....
public class A1C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int next=0;
		int num=10;
		for (int i = 0; i <num; i++) 
		{
			System.out.print(f+" ");
			next=f+s;//1 2 3 5 8 13 21 34 55
			f=s;	//1 1 2 3 5 8 13 21 34
			s=next; //1 2 3 5 8 13 21 34 55
		}
	}
}
