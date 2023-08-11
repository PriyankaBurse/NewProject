package day10.ScannerClass;

class Demo{
	void display() {
		System.out.println("Demo class display method");
	}
	void callMe() {
		System.out.println("Demo class callMe method");//
	}
}
public class StaticReference {

       static Demo d10=new Demo();
	
	void test() {
		System.out.println("StaticReference class test method");
	}
	public static void main(String[] args) {
		
		StaticReference.d10.callMe();// classname.ref.method
		StaticReference.d10.display();
				
		Demo d1=new Demo();
		d1.display();
		d1.callMe();
		
		StaticReference s1=new StaticReference();
		s1.test();
	}

}