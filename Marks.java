import java.util.*;
class Marks
{
	public static void main(String args[])
	{
	System.out.println("Enter Marks");
	Scanner s=new Scanner(System.in);
	int a,b,c,d;
	System.out.println("Enter English Marks");
	a=s.nextInt();
	System.out.println("Enter Science Marks");
	b=s.nextInt();
	System.out.println("Enter History Marks");
	c=s.nextInt();
	d=a+b+c;
	System.out.println("Sum is"+d);
	d=d/3;
	if(d<50)
	System.out.println("Your percentage is:"+d+"and grade is second class");
	if(d>=50&&d<70)
	System.out.println("Your percentage is:"+d+"and grade is first class");
	if(d>=70&&d<100)
	System.out.println("Your percentage is:"+d+"and grade is distinction");	
	}
}