package day1.All;//To make any variable constant,we should use final keyword

public class finalkeyword {

	public static void main(String[] args) {
final int age=5;
System.out.println("age-"+age);
//age=8;
System.out.println("age-"+age);
//age=90;
System.out.println("age-"+age);
System.out.println("age-"+age);	
	}

}
/**when we don't want anyone to change our variable value dn that variable should be declared with final keyword
if you try to change value of final variable dn it will give a compile time error
*/