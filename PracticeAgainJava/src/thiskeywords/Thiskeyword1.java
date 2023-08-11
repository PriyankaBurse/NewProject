package thiskeywords;

class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee) {		
		rollno = rollno;
		fee = fee;
	//	System.out.println(rollno + " " +  fee);

	}
	void display() {
		//System.out.println(rollno + " " +  fee);
	}
}
class Thiskeyword1 {
	public static void main(String args[]) {
		Student s1 = new Student(111, 5000f);
		s1.display();//
		Student s2 = new Student(112, 6000f);
		s2.display();//
		System.out.println(s1.rollno + " " +  s1.fee);

	}
}