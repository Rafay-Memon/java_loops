//Checking whether given number is Amstrong number or not
import java.util.Scanner;
public class AmstrongNumber{
	public static void main(String[] args) {
		int num;
		AmstrongNumber obj = new AmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		obj.checkAmstrongNumber(num);
	}
	void checkAmstrongNumber(int a){
		int getDigit = a;
		int num = a;
		int digit = 0;
		int sum = 0;
		int digitCount = 0;
		while(getDigit != 0){
			getDigit = getDigit / 10;
			digitCount++;
		}
		while(num != 0){
			int pow = 1;
			digit = num %10;
			for(int i=1; i<=digitCount; i++){
				pow = pow * digit;
			}
			sum += pow;
			num = num / 10;
			
		}
		if(sum == a){
		System.out.println("Given number " + a + " is an Amstrong number");
		}
		else{
		System.out.println("Given number " + a + " is not an Amstrong number");
		}
	}
}