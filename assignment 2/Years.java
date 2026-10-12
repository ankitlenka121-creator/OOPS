import java.lang.*;
class Years
{
public static void main(String args[])
{
int minutes=1000000,days=0,years=0,rd=0;
days=minutes/(60*24);
years=days/365;
rd=days%365;
System.out.println("minutes="+minutes);
System.out.println("years="+years);
System.out.println("days="+rd);
}
}