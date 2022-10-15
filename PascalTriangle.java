
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++)
		{
			for (int j = 5; j > i+1; j--) 
			{
				System.out.print(" ");
			}
			int num=1;
			for (int k = 0; k <=i; k++)
			{
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);
			}
			System.out.println();
		}

	}

}
