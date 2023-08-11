package day1.All;//To check prime number

public class PrimeNumber {

	public static void main(String[] args) {
int n=2,m=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
	m++;
}

}
if(m==2)
{
	System.out.println("n is prime");
	
}
else
{
	System.out.println("not prime");
	
}
		
		
	}

}
