import java.util.Scanner;
class DaysInMonth
{
	public static void main(String[] arg)
	{
	  int d;
	  System.out.print("Enter the Number of month");
	  Scanner scn=new Scanner(System.in);
	  d=scn.nextInt();
	switch(d)
	{
		case 1:
		System.out.print("january=31");
		break;
		
		case 2:
		System.out.print("Feb=28");
		break;
		
		case 3:
		System.out.print("Mar=31");
		break;
		
		case 4:
		System.out.print("Apr=30");
		break;
		
		case 5:
		System.out.print("May=31");
		break;
		
		case 6:
		System.out.print("Jun=30");
		break;
		
		case 7:
		System.out.print("July=31");
		break;
		
		case 8:
		System.out.print("Aug=31");
		break;
		
		case 9:
		System.out.print("Sep=30");
		break;
		
		case 10:
		System.out.print("Oct=31");
		break;
		
		case 11:
		System.out.print("Nov=30");
		break;
		
		case 12:
		System.out.print("dec=31");
		break;
	      default:
	    System.out.print("invalid month");
	}
		
	}
}