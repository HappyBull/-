package dayExercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouzh
 * @date 2022/7/19 22:20
 */

public class Question731 {
    List<int[]> booked;
    List<int[]> overlaps;

    public Question731() {
        booked = new ArrayList<int[]>();
        overlaps = new ArrayList<int[]>();
    }

    public boolean book(int start, int end) {
        for (int[] arr : overlaps) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                return false;
            }
        }
        for (int[] arr : booked) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                overlaps.add(new int[]{Math.max(l, start), Math.min(r, end)});
            }
        }
        booked.add(new int[]{start, end});
        return true;
    }

    public static void main(String[] args) {

    }
}
