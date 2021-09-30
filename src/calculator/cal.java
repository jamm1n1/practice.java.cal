package calculator;

import java.util.Scanner;

class cal2 {
	
	Scanner scanner = new Scanner(System.in) ;
		
int a, b;


public void set (int a, int b) {
	System.out.print(">>");
	int a1 = scanner.nextInt();
	this.a = a1;
	System.out.println("값을 대입해주세요.");
	System.out.print(">>");
	int b1 = scanner.nextInt();
	this.b = b1;
}

 
public void sum () {
	System.out.print("더한값은 ");
	System.out.print(this.a+this.b);
	System.out.println(" 입니다.");
}
public void minus() {
	System.out.print("뺸값은 ");
	System.out.print(this.a-this.b);	
	System.out.println(" 입니다.");
}
public void div() {
	System.out.print("나눈값은 ");
	System.out.print(this.a/this.b);
	System.out.println(" 입니다.");
}
public void mul() {
	System.out.print("곱한값은 ");
	System.out.print(this.a*this.b);
	System.out.println(" 입니다.");
	
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