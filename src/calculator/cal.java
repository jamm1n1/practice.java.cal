package calculator;

import java.util.Scanner;

class cal2 {
	
	Scanner scanner = new Scanner(System.in) ;
		
int a, b;


public void set (int a, int b) {
	int a1 = scanner.nextInt();
	this.a = a1;
	int b1 = scanner.nextInt();
	this.b = b1;
}

 
public void sum () {
	System.out.println(this.a+this.b);
}
public void minus() {
	System.out.println(this.a-this.b);	
}
public void div() {
	System.out.println(this.a/this.b);
}
public void mul() {
	System.out.println(this.a*this.b);
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