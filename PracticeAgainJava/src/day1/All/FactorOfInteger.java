package day1.All;

public class FactorOfInteger {
	

	public static void main(String[] args) {
		/**
		 * 
		 * num=15
		 * 
		 * loop-->i=1 to i<= num num%i==0 println(i)
		 */
		factor(60);
		printFactorOfNegativeNumber(-60);
		printFactorOfPositiveNumber(20);

	}

	static void factor(int num) {
		if (num > 0) {
			for (int i = 0; i <= num; ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		} else {
			for (int i = num; i <= Math.abs(num); ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		}
		System.out.println(" Are the Factors of 60");
	}
	
	static void printFactorOfPositiveNumber(int num) {
		for (int i = 0; i <= num; ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + ", ");
					System.out.println("---------------------------");

				}
			}
		}
	}
	static void printFactorOfNegativeNumber(int num) {
		for (int i = num; i <= Math.abs(num); ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + ",a ");
					System.out.println("---------------------------");

				}
			}
		}
	}
}
/**
-60

*/


