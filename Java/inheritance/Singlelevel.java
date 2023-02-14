package inheritance;

class Demo{
int a=40;
}
class Sample    extends Demo
{
//int a=40;
void mul()
{
System.out.println("Has Has Hasheem");
}
}
public class singleLevel
{    
public static void main(String[]args)
{
Sample s1=new Sample();
s1.mul();
System.out.println(s1.a);
}
}
