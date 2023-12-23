package course.arrayandstring;

public class FindPovitPlace {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;

        int beforSum = 0;
        for (int i = 0; i<nums.length - 1; i++) {
            beforSum += nums[i];
            if (beforSum * 2 == sum - nums[i])
                return i;
        }
        return -1;
    }
}
