package leage;

import java.util.Scanner;

public class football {

	public static void main(String[]args){
		System.out.println("�������� ������ ���ÿ�");
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		while(true) {
		int match = sc.nextInt();
		
		if(match<2) {
			System.out.println("��Ⱑ �������� �ʽ��ϴ�.");
		
		}
	int play = 0;
		for(int i = 1; i < match; i++) {
	     if(match>i) {
	    	 play+=i;
		 
	   
			}
		}
	
			System.out.println("������"+play+"�Դϴ�");
	}
	}
}
