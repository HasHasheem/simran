class Sample
{
int a=10;
}
class Demo extends Sample
{
void add()
{
System.out.println("Hi");
}
}
class Main
{
public static void main(String[]args)
{
System.out.println("up");
Sample s1=new Demo();
System.out.println(s1.a);
System.out.println("down");
Demo d1=(Demo)s1;
d1.add();
System.out.println(d1.a);
}
}

