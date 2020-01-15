import java.util.Scanner;
class Day {
   public static void main(String[] args) {
      int week;
	  System.out.print("Enter the number of days");
	  Scanner scn=new Scanner(System.in);
	  week=scn.nextInt();
     
	        
      switch (week) {
         case 1:
           System.out.print("Sunday");
           break;
         case 2:
           System.out.print("Monday");
	       break;
         case 3:
           System.out.print("Tuesday");    
		   break;
         case 4:
           System.out.print("Wednesday");
           break;
         case 5:
           System.out.print("Thursday");
           break;
         case 6:
           System.out.print("Friday");
           break;
         case 7:
           System.out.print("Saturday");
           break;
         default: 
           System.out.print("Invalid day");
           break;
      }
     
   }
}
