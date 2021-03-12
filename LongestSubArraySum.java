
public class LongestSubArraySum {
	
	/*kadane algorithm
	 * The simple idea of Kadane’s algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this). 
	 * And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this). 
	 * Each time we get a positive-sum compare it with max_so_far and update max_so_far if it is greater than max_so_far 
	 */
	
	public static int subArraySum(int[] arr) {
		
	int maxSoFar=0,maxEndingHere=0,i=0;
				
	for(i=0;i<arr.length;i++) {
		maxEndingHere=maxEndingHere+arr[i];
		if(maxEndingHere<0) {
			maxEndingHere=0;
		}
		else if(maxSoFar < maxEndingHere)	{
			maxSoFar=maxEndingHere;
		}
		
	}
		return maxSoFar;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println("Maximum contiguous sum of subArray  is " +
	        		subArraySum(a));
	}

}
