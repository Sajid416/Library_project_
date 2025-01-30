
package librarymanage;


public class socket {
  String ip;
  int portid;  
socket(String IPad,int port)
{
 ip=IPad;
 portid=port;
}
void show()
{
System.out.println("ip adress is:"+ip+" portid:"+portid);

}
public static void main(String[] args)   
{    

socket firstcode=new socket("192.168.1.1",6666);
firstcode.show();
}   
}



