
public class BinarySearch {
	static int binarysearch(int arr[],int key) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			while(start<=end) {
				if(arr[mid]==key) {
					return mid;
				}
				if(arr[mid]<key) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {2,5,6,9,10,11};
       int key=6;
       int index=binarysearch(arr,key);
       if(index==-1) {
    	   System.out.println("key is not present in the array.");
       }
       System.out.println("key is present in the index:"+index);
	}

}
