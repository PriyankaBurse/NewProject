package day11.StringClass;

public class SingleObject {
	/**
	 * 1. constructor should be private
	 * 2. create static ref variable of the class
	 * 3. create static method which return current class object
	 */
	//1. constructor should be private
	private SingleObject() {
		System.out.println("Singleton class cons");
	}
	//2. create static ref variable of the class
	public static SingleObject singleObj=new SingleObject();
	//3. create static method which return current class object
	public static SingleObject getSingletonObject() {
		return singleObj;
	}
	public void display() {
	
		System.out.println("I am display()");
	}
}
class Demo{
	
	public static void main(String[] args) {
		//SingleObject s1=new SingleObject();
		SingleObject s1=SingleObject.getSingletonObject();
		s1.display();
	}
}
