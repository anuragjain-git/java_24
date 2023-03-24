import java.util.Arrays;

public class zig_zag_arrayQ2 {

	public static void main(String[] args) {
		int arr[] = {3,2,5,4,7,9,6,8,1,0,10};
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length-1;i=i+2) {
			int temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
