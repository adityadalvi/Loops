
public class A1H5 {
//Write a program to count number of digits of a number. (Variations)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int cnt=0;
		/*while(num>0)
		{
			num=num/10;
			cnt++;
		}
		System.out.println(cnt);*/
		
		for(int i=num;i>0;i=i/10)
		{
			num=num/10;
			cnt++;
		}
		System.out.println(cnt);

	}

}
