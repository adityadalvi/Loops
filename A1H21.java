import java.util.Scanner;
public class A1H21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=704;//45
		int temp=num;
		int cnt=0;
		while(num>0)
		{
			cnt++;
			num=num/10;
		}
		int div=(int)(Math.pow(10, cnt));
		int num1=temp*temp;
		int left=num1/div;
		int right=num1%div;

		if(temp==(left+right))//(45==(25+20))
		{
			System.out.println(temp+"-it is the Kaprekar number");
		}
		else
		{
			System.out.println(temp+"-Not a Kaprekar number");
		}


	}

}

/*
int cnt=0;
		int new1=(num*num);			//45*45=2025
		System.out.println(new1);
		int new2=new1;
		int new3=new1;
		int sum1=0,sum2=0,sum3=0,sum4=0;

		while(new1>0)
		{
			new1=new1/10;
			cnt++;					//4
			}
		int cnt1=cnt,cnt2=cnt,cnt3=cnt;
		for(int i=1;i<=(cnt/2);i++)
		{
			sum1=(sum1*10)+(new2%10);
			new2=new2/10;			//52
		}
		while(sum1>0)
		{
			sum4=(sum4*10)+(sum1%10);
			sum1=sum1/10;//25
		}
		for(int j=1;j<=(cnt2);j++)
		{
			sum2=(sum2*10)+(new3%10);
			new3=new3/10;//5202
		}
		for(int i=(cnt3/2);i>=1;i--)
		{
			sum3=(sum3*10)+(sum2%10);
			sum2=sum2/10;//20
		}
if(num==1)
	{
		System.out.println("it's Kaprekar number");
	}
else if(num==(sum4+sum3))//(45==(25+20))
	{
		System.out.println(num+"-it is the Kaprekar number");
	}
else if(num!=(sum4+sum3))
	{
		System.out.println(num+"-Not a Kaprekar number");
	}

	}


 */
