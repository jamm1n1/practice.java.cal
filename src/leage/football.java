package leage;

import java.util.Scanner;

public class football {

	public static void main(String[]args){
		System.out.println("참가팀의 갯수를 쓰시오");
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		while(true) {
		int match = sc.nextInt();
		
		if(match<2) {
			System.out.println("경기가 성립되지 않습니다.");
		
		}
	int play = 0;
		for(int i = 1; i < match; i++) {
	     if(match>i) {
	    	 play+=i;
		 
	   
			}
		}
	
			System.out.println("경기수는"+play+"입니다");
	}
	}
}
