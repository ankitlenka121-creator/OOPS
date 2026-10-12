import java.util.*;
 class Avg
{
public static void main(String args[])
{
Scanner org=new Scanner(System.in);
int n,sum=0,i,av;
System.out.println("enter the no of element"); 
n=org.nextInt();
int[] r=new int[n];
System.out.println("enter the  element");
for(i=0;i<n;i++)
{
r[i]=org.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+r[i];
}
av=sum/n;
System.out.println("the average  of array element :"+av);
}
}
