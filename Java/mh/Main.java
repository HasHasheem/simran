class Mobile1
{
void call()
{
System.out.println("call with number");
}
}
class Mobile2 extends Mobile1
{
void call()
{
System.out.println("call with number and video call");
super.call();
}
}
class Main
{
public static void main(String[]args)
{
Mobile2 m1=new Mobile2();
m1.call();
}
}
