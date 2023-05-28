
public class Array6 {

	public static void main(String[] args) {
		int nums1[] = {2,5,6,0};
		int nums2[] = {7};
		int m = 3;
		int n = 1;
		
		nums1 = merge(nums1,nums2,m,n);
		
		for(int x: nums1) {
			System.out.print(x+"\t");
		}
	}
	
	public static int[] merge(int nums1[],int nums2[], int m, int n) {
		int i=0,j=0;
		int countelementstakenfromnums1 = 0;
		
		while(countelementstakenfromnums1<m && j<n) {
			if(nums1[i] < nums2[j]) {
				i++;
				countelementstakenfromnums1++;
			}else {
				for(int x=m+n-1;x>i;x--) {
					nums1[x] = nums1[x-1];
				}
				nums1[i] = nums2[j];
				j++;
				i++;
			}
		}
		
		while(countelementstakenfromnums1<m) {
			nums1[countelementstakenfromnums1+n] = nums1[i];
			i++;
			countelementstakenfromnums1++;
		}
		
		while(j<n) {
			nums1[m+j] = nums2[j];
			j++;
		}
		
		return nums1;
	}

}