//Finding duplicate elements in array using 1 loop
public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,6,3,2,3,1,2};
		int count = 0;
		boolean cond = false;
		int i = 0;
		int j = i + 1;
		while(i < (arr.length - 1) && j < arr.length){
				if(arr[i] == arr[j]){
					System.out.println("The duplicate element is: " + arr[i]);
					count++;
					cond = true;
				}
				
				if(j == (arr.length - 1) || cond == true)
				{
					i = i + 1;
					j = i + 1;
					cond = false;
				}
				j++;
			}

		if(count == 0)
		{
			System.out.println("No duplicate element found!!");
		}
	}
}


