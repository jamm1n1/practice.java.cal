package circle;

import java.util.Scanner;

public class me {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		is_prime(sc.nextInt());
	}
	public static void is_prime(int num) {
		if(num<2) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			return;
		}
	if(num==2) {
		System.out.println("�Ҽ� �Դϴ�.");
		return;
	}
	for(int i = 2; i < num; i++) {
        
	
		if(num % i == 0) {
			System.out.print("�Ҽ��� �ƴմϴ�");
			return;
		}
	}
	System.out.print("�Ҽ��Դϴ�");
	return;
	}
	}
