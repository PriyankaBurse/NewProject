package day1.All;

public class WhileLoopReverse {

	public static void main(String[] args) {
int n=879,i=0,rev=0;
while(n>0)
{
int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println(rev);
	}

}
