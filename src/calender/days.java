package calender;
class days2 {
	int a, b, c ;
	public void set (int a, int b, int c ) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	public void sum () {
		System.out.println(a+b+c);
	}
}


public class days {

	public static void main(String[] args) {
	days2 x1 = new days2(1,2);
	x1.sum();
	}

}
