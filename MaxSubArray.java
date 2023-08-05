//print max sub array:Brute force
public class MaxSubArray {
	static void maxsubarr(int arr[]) {
		int max=Integer.MIN_VALUE;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum=0;
				for(int k=i;k<=j;k++) {
					sum=sum+arr[k];
				}
				System.out.println(sum+" ");
//				System.out.println();
				if(max<sum) {
					max=sum;
				}
			}
		}
		System.out.println("max sum :"+max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
        maxsubarr(arr);
	}

}
