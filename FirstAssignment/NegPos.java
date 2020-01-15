import java.util.Scanner;
class NegPos {

	public static void main(String[] args) {
      int i;
	  System.out.print("Enter the number to check if it is postive or negative");
	  Scanner scn=new Scanner(System.in);
	  i=scn.nextInt();
      if(i<0) {
    	  System.out.print("Number is negative");
      }
      else {
    	  System.out.print("Number is Positives");
      }
	}

}