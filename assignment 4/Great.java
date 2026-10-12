import java.util.*;
class Great
{
public static void main(String args[])
{
Scanner org=new Scanner(System.in);
int a1,a2,a3;
System.out.println("enter three no");
a1=org.nextInt();
a2=org.nextInt();
a3=org.nextInt();
if(a1>a2&&a1>a3)
{
System.out.println("greatest:"+a1);
}
else if(a2>a3&&a2>a1)
{
System.out.println("greatest:"+a2);
}
else
{

System.out.println("greatest:"+a3);
}
}
}