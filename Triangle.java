import java.util.*;
class Triangle
{
 public static void main(String args[])
  {
  Scanner t=new Scanner(System.in);
  System.out.println("Enter the sides of triangle");
  int a,b,c;
  a=t.nextInt();
  b=t.nextInt();
  c=t.nextInt();
  if(a==b&&b==c)
  System.out.println("Is equilateral triangle");
  else if(a==b||b==c||a==c)
  System.out.println("Is Isosceles triangle");
  else
  System.out.println("Is Scalene triangle");
  }
}