package book;

import java.util.Scanner;

class bookserch{
	Scanner scanner = new Scanner(System.in);
	String a1 = "�ڹ��� ��";
    String b1 =  "�ȷ� Ȩ��";
  
String a, b;
public void serchbook (String args, String args2) {
	this.a1= args;
	this.b1= args2;	
	}
public void check() {
	System.out.println(this.a1+"a"+"���� �ֽ��ϴ�");
	System.out.println(this.b1+"b"+"���� �ֽ��ϴ�");
}

}


public class serch {

	public static void main(String[] args) {
		bookserch s1 = new bookserch();
		s1.serchbook("�ڹ��� ��", "�ȷ� Ȩ��" );
		s1.check();
   
	}

}
