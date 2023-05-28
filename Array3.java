
public class Array3 {

	public static void main(String[] args) {
		
		int arr[] = {2,3,3,2};
		int val = 2;
		
		int k = removeOccurrence(arr,val);
		
		System.out.println(k);
		
		for(int x: arr) {
			System.out.print(x+"\t");
		}

	}
	
	public static int removeOccurrence(int arr[], int val) {
		int count = 0;
		
		for(int i=0;i<arr.length-count;i++) {
			if(arr[i] == val) {
				count++;
				for(int j=i+1;j<arr.length;j++) {
					arr[j-1] = arr[j]; 
				}
				i--;
			}
		}
		
		return count;
	}

}
