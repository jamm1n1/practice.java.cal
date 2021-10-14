package calculator;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		System.out.print("알고싶은 단을 입력하시오 :");
		Scanner sc = new Scanner(System.in);
int g = sc.nextInt();

  for(int i = 1; i < 10; i++) {
	  System.out.println(g*i);
    sc.close();
    }
    
	}

}
