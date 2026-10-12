import java.util.*;
class Sort
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n,i
System.out.println("enter the no of element");
n=obj.nextInt();
int[] a=new int(n);
System.out.println("enter the element");
for(i=0;i<n;i++){
a[i]=obj.nextInt();
}
for(i=0;i<n;i++){
if(a[i]>a[i++]){
temp=a[i];
a[i]=a[i++];
a[i++]=temp;
}
}
System.out.println("sorted array :"+a[i]);
}
}