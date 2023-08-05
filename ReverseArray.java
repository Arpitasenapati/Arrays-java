import java.util.Arrays;

public class ReverseArray {
	static void reverse(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		reverse(arr);
		System.out.println("The reverse array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

	
}
