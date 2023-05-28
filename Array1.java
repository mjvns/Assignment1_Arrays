import java.util.Scanner;
public class Array1 {

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
		
		for(int a=0;a<n-1;a++) {
			for(int j=a+1;j<n;j++) {
				if(arr[a]+arr[j] == target) {
					System.out.println("Indices: "+a+","+j);
					break;
				}
			}
		}
		
	}

}
