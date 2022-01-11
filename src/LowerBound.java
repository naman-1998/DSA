import java.util.*;

public class LowerBound {
	private LowerBound() {
	}
	//Find first occurence of a given input
	public static int LB(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int ans = Integer.MAX_VALUE;
		boolean flag = false;
		while (start <= end) {
			int mid = (start + end) / 2;
			System.out.println("Value of mid = " + nums[mid]);
			if (nums[mid] == target) {
				flag = true;
				ans = Math.min(ans, mid);
				end = mid - 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			}
		}
		if (!flag) {
			return -1;
		}
		return ans;
	}

	public static void main(String[] args) {
	int[] arr ={3,21,43,65,65,65,76,76,988,988};
	Scanner sc=new Scanner(System.in);
	int target=sc.nextInt();
	int result=LB(arr,target);
		System.out.println(result);
	}
}
