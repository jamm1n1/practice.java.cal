package circle;

import java.util.Scanner;

public class me {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		is_prime(sc.nextInt());
	}
	public static void is_prime(int num) {
		if(num<2) {
			System.out.println("소수가 아닙니다.");
			return;
		}
	if(num==2) {
		System.out.println("소수 입니다.");
		return;
	}
	for(int i = 2; i < num; i++) {
        
	
		if(num % i == 0) {
			System.out.print("소수가 아닙니다");
			return;
		}
	}
	System.out.print("소수입니다");
	return;
	}
	}
