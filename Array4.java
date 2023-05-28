
public class Array4 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		int index = find(4,arr);
		System.out.println(index);
	}
	
	public static int find(int target, int arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
		
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		int pos=-1;
		
		if(start>end) {
			pos = start;
		}else if(end<start){
			pos = end;
		}
		
		if(pos<0) {
			pos = 0;
		}else if(pos>arr.length-1) {
			pos = arr.length;
		}
		
		return pos;
	}

}
