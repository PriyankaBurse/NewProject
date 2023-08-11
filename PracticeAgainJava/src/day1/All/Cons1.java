package day1.All;
class C {
	int i = 10;
	C() {
		System.out.println("Running Class B constructor..");
		i = 23;
	}
}

public class Cons1 {

	public static void main(String args[]) {
		System.out.println("Main() of Class Cons1 is started...");
		C b1 = new C();
		System.out.println("Class c global varibale i = " + b1.i);
		System.out.println("======================================");
		C b2 = new C();
		System.out.println("Class C global varibale i = " + b2.i);
		System.out.println("Main() of Class Cons5 is ends here...");
	}
}


