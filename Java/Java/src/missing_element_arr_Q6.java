import java.util.Arrays;

public class missing_element_arr_Q6 {

	public static void main(String[] args) {
		int size = 8;
		int arr[] = {2,5,4,7,9,1,3,6};
		Arrays.sort(arr);
		boolean check=false;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}

	}

}
