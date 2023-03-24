
public class Q9 {

	public static void main(String[] args) {
		int arr[]= {20,30,10,50,30,90};
		int max=0;
		for(int i=0;i<arr.length-1;i++) {	
			max = arr[i+1]-arr[i]>0 ? arr[i+1]-arr[i]:0; 				
		}

	}

}
