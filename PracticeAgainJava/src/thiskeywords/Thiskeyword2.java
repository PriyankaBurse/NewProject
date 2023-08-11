package thiskeywords;


public class Thiskeyword2 {
	int x;
	// Constructor with a parameter
	public Thiskeyword2(int x) {
		this.x = x;
		System.out.println(x);
	}

	// Call the constructor
	public static void main(String[] args) {
		Thiskeyword2 myObj = new Thiskeyword2(5);
		System.out.println("Value of x = " + myObj.x);//
	}

}