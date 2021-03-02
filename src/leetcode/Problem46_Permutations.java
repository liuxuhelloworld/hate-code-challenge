package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode-cn.com/problems/permutations/
 */
public class Problem46_Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		List<Integer> numList = Arrays.stream(nums)
			.boxed()
			.collect(Collectors.toList());

		backtrack(result, numList, 0);

		return result;
	}

	private void backtrack(List<List<Integer>> result, List<Integer> nums, int cur) {
		if (cur == nums.size()) {
			result.add(new ArrayList<>(nums));
			return;
		}

		for (int i = cur; i < nums.size(); i++) {
			Collections.swap(nums, i, cur);
			backtrack(result, nums, cur+1);
			Collections.swap(nums, i, cur);
		}
	}

	public static void main(String[] args) {
		Problem46_Permutations obj = new Problem46_Permutations();
		System.out.println(obj.permute(new int[] {1, 2, 3}));
	}
}
