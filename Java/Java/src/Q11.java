
public class Q11 {

	public static void main(String[] args) {
		int arr[]= {15,-2,-8,1,7,2};
		int length=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==0) {
					length=Math.max(length, j-i+1);
				}
			}
			
		}System.out.println(length);
	}

}
