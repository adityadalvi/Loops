/*
Write a program which prints 33 to 999. The numbers should be displayed as:
i. For multiples of 3 print "PINK" instead of the number
ii. For the multiples of five print "YELLOW".
iii. For numbers which are multiples of both three and five print "PINK&YELLOW".
Also print count of how many times ?PINK? was printed, ?YELLOW? was printed and ?PINK &
YELLOW ?was printed.
 */
public class A1C6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		for (int i = 33; i <=999; i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println(i+"=Pink&Yellow");
				cnt1++;
			}
			else if(i%3==0)
			{
				System.out.println(i+" Pink");
				cnt2++;
			}
			else if(i%5==0)
			{
				System.out.println(i+" Yellow");
				cnt3++;
			}
			else
			{
				System.out.println(i);
			}
		}
		System.out.println("Pink&Yellow-"+cnt1);
		System.out.println("Pink-"+cnt2);
		System.out.println("Yellow-"+cnt3);
		
	}

}
