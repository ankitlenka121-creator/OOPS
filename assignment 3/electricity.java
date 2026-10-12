import java .util.*;
class Electricity
{
public static void  main(String args[])
{
Scanner sc = new Scanner(System.in);
double ec,es=0;
System.out.println("electricity consumption");
ec=sc.nextDouble();
if(ec<=100)
es=ec*3;
else if (ec<=500)
es=(ec-100)*4+100*3;
else
es=(ec-500)*6+(100*3)+(400*4);
System.out.println("total electricity cost:"+es);
}}
