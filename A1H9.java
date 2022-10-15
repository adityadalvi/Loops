
public class A1H9 {
/*
 Write a program to display elementsbetween100 to 200 (both numbers excluded) ending with seven. {Hint: output107,117,127….}(Variations)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=100;
		int end=200;
		int eElement=7;
		for (int i =(start+eElement); i<=end; i=i+10)
		{
			System.out.println(i);
		}

	}

}
