import java.util.Scanner;
public class MonthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int month;
         System.out.print("Enter the Month Number");
         Scanner scn=new Scanner(System.in);
         month= scn.nextInt();
          switch(month)
          {
              case 1:
        	      System.out.print("January");  
        	      break;
              case 2:
                  System.out.print("Feb");  
            	  break;
              case 3:
            	  System.out.print("Mar");  
            	  break;
              case 4:
            	  System.out.print("April");  
            	  break;
              case 5:
            	  System.out.print("May");  
            	  break;
              case 6:
            	  System.out.print("June");  
            	  break;
              case 7:
            	  System.out.print("July");  
            	  break;
              case 8:
            	  System.out.print("Aug");  
            	  break;
              case 9:
            	  System.out.print("Sep");  
            	  break;
              case 10:
            	  System.out.print("oct");  
            	  break;
              case 11:
            	  System.out.print("Nov");  
            	  break;
              case 12:
                  System.out.print("December");  
                  break;
                  default:
                System.out.print("Invalid month");
          }
         
         
	}
}
