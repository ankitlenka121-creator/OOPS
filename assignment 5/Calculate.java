
import java.util.*;

class Calculate
{
public static void main(String args[])
{
Scanner srg=new Scanner(System.in);
double e=1;
long f=1;
for(int i=1;i<=5;i++){
f=f*i;
e=e+(1.0/f);}
System.out.println("value of e="+ e);
}}