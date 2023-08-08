//To find the index of target on an sorted array using binary search:
public class BinarySearch2 {
	static int binarysearch(int arr[],int key) {
		int start=0;
	    int end=arr.length-1;
	  
	    while(start<=end) {
			int mid=(start+end)/2;

			//ascending order
			if(arr[start]<arr[end]) {
				if(arr[mid]==key) {
					return mid;
				}
				if(arr[mid]<key) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
		   //desending order:
		   if(arr[start]>arr[end]) {
				if(arr[mid]==key) {
					return mid;
				}
				if(arr[mid]<key) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,9,8,7,6};
		int key=8;
	    int index=binarysearch(arr,key);
	    if(index==-1) {
	    	System.out.println("key is not present in the array.");
	       }
	       System.out.println("key is present in the index:"+index);
		}
	}

