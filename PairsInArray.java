//print all the pairs in an array:
public class PairsInArray {
	static void pairs(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,3,4,5};
        System.out.println("Pairs in array:");
        pairs(arr);
	}

}
