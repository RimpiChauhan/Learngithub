import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] arg)
	{
		int x;
		System.out.println("Enter an Number to check if it is odd or even");
        Scanner SCN = new Scanner(System.in);
        x = SCN.nextInt();
		
		if(x%2==0)
		{
			System.out.print("Number is even");
		}
		else
		{
			System.out.print("Number is Odd");
		}
		}
	}
