package day2.Blocks;

public class Blocks3 {
	
	Blocks3(){
		System.out.println("zero-param cons...");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block of class Blocks3..");
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Blocks3 b1=new Blocks3();
		System.out.println("---------------------------------");
		Blocks3 b2=new Blocks3();
		System.out.println("main() ends");
	}
}