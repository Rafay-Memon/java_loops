import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[] args) {
		int num;
		ReverseNumber obj = new ReverseNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		obj.reverseOfNumber(num);
	}
	void reverseOfNumber(int a){
		int num = a;
		int rev = 0;
		while(num != 0){
			int mod = num % 10;
			rev = rev * 10 + mod;
			num = num / 10;
			
		}
		System.out.println("Given number is: " + a);
		System.out.println("Reverse of this number is: " + rev);
	}
}