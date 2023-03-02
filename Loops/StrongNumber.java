//Checking whether given number is Strong number or not
import java.util.Scanner;
public class StrongNumber{
	public static void main(String[] args) {
		int num;
		StrongNumber obj = new StrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		obj.checkStrongNumber(num);
	}
	void checkStrongNumber(int a){
		int num = a;
		int digit = 0;
		int sum = 0;
		while(num != 0){
			int fact = 1;
			digit = num %10;
			for(int i = 1; i <= digit; i++){
				fact = fact * i;
			}
			sum += fact;
			num = num / 10;
		}
		if(sum == a){
		System.out.println("Given number " + a + " is a Strong number");
		}
		else{
		System.out.println("Given number " + a + " is not a Strong number");
		}
	}
}