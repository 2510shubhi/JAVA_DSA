import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSum(int[] arr1,int tar) {
		
		
		/* 1.brute force aaproach o(n*n)
		int[] arr3 = new int[3];
		int k =0;
		
		for(int i = 0;i < arr1.length;i++) {
			int temp = arr1[i];
		for(int j = i+1;j<arr1.length;j++) {
		//	int temp1 = arr1[j+1];
			if((temp+arr1[j])==tar) {
				
				arr3[k]=j;
				arr3[k+1]=i;
				//break;
			}
			//break;
		}
		}
		
		return arr3;*/
		
		//2.o(n) hash map approach
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i = 0;i<arr1.length;i++) {
			
			int complement = tar-arr1[i];
			
			if(hm.containsKey(complement) && hm.get(complement)!=i) {
				
				return new int[] {hm.get(complement),i};
				
			}
			hm.put(arr1[i], i);
		}
		 throw new IllegalArgumentException("No two sum solution");
		
	}
	
	
	public static void main(String[] args)
	{
		TwoSum obj = new TwoSum();
	
	int[] arr1 = {2, 3, 4, 5, 7};
	int tar = 8;
	int n1 = arr1.length;

	int[] arr3=obj.twoSum(arr1, tar);

	System.out.println("target indices");
	for (int i=0; i < 2; i++)
	    System.out.print(arr3[i] + " ");

	}

}
