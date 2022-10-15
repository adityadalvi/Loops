
public class A1H6 {
//Write a program to find sum of all digits of a numberentered by theuser. (Variations)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int sum=0;
		/*while(num>0)
		{
			sum=sum+(num%10);
			num=num/10;
			
		}
		System.out.println(sum);*/
		
		for(int i=num;i>0;i=i/10)
		{
			sum=sum+(num%10);
			num=num/10;
			
		}
		System.out.println(sum);


	}

}
