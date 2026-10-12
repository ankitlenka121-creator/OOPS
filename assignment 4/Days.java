import java.util.*;
class Days
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int y,m;
System.out.println("enter  month 1-12:");
m=sc.nextInt();
System.out.println("enter year");
y=sc.nextInt();
switch(m){
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
System.out.println("31 days");
break;
case 2:
if(y%400==0){
System.out.println("29 days");
}
else{
System.out.println("28 days");}

case4:
case6:
case9:
case11:
System.out.println("30 days");
Default:
System.out.println("invalid month input");
}
}
}




