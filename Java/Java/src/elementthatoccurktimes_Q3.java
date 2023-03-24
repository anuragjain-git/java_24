import java.util.Arrays;

public class elementthatoccurktimes_Q3 {

	public static void main(String[] args) {
		int arr[] = {1,2,5,4,5,4,3,2,2,45,2};
		int k = 2;
		int freq[] = new int[arr.length];
		boolean[] visited = new boolean[arr.length];
		Arrays.fill(visited, false);
		int count = 1;
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(visited[j]==false) {
					if(arr[i]==arr[j]) {
						visited[j]=true;
						count++;
						freq[i]=count;
					}	
				}
			}
			if(count==1) {
				freq[i]=count;
			}
			count=1;
		}

		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false && freq[i]>=k) {
				System.out.println(arr[i]+" "+freq[i]);
				return;
			}
		}
	}

	

}
