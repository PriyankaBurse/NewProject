package day1.All;

public class SwitchStatement {

	public static void main(String[] args) {
		
System.out.println(checkvowel('o'));
	
	System.out.println(""+checkvowel(4,6));
	}
	static boolean checkvowel(int a,int b) {
		return false ;
	}
	static boolean checkvowel(char vowel)
	{
		
switch(vowel) {
case 'a':
{
System.out.println("Yes,a is vowel");
return true;
}
case 'e':
{
System.out.println("Yes,e is vowel");
return true;
}
case 'i':
{
System.out.println("Yes,i is vowel");
return true;
}
case 'o':
{
System.out.println("Yes,o is vowel");
return true;
}
case 'u':

System.out.println("Yes,u is vowel");
return true;

default:
	System.out.println("None");
return true;
}
	}

}
/**
 * break: means break the current flow
 * default: is not a mandatory case
 */ 
