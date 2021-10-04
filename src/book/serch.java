package book;

import java.util.Scanner;

class bookserch{
	Scanner scanner = new Scanner(System.in);
	String a1 = "자바의 신";
    String b1 =  "셜록 홈즈";
  
String a, b;
public void serchbook (String args, String args2) {
	this.a1= args;
	this.b1= args2;	
	}
public void check() {
	System.out.println(this.a1+"a"+"열에 있습니다");
	System.out.println(this.b1+"b"+"열에 있습니다");
}

}


public class serch {

	public static void main(String[] args) {
		bookserch s1 = new bookserch();
		s1.serchbook("자바의 신", "셜록 홈즈" );
		s1.check();
   
	}

}
