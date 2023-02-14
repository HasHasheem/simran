class Instagram
{
void reply(int no)
{
System.out.println("Replyig no"+no);
}
void reply(String txtmsg)
{
System.out.println("replying txtmsg"+txtmsg);
}
void reply(int no,String txtmsg)
{
System.out.println("Replying no"+no+"replying txtmsg"+txtmsg);
}
void reply(String txtmsg,int no)
{
System.out.println("replying txtmsg"+txtmsg+"Replying no"+no);
}
}
class Main
{
public static void main(String[]args)
{
Instagram i1=new Instagram();
i1.reply(9);
i1.reply("Hi");
i1.reply(10,"Hello");
i1.reply("hello",19);
}
}
