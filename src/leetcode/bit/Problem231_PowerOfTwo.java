package leetcode.bit;

/**
 * https://leetcode-cn.com/problems/power-of-two/
 */
public class Problem231_PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n-1)) == 0;
	}
}
