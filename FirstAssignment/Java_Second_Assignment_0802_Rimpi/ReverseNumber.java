import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num;
          System.out.print("Enter any no.");
          Scanner scn= new Scanner(System.in);
          num=scn.nextInt();
          int  reversed = 0;
          while(num != 0) {
        	  int digit = num % 10;
        	  reversed = reversed * 10 + digit;
        	  num /= 10;
        	        }
        	        System.out.println("Reversed Number: " + reversed);
        	    
        	
	}

}
