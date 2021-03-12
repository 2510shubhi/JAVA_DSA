
public class MoveZerosAtEnd {

	static int[] pushZerosToEnd(int[] arr, int size) {
		
		int count = 0;
		
		for(int i =0;i< size;i++){
			if(arr[i]!=0) { //check if number is not equal to zero
				arr[count++]=arr[i]; //put non zero elements first
			}
			
		}
		while(count<size) { //put zero for remaining size after shifting
			arr[count++]=0;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 9, 8, 4,0, 0, 0, 2, 7, 0, 7,9, 0, 9}; 
        int size = arr.length; 
        pushZerosToEnd(arr, size); 
        System.out.println("Array after pushing zeros to the back: "); 
        for (int i=0; i<size; i++) 
            System.out.print(arr[i]+" "); 

	}

}
