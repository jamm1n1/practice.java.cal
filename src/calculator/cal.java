package calculator;

import java.util.Scanner;

class cal2 {
	
	Scanner scanner = new Scanner(System.in) ;
		
int a, b;


public void set (int a, int b) {
	System.out.print(">>");
	int a1 = scanner.nextInt();
	this.a = a1;
	System.out.println("���� �������ּ���.");
	System.out.print(">>");
	int b1 = scanner.nextInt();
	this.b = b1;
}

 
public void sum () {
	System.out.print("���Ѱ��� ");
	System.out.print(this.a+this.b);
	System.out.println(" �Դϴ�.");
}
public void minus() {
	System.out.print("�A���� ");
	System.out.print(this.a-this.b);	
	System.out.println(" �Դϴ�.");
}
public void div() {
	System.out.print("�������� ");
	System.out.print(this.a/this.b);
	System.out.println(" �Դϴ�.");
}
public void mul() {
	System.out.print("���Ѱ��� ");
	System.out.print(this.a*this.b);
	System.out.println(" �Դϴ�.");
	
}
}
 
public class cal {

	public static void main(String[] args) {
		while(true) {
    cal2 g1 = new cal2();
    g1.set(0, 0);
    g1.sum();
    g1.minus();
    g1.div();
    g1.mul();	
 		
		}
}
}