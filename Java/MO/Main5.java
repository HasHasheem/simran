class Company
{
static void work(int no)
{
System.out.println("No of work completed"+no);
}
static void work(char id)
{
System.out.println("emp section"+id);
}
static void work(int no,char id)
{
System.out.println("No of work completed"+no+"emp section"+id);
}
static void work(char id,int no)
{
System.out.println("emp section"+id+"No of work completed"+no);
}
}
class Main5
{
public static void main(String[]args)
{
Company.work(2);
Company.work('a');
Company.work(2,'d');
Company.work('d',2);
}
}
