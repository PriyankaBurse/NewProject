package day6.Abstraction;
interface Printable {
	int age=30;//by default public static final
	void print();
}
interface Showable {
	public void show();
}
public class Imterface3 implements Printable, Showable {
	public static int age=45;
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	public static void main(String args[]) {
		Imterface3 obj = new Imterface3();
		obj.print();
		obj.show();
		System.out.println(Printable.age);
		System.out.println(Imterface3.age);
	}
}