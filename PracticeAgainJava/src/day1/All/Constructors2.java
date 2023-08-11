package day1.All;

public class B {
	int i=2;
	B(){
		i=8;
	}

}
class Constructors2{
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");
		B b1 = new B();
		System.out.println("Class B global varibale i = " + b1.i);
		System.out.println("======================================");
		B b2 = new B();
		System.out.println("Class B global varibale i = " + b2.i);
		System.out.println("Main() of Class Cons5 is ends here...");
	}
}
s

