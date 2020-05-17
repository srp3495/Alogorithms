package srp.learn.array;

public class MergeSort {
	
	public static int partition(int[] arr,int start,int end) {
		int pivot=arr[end];
		int p_index=start-1;
		for(int i=0;i<=end;i++) {
			if(arr[i]<=pivot) {
				
				p_index++;
				int temp=arr[p_index];
				arr[p_index]=arr[i];
				arr[i]=temp;
				
				
				
			}
			
		
		}
		int temp1=arr[p_index];
		arr[p_index]=pivot;
		arr[end]=temp1;
		
		for(int j=0;j<end;j++) {
			System.out.println(arr[j]);
		}
		return p_index;
	}
	
	public static void sort(int[] arr,int a,int b){
		
		int p_loc=partition(arr,a,b);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,5,7,1,4,8,9,4,6,77,98,34,34,543,22,114,455,675,4,3,66,9};
		int k=arr.length;
		sort(arr,0,k-1);
	}

}
