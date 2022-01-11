import java.util.*;
public class UpperBound {

	public static int UB(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		int ans=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(nums[mid]==target) {
				ans=Math.max(ans, mid);
				start=mid+1;
			}else if(nums[mid]>target) {
				end=mid-1;
			}else if(nums[mid]<target) {
				start=mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr ={3,21,43,65,65,65,76,76,988,988};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int result=UB(arr,target);
		System.out.println(result);
	}
}
