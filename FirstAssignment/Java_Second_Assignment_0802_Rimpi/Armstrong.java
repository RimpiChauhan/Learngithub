
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r=0;
		 int a;
		 int temp;  
		    int n=371;  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    r=r+(a*a*a);  
		    }  
		    if(temp==r)  
		    System.out.println("armstrong number");   
		    else 
		    {
		        System.out.println("Not armstrong number");   
		    }  
                
	}

}
