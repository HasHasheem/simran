class Father
{
int a=20;
}
class Son1 extends Father
{
void son()
{
System.out.println("Son1");
}
}
class Son2 extends Father
{
void sonn(){
System.out.println("Son2");
}
}
class Subson extends Son1
{
int b=30;
}
class Hybrid
{
public static void main(String[]args)
{
Son2 s1=new Son2();
System.out.println(s1.a);
s1.sonn();
Subson s2=new Subson();
System.out.println(s2.a);
s2.son();
System.out.println(s2.b);
}
}

