import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter the number");
		Scanner scn=new Scanner(System.in);
	     n=scn.nextInt();
         boolean flag=false;
         for(int i=2; i<=n-1;i++)
         {
        	 if(n%i==0)
        	 {
        		 flag = true;
        		 break;
        	 }
        	 else
        	 {
        		 flag = false;
        	 }
         }
        	 if(flag==true)
        	 {
        		 System.out.print("Not a Prime no.");
        	 }
        	 else
        	 {
        		 System.out.print("Prime no.");
        	 }
         
	}

}
