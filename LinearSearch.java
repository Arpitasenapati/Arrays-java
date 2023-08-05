
//Index value of the target:
public class LinearSearch {
	static int linearsearch(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int target=7;
		int index=linearsearch(arr,target);
		if(index==-1) {
			System.out.println("target is not present in the array.");
		}
        System.out.println(index);	
       }

}

