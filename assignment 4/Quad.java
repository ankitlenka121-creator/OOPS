 import java.util.*;
import java.math.*;
class Quadratic
{
public static void main(String args[])
{
Scanner org=new Scanner(System.in);
int a,b,c;
double x1,x2;
System.out.println("enter a");
a=org.nextInt();
System.out.println("enter b");
b=org.nextInt();
System.out.println("enter c");
c=org.nextInt();
if((b*b)-(4*a*c)>0)
System.out.println("Two distinct real roots.");
if((b*b)-(4*a*c)<0)
System.out.println("Two imaginary roots.");
else if((b*b)-(4*a*c)>0)
System.out.println("Two distinct real roots.");
else
System.out.println("Two equal real roots.");
x1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
System.out.println("root 1"+x1);
x2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
System.out.println("root 2"+x2);
}
}