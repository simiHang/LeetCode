package course.arrayandstring;

public class FindInsertPlace {

    public int searchInsert(int[] nums, int target) {
        int output = 0;

        // 遍历nums， 比较target
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > target) {
                insert(nums, i);
                output = i;
                break;
            }
            if (nums[i] == target) {
                output = i;
                break;
            }
            if ((nums[i] < target) && (i < nums.length - 1)) {
                continue;
            }
            if ((nums[i] < target) && (i == nums.length - 1)) {
                insert(nums, i + 1);
                output = i + 1;
                break;
            }
        }

        return output;
    }

    /**
     * 插入
     *
     * @param nums        原数组
     * @param insertIndex 插入位置
     */
    private void insert(int[] nums, int insertIndex) {
        for (int i = insertIndex; i < nums.length - 1; i++) {
            nums[i + 1] = nums[i];
        }
    }


    public static int searchInsertStandard1(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

}
