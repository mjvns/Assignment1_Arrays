import java.util.HashMap;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Mention array length");
		
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array elements separated by space");
		
		int i = 0;
		while(i<n) {
			arr[i] = scan.nextInt();
			i++;
		}
		
		System.out.println("Specify target : ");
		
		int target = scan.nextInt();
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int a=0;a<n;a++) {
			int elem = arr[a];
			int remaining = target-elem;
			
			if(hm.containsKey(remaining)) {
				System.out.println("Indices : "+"["+a+","+hm.get(remaining)+"]");
				break;
			}
			if(!hm.containsKey(elem)) {
				hm.put(elem, a);
			}
		}
		
	}

}
