package array;

/**
 * @Author zouz
 * @Date 2022/9/6 10:59
 */
public class QuickSort extends BaseSort {

    public static void main(String[] args) {
        int[] nums = {41, 24, 5, 32, 50, 34, 76, 57};
        QuickSort.quickArray(nums, 0, nums.length - 1);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    public static int[] quickArray(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        //方法入口
        int divPoint = doublePointerSwap(nums,start,end);
        quickArray(nums,start,divPoint-1);
        return nums;
    }

    /**
     * 双边指针（交换法）
     * 思路：
     * 记录分界值 pivot，创建左右指针（记录下标）。
     * （分界值选择方式有：首元素，随机选取，三数取中法）
     *
     * 首先从右向左找出比pivot小的数据，
     * 然后从左向右找出比pivot大的数据，
     * 左右指针数据交换，进入下次循环。
     *
     * 结束循环后将当前指针数据与分界值互换，
     * 返回当前指针下标（即分界值下标）
     */
    private static int doublePointerSwap(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int leftPoint = startIndex;
        int rightPoint = endIndex;

        while (leftPoint < rightPoint) {
            // 从右向左找出比pivot小的数据
            while (leftPoint < rightPoint
                    && arr[rightPoint] > pivot) {
                rightPoint--;
            }
            // 从左向右找出比pivot大的数据
            while (leftPoint < rightPoint
                    && arr[leftPoint] <= pivot) {
                leftPoint++;
            }
            // 没有过界则交换
            if (leftPoint < rightPoint) {
                swap(arr,leftPoint,rightPoint);
            }
        }
        // 最终将分界值与当前指针数据交换
        arr[startIndex] = arr[rightPoint];
        arr[rightPoint] = pivot;
        // 返回分界值所在下标
        return rightPoint;
    }

    /**
     * 双边指针（挖坑法）
     * 思路：
     * 创建左右指针。
     * 记录左指针数据为分界值 pivot，
     * 此时左指针视为"坑"，里面的数据可以被覆盖。
     *
     * 首先从右向左找出比pivot小的数据，
     * 找到后立即放入左边坑中，当前位置变为新的"坑"，
     * 然后从左向右找出比pivot大的数据，
     * 找到后立即放入右边坑中，当前位置变为新的"坑"，
     *
     * 结束循环后将最开始存储的分界值放入当前的"坑"中，
     * 返回当前"坑"下标（即分界值下标）
     */
    private static int doublePointerHole(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int leftPoint = startIndex;
        int rightPoint = endIndex;

        while (leftPoint < rightPoint) {
            // 从右向左找出比pivot小的数据，
            while (leftPoint < rightPoint
                    && arr[rightPoint] > pivot) {
                rightPoint--;
            }
            // 找到后立即放入左边坑中，当前位置变为新的"坑"
            if (leftPoint < rightPoint) {
                arr[leftPoint] = arr[rightPoint];
                leftPoint++;
            }
            // 从左向右找出比pivot大的数据
            while (leftPoint < rightPoint
                    && arr[leftPoint] <= pivot) {
                leftPoint++;
            }
            // 找到后立即放入右边坑中，当前位置变为新的"坑"
            if (leftPoint < rightPoint) {
                arr[rightPoint] = arr[leftPoint];
                rightPoint--;
            }
        }
        // 将最开始存储的分界值放入当前的"坑"中
        arr[rightPoint] = pivot;
        return rightPoint;
    }
}
