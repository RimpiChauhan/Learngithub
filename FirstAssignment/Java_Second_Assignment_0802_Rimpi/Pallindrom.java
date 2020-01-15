import java.util.Scanner;
public class Pallindrom {

	public static void main(String[] args) {
		
			int num;
			 System.out.print("Enter any no.");
	          Scanner scn= new Scanner(System.in);
	          num=scn.nextInt();
			int temp=num;
			int rem=0;
			int r1=num%10;
				rem=rem*10+r1;
			num=num/10;
			int r2=num%10;
			rem=rem*10+r2;
			num=num/10;
			rem=rem*10+num;
			if(rem==temp)
			{
				System.out.print("No. is pallindrom");
			}
			else
			{
				System.out.print("No is not pallindom");
			}
		}
		
	

}
