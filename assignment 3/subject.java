import java.util.Scanner;
class Mark
{
public static void main(String args[])
{


Scanner svc= new Scanner(System.in);
int m,e,p,c,b,t;
double percent;
System.out.println("enter five subject mark:");
m=svc.nextInt();
e=svc.nextInt();
p=svc.nextInt();
c=svc.nextInt();
b=svc.nextInt();
t=m+e+p+c+b;
percent=(t/500.0)*100;
System.out.println("total marks:"+t);
System.out.println("percentage:"+percent);
}
}