import java.util.Arrays;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {43,22,68,55,61,12};
		int arr1[] = {43,22,68,55,61,12};
		int k=25 ;                                                                                                                                                                              ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-k<0) {
				arr[i]+=k;
			}
			else {
				arr[i]-=k;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length-1]-arr[0]);
		
	}
}