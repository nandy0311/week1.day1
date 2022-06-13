package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1 = 0, num2=1;
		int sum;
		int count=8;
		System.out.println(num1);
		for( int i=2;i<=count;i++) {
			
			sum= num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(num1);
		}

	}

}
