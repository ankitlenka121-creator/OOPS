import java.lang.*;
class Sum
{
public static void main(String args[])
{
int n=456,d=0,s=0;
while(n>0){
d=n%10;
s=s+d;
n=n/10;
}
System.out.println("Sum of digit:"+s);
}}