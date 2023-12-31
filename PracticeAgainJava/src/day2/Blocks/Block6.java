package day2.Blocks;


public class Block6 {
	
	Block6(){
		this(10);
		System.out.println("zero-param cons..");
	}
	Block6(int i){
		System.out.println("int-param cons..");
	}
	
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}
	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Block6 b1=new Block6();
		System.out.println("---------------------------------");
		Block6 b2=new Block6();
		System.out.println("main() ends");
	}
	/* static block or SIB*/
	static {		
		System.out.println("running static-block-2 of class Blocks2..");		
	}
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}
}