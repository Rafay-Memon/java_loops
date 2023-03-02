//Finding the kth largest element in given array
import java.util.Scanner;
public class KthLargestElement
{
	public static void main(String[] args)
	{
		int[] arr = {2,5,7,1,9,4};
		int pos;
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < (arr.length - 1); j++) {
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
				j = -1;
            }
            if(j == (arr.length - 2) )
            {
            	System.out.println("Which kth largest element you want to know?");
				pos = sc.nextInt();
				if(pos > 0 && pos < (arr.length + 1))
				{
					System.out.println("The " + pos + " largest element in this array is: " + arr[pos - 1]);
					break;
				}
			else
			{
				System.out.println("Sorry you have exceed the range because the least largest element in this array is: " + arr.length + "th"+ " which is " + arr[arr.length - 1]);
		        break;
			}
            }
		}
	}
}