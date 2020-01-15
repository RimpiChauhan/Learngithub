import java.util.Scanner;
class Division {
   public static void main(String[] args) {
      int n;
	  System.out.print("Enter the number to check whether it is divisible by 5 or 11");
	  Scanner scn=new Scanner(System.in);
	  n=scn.nextInt();
	   if((n%5==0)&&(n%11==0))
	   {
		   System.out.print("Given number="+n+"is divisible by both number");
		   
	   }
	   else
	   {
		   System.out.print(n + "is not divisible by both numbers");
	   }
   }
}