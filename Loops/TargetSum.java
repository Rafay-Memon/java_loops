// Finding the triplet sum of given target using one loop
public class TargetSum {
	public static void main(String[] args) {
		int[] arr = {12,4,1,6,3,2};
		int target = 25;
		int i = 0;
		int j = i + 1;
	    boolean cond = false;
		while(i < arr.length && j < 5)
		{
				if(arr[i] + arr[j] + arr [j +1] == target)
				{
					System.out.println("The three elements are: " + arr[i] + " " + arr[j] + " " + arr[j + 1]); 
					cond = true;
					break;
					
				}
				
				else if(j <= 3 && arr[i] + arr[j] + arr[j + 2] == target)
				{
					System.out.println("The three elements are: " + arr[i] + " " + arr[j] + " " + arr[j + 2]); 
					cond = true;
					break;
				}
				
				else if(j <= 2 && arr[i] + arr[j] + arr[j + 3] == target)
				{
					System.out.println("The three elements are: " + arr[i] + " " + arr[j] + " " + arr[j + 3]);
					cond = true;
					break;
				}
				
				else if(j == 1 && arr[i] + arr[j] + arr[j + 4] == target)
				{
					System.out.println("The three elements are: " + arr[i] + " " + arr[j] + " " + arr[j + 4]);
					cond = true;
					break;
				}
				else
				{
					cond = false;
				}
			if(j < 4 && cond == false)
				j = j + 1;
				
		    if (j == 4 && cond == false)
		    {
				i = i +1;
				j = i + 1;
		    }
		}
		if(cond == false)
		{
			System.out.println("There are no such three elements to fulfill this target");
		}
	}
}