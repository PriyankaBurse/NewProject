package day1.All;//Reverse a number using for loop

public class ReverseNumber {

	public static void main(String[] args) {
int n=4115,i=0,rev=0;
for(i=0;n>0;i++)
{
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
System.out.println(rev);
	}

}
