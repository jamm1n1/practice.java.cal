package cal;

import java.util.Scanner;

import calender.calender;

public class calender2 {

	public static void main(String[] args) {

	Scanner scanner= new Scanner(System.in);
	calender cal= new calender();
	while (true){
	System.out.println("�⵵�� �Է��ϼ���.");
	System.out.print("Year>");
	int year = scanner.nextInt();
	System.out.println("���� �Է��ϼ���");
	System.out.print("Month>");
	int days = scanner.nextInt();
	if (days == -1) {
				break;
	}
	if (days > 12 ) { 
		break;
	}
	cal.printcalender2(year, days);
	}

	scanner.close();

}
}



