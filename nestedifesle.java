class Nestedif
{
public static void main(String[] arg)
{
	int a=10;
	
	if(a==10)
	{
		System.out.println("main if");
		if(a<100)
		{
			System.out.println("inner if");
		}
		else
		{
			System.out.println("inner else");
		}
		
	}
	else
	{
		System.out.print("main else");
	}
}}