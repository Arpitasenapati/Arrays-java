//Max Sub Array Sum:Kadanes Algorithm
public class KadeneAlgo {
	static void kadanes(int arr[]) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum<0) {
				sum=0;
			}
			max=Math.max(max, sum);
		}
		System.out.println("The maximum subarray sum:"+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		kadanes(arr);

	}

}
