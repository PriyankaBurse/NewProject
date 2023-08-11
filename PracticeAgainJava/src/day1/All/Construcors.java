package day1.All;

public class Construcors {
		int i = 10;
		 Construcors() {
			System.out.println("Running Class A constructor..");
		}
		void display() {
			System.out.println("I am display() of class A.");
		}
	}
	class X {
		int j = 10;
		X() {
			System.out.println("Running Class X constructor..");
		}
		void display() {
			System.out.println("I am display() of class X.");
		}
	}
	class Cons5 {
		void display() {
			System.out.println("I am display() of class Cons5.");
		}
	
		public static void main(String args[]) {
			System.out.println("Main() of Class Cons5 is started...");
			Construcors a1 = new Construcors();
			a1.display();
			System.out.println("Class A global varibale i = " + a1.i);
			X x1 = new X();
			x1.display();
			System.out.println("Class X global varibale j = " + x1.j);
			Cons5 c1 = new Cons5();
			c1.display();
			System.out.println("Main() of Class Cons5 is ends here...");
		}
	}

