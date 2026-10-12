import java.util.Scanner;
class Gross
{
public static void main(String args[])
{


Scanner sc= new Scanner(System.in);
int bs,hra,da,gross;
System.out.println("enter basic salary");
bs=sc.nextInt();
hra=bs*(10/100);
da=bs*(60/100);
gross=bs+hra+da;
System.out.println("gross:"+gross);
}
}