import java .util.*;
class Integer
{
public static void  main(String args[])
{
Scanner org=new Scanner(System.in);
int n;
System.out.println("enter an integer");
n=org.nextInt();
if(n>0)
System.out.println("positive integer");
else if(n<0)
System.out.println("negative integer");
else
System.out.println("zero");
}
}