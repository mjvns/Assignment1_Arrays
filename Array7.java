import java.util.HashMap;

public class Array7 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,1};
		boolean status = checkDuplicates(arr);
		
		System.out.println(status);
	}
	
	public static boolean checkDuplicates(int arr[]) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int x = arr[i];
			
			if(hm.containsKey(x)) {
				return true;
			}else {
				hm.put(x, 1);
			}
		}
		
		return false;
	}
}