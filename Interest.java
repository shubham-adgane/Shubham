import java.util.*;
class Interest
{
public static void main(String args[])
{
int p,r,t,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter digits");
p=s.nextInt();
r=s.nextInt();
t=s.nextInt();
i=p*r*t/100;
System.out.println("Interest is="+i);
}
}