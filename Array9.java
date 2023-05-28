
public class Array9 {

	public static void main(String[] args) {
		int arr[] = {1,2,2,4};
		int res[] = findDuplicates(arr);
		
		for(int x: res) {
			System.out.print(x+"\t");
		}
	}
	
	public static int[] findDuplicates(int arr[]) {
		int hash[] = new int[arr.length+1];
		
		for(int i=0;i<arr.length;i++) {
			hash[arr[i]]++;
		}
		
		int duplicate = -1;
		int missing = -1;
		
		for(int x=1;x<arr.length+1;x++) {
			if(hash[x] > 1) {
				duplicate = x;
			}
			if(hash[x] == 0) {
				missing = x;
			}
		}
		
		int result[] = {duplicate,missing};
		return result;
	}

}
