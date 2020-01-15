import java.util.Scanner;
class DaysInMonth
{
	public static void main(String[] arg)
	{
	  int m;
	  System.out.print("Enter the Number of month");
	  Scanner scn=new Scanner(System.in);
	  m=scn.nextInt();
	switch(m)
	{
		case 1:
		System.out.print("january=31");
		break;
		
		case 2:
		System.out.print("28");
		break;
		
		case 3:
		System.out.print("31");
		break;
		
		case 4:
		System.out.print("30");
		break;
		
		case 5:
		System.out.print("31");
		break;
		
		case 6:
		System.out.print("30");
		break;
		
		case 7:
		System.out.print("31");
		break;
		
		case 8:
		System.out.print("31");
		break;
		
		case 9:
		System.out.print("30");
		break;
		
		case 10:
		System.out.print("31");
		break;
		
		case 11:
		System.out.print("30");
		break;
		
		case 12:
		System.out.print("31");
		break;
	      default:
	    System.out.print("invalid month");
	}
		
	}
}