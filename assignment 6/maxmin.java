import java.util.Scanner;`

class Maxmin
{
public static void main(String args[])
{
Scanner org=new Scanner(System.in);
int n,max,min;
System.out.println("enter the no of element"); 
n=org.nextInt();
int[] r=new int[n];
System.out.println("enter the  element");
for(int i=0;i<n;i++)
{
r[i]=org.nextInt();
}
max=r[0]:
min=r[0];
for(int i=0;i<n;i++){
{if (r[i]>max)
System.out.println("maximum value for the above array"+r[i]);
  else if (r[i]<min)
  System.out.println("minimum value for the above array"+r[j]);
}
}