import java.util.Arrays;

public class equalsizeofarray_Q2 {

	public static void main(String[] args) {
		int n = 7;
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {1,2,3,4,5,6,7};
		boolean equal = false;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i =0;i<n;i++) {
			if(a[i]==b[i]) {
				equal=true;
			}	
		}
		System.out.println(equal);
	}

}
