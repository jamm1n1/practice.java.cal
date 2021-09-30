package team2;

import java.util.Scanner;

class thirtyonegame{
	 
	  Scanner scanner = new Scanner(System.in);
	int a;
	  public void number (int a) {
		 
		  int a1= scanner.nextInt();
		  this.a =a1;
	  
	  }
public void gamestart() {
	System.out.print(">>");
	if(a<0 )
		System.out.println(this.a);
		if(a==31)
			System.out.println("lose");
		
		
	}

}


public class randomgame {

	public static void main(String[] args) {
		 System.out.println("베스킨라빈스 게임을 시작하겠습니다.");
		 System.out.print(">>");
		  while (true) {
		thirtyonegame h1 = new thirtyonegame();
        h1.number(0);
        h1.gamestart();
	}
	}
}
