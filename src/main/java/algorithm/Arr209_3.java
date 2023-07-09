package algorithm;

/**
 * @author shkstart
 * @create 2023-06-15 22:00
 */
public class Arr209_3 {
    public static void main(String[] args) {
        Arr209_3 arr209 = new Arr209_3();
        int[] arr = new int[]{1,2,3,4,5};
        int i = arr209.minSubArrayLen(10, arr);
        System.out.println(i);

    }

    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;// 定义滑动窗口的左边界
        int sum = 0;// 定义滑动窗口中元素的和
        int result = Integer.MAX_VALUE;// 定义最终结果，初始值为整数的最大值
        for (int right = 0; right < nums.length; right++) {
            // 遍历数组，right表示滑动窗口的右边界
            sum += nums[right];
            while (sum >= s) {
                // 如果滑动窗口中元素的和大于等于s
                result = Math.min(result, right - left + 1);
                // 更新最终结果为当前滑动窗口的长度和之前的最终结果中较小的一个
                sum -= nums[left++];
                // 将滑动窗口的左边界向右移动一位，同时更新滑动窗口中元素的和
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
