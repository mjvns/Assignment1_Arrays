
public class Array8 {

	public static void main(String[] args) {
		int arr[] = {0,0,0,0,5};
		rearrange(arr);
		
		for(int x: arr) {
			System.out.print(x+"\t");
		}
	}
	
	public static void rearrange(int arr[]) {		
		int numzeros = 0;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] == 0) {
				for(int x=i;x<arr.length-numzeros-1;x++) {
					arr[x] = arr[x+1];
				}
				arr[arr.length-numzeros-1] = 0;
				numzeros++;
			}
		}
	}

}
