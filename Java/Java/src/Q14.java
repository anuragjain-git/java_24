import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		int arr1[] = {4,3,2,1,5,7,8};
		int arr2[] = {9,5,7,3,4,1,2,6};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//1,2,3,4,5,7,8
		//1,2,3,4,5,6,7,9
		int sum =10;
		int newsum=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				newsum=arr1[i]+arr2[j];
				if(newsum==sum) {
					System.out.println(arr1[i]+" "+arr2[j]);
				}
			}
		}
	}

}
