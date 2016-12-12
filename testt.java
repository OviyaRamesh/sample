import java.io.*;
import java.util.*;
class myexp extends Exception
{
    myexp(String s)
{
   super(s);
}
}
public class testt
{
  static void prin(int p) throws myexp
{
   if(p<=0)
{
    throw new myexp("you paid all ur loan amount");
}
else
{ 
    System.out.println("paid");
}
}
public static void main(String args[])
{
   int pr,ch,l=0,p,y,j=0;
 double r=0.20,i,a;
Scanner sc=new Scanner(System.in);
System.out.println("EXCEPTION HANDLING-Loan repayment");
while(true)
{
  System.out.println("1.ask loan\n2.repay\n3.exit");
  System.out.println("Enter the choice:");
  ch=sc.nextInt();
switch(ch)
{
   case 1:
        if(j==1)
        { 
           System.out.println("already got");
       }
  else
{  
   System.out.println("Enter the loan amount:");
  pr=sc.nextInt();
l=pr;
j++;
}

break;
case 2:
try
{
prin(l);    
i=l*r;
System.out.println("Interest amount:"+i);
System.out.println("principal amount:"+l);
System.out.println("do u want to repay in principle amount:");
y=sc.nextInt();
if(y==0)
{
    System.out.println("amount to be paid:"+i);
}
else
{
   System.out.println("Enter the amount to repay from principal:");
  p=sc.nextInt();
l=l-p;
a=p+i;
System.out.println("the amount to be paid:"+a);
}
}
catch(myexp e)
{
     System.out.println("Exception Occured "+e);
}
break;
case 3:
     System.exit(0);
}
}
}
}