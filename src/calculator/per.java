package calculator;

import java.util.Scanner;

public class per {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.print("���� �Է��ϼ��� >>");
	        int a = sc.nextInt();
	   int cnt = 0;
	        System.out.println("������ϱ�");
	        for(int i=1; i<=a; i++) {
	        	if(a%i==0) {
	        		System.out.print(i+" ");
	        		cnt++;
	        		
	        	}
	        }
	        System.out.println("����� ����"+cnt);
	}
	}
	

