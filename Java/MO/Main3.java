class Jsp
{
void job(int no)
{
System.out.println("studying jsp"+no);
}
void job(String comp)
{
System.out.println("The comp is"+comp);
}
void job(int no,String comp)
{
System.out.println("studying jsp"+no+"The comp is"+comp);
}
void job(String comp,int no)
{
System.out.println("The comp is"+comp+"studying jsp"+no);
}
}
class Main3
{
public static void main(String[]args)
{
Jsp j1=new Jsp();
j1.job(90);
j1.job("tcs");
j1.job(90,"has");
j1.job("has",90);
}
}
