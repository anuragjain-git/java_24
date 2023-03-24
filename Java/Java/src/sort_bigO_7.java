import java.util.Arrays;

public class sort_bigO_7 {

	public static void main(String[] args) {
		int size = 9;   
		int arr[] = {0,1,0,1,2,0,1,2,1};
		int currIndex = 0;
		int mid = 0;
		int temp = 0;
		int lastIndex = size-1;
		while(mid<=lastIndex) {
			if(arr[mid]==0) {
				temp = arr[currIndex];
				arr[currIndex] = arr[mid];
				arr[mid]=temp;
				mid++;currIndex++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				temp = arr[mid];
				arr[mid]=arr[lastIndex];
				arr[lastIndex]=temp;
				lastIndex--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
