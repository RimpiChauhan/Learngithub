class modulas
{
public static void main(String[] arg)

{
int n=5678;
System.out.println("initial num is-" +n);
int r1=n%10;
System.out.println("First digit is-" +r1);
// for Second Digit
n=n/10;
System.out.println("num  is-" +n);
int r2=n%10;
System.out.println("second digit is-" +r2);
// for Third Digit
n=n/10;
System.out.println("num  is-" +n);
int r3=n%10;
System.out.println("Third is-" +r3);
// for Forth Digit
n=n/10;
System.out.println("num  is-" +n);
int r4=n%10;
System.out.println("Forth digit is-" +r4);

System.out.print("Sum of all digit is" +(r1+r2+r3+r4));

}
}