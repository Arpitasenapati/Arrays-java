import java.util.Arrays;

public class search2d {
	static int[] find (int[][] arr, int target) {
        int i = 0;
        int j = arr[i].length - 1;
        int[] ans = new int[2];
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            if (target > arr[i][j]) {
                j--;
            } else{
                i++;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        System.out.println(Arrays.toString(find(matrix, 5)));
	}

}
