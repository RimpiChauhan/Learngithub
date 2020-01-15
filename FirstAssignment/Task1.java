import java.util.Scanner;
class Task
{
	public static void main(String[] arg)
	{
		int n;
		    Scanner scn=new Scanner(System.in);
			System.out.println("Enter the number");
			n=scn.nextInt();
		for (int i=1; i<=n; i++)
		{
			
	        
			int x;
			System.out.println("Enter the number to check if it is even or odd=");
			x=scn.nextInt();
		if(x%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	        
		}
		
		
	}
}