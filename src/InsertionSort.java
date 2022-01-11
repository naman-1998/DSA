public class InsertionSort {
	private InsertionSort() {
	}
	public static void sort(int[] arr,int len){
		int temp=0;
		for(int i=1;i<len;i++){
			temp=arr[i];
			int j=i-1;
			while((j >= 0) && (arr[j] > temp)){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;

		}
	}
	public static void print(int arr[],int len){
		System.out.println("Sorted Array:");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");

		}
	}

	public static void main(String[] args) {
		int[] arr ={12,11,13,5,3};
		int len=arr.length;
		sort(arr,len);
		print(arr,len);
	}
}
