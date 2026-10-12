import java.util.*;
class Bubble 
{
public static void main(String arg[])
{
Scanner org=new Scanner(System.in);
int i,j,n,temp;
System.out.println("enter the no of element") ;
n=org.nextInt();
int r[]=new int[n];

System.out.println("enter the  element") ;
for(i=0;i<n;i++){
r[i]=org.nextInt();
}
for(i=0;i<n;i++){
for(j=0;j<n-i;j++){
if(r[i]>r[i+1])
{
temp=r[i];
r[i]=r[i+1];
r[i+1]=temp;
}
}
System.out.println("sorted element: "+r[i]);
}}}