class Base
{
 public int[] mergeSortedArray (int[] arr1, int[] arr2) {

	int lenArr1 = arr1.length;
	int lenArr2 = arr2.length;
	int lenArr3 = lenArr1+lenArr2;
	int[] arr3= new int[lenArr3];
	 int i =0 , j=0,k=0;
	 while(i<lenArr1 && j<lenArr2) {
	 if(arr1[i]<arr2[j]) {
		 
		 arr3[k++]=arr1[i++];
	}
	 else {
		 arr3[k++]=arr2[j++];
	 }
	 }
	 while(i<lenArr1) {
		 arr3[k++]=arr1[i++];
		                
	 }
	 while(j<lenArr2) {
		 arr3[k++]=arr2[j++];
	 }
		 
		 
	return arr3;
 }
public static void main(String[] args)
{
Base obj = new Base();
int[] arr1 = {1, 3,4, 5, 7};
int n1 = arr1.length;

int[] arr2 = {2, 4, 6, 8};
int n2 = arr2.length;

int[] arr3= {};
 
arr3=obj.mergeSortedArray(arr1, arr2);

System.out.println("Array after merging");
for (int i=0; i < n1+n2; i++)
    System.out.print(arr3[i] + " ");

}
}