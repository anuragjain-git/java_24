import java.util.Arrays;

public class sum15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,1,2,4,2};
		int arr2[] = {2,2,-3,1,3};
		int sum=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//1,1,2,2,4
		//1,2,2,3,3
		for(int i=0;i<arr1.length;i++) {
			sum+=arr1[i]*arr2[arr2.length-1-i];
		}
		System.out.println(sum);
	}

}
