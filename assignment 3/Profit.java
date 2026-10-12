import java .util.*;
class Profit
{
public static void  main(String args[])
{
Scanner org=new Scanner(System.in);
double cp,sp,p,pp,l = 0,lp;
System.out.println("enter sell price and cost price");
sp=org.nextDouble();
 cp=org.nextDouble();
 if(sp>cp){
p=sp-cp;
pp=(p/cp)*100;
System.out.println("profit percent"+pp);}
else {
l=cp-sp;
lp=(l/cp)*100;
System.out.println("loss percent"+lp);
}
}
}