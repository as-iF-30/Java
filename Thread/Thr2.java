import java.util.*;
class Account
{
private int bal;
public Account(int bal)
{
this.bal=bal;
}
public boolean isSufficientBalance(int w)
{
if(bal>w)
{
return(true);
}
else 
{
return(false);
}
}
public void withdraw(int amt)
{
bal=bal-amt;
System.out.println("Withdrawl money:"+amt);
System.out.println("your current amount:"+bal);
}
}
class Customer implements Runnable
{
private String name;
private Account account;
public Customer(Account account,String n)
{
this.account=account;
name=n;
}
public void run()
{
Scanner kb=new Scanner(System.in);
System.out.println(name+"Enter amount to withdraw");
int amt=kb.nextInt();
if(account.isSufficientBalance(amt))
{
System.out.println(name);
account.withdraw(amt);
}
else
{
System.out.println("Insufficient balance");
}
}
public class Thr2
{
public static void main(String []args)
{
Account a1=new Account(1000);
Coustmer c1=new Coustemer(a1,A);
Coustmer c2=new Coustemr(a2,B);
Thread t1=new thread (c1);
Thread t2=new thread(c2);
t1.start();
t2.start();
}
}