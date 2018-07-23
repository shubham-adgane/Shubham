import java.util.*;
class Alpha
{
public static void main(String args[])
{
int a;
char c;
Scanner s=new Scanner(System.in);
System.out.println("Enter a character");
c=s.next().charAt(0);
a=c;
if(a>=65&&a<=90||a>=97&&a<=122)
System.out.println("Is a character");
else
System.out.println("is other input");
}
}