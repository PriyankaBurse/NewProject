package day1.All;//To check Palindrome

public class PalindromeNumber {

	public static void main(String[] args) {
int rev=0,n=212;
int m=n;
for(int i=0;n>0;i++)
{
	int rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
System.out.println(rev);

if(m==rev)
{
	System.out.println("Number is Palindrome");
	
}
else
{
	System.out.println("Not a Palindrome");
	
}
	}

}
