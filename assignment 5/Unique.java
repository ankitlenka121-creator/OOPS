
import java.util.*;
class Unique{
public static void main(String args[])
{
Scanner org=new Scanner (System.in);
System.out.println();
int n=0;
for(int i=0;i<=3;i++){
for(int j=0;j<=3;j++){
for(int k=0;k<=3;k++){
if(i!=j&&j!=k&&k!=i)
n=i*100+j*10+k;
System.out.println("  " +n);
}
}}
}
}
