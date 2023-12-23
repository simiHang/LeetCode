import course.arrayandstring.FindInsertPlace;
import course.arrayandstring.FindPovitPlace;

public class Qqq {

    public static void main(String[] args) {
//        int[] nums = new int[]{1,7,3,6,5,6};
//        FindPovitPlace findPovitPlace = new FindPovitPlace();
//        System.out.println(findPovitPlace.pivotIndex(nums));

        int[] nums = new int[]{1, 3, 5, 6};
        FindInsertPlace findInsertPlace = new FindInsertPlace();
        System.out.println(findInsertPlace.searchInsert(nums, 5));
    }
}
