class Bank
{
int a;
int getRateOfInterest()
{ 
return 0;
}
}
class SBI extends Bank
{
int getRateOfInterest()
{
int a=9;
return a;
}
}
class ICICI extends Bank
{
int getRateOfInterest()
{
int a=8;
return a;
}
}
class AXIS extends Bank
{
int getRateOfInterest()
{
int a=11;
return a;
}
}
class Test
{
public static void main(String args[])
{
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("SBI INTEREST =" +s.getRateOfInterest());
System.out.println("ICICI INTEREST =" +i.getRateOfInterest());
System.out.println("AXIS INTEREST =" +a.getRateOfInterest());
}
}
