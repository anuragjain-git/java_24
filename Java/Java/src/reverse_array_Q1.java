import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse_array_Q1 {
	static int arr[]= {0,1,2,3,4,5,6,7};
	static int k=3;
	
	public static void reverse(int i,int j) {
		int temp=0;
		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}

	public static void main(String[] args) {

		for(int i =0;i<arr.length;i=k+i) {
			if(k+i < arr.length) {
				reverse(i, k+i-1);
			}
			else {
				reverse(i,arr.length-1);
			}
		}
			for(int i: arr) {
				System.out.print(i+" ");
			}
		}
}
