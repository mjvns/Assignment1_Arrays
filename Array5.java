
public class Array5 {
	public static void main(String args[]) {
		int arr[] = {9,9,9};
		arr = increment(arr);
		
		for(int x: arr) {
			System.out.print(x);
		}
	}
	
	public static int[] increment(int arr[]) {
		if(arr[arr.length-1]<9) {
			arr[arr.length-1]++;
		}else {
			int i = arr.length-1;
			int carryover = 2;
			
			while(i>=0 && carryover>0) {
				arr[i]++;
				carryover = arr[i]/10;
				arr[i] = arr[i]%10;
				i--;
			}
			
			if(carryover > 0) {
				int digit[] = new int[arr.length+1];
				digit[0] = 1;
				
				for(int x=1;x<digit.length;x++) {
					digit[x] = arr[x-1];
				}
				
				arr = digit;
			}
		}
		return arr;
	}
}
