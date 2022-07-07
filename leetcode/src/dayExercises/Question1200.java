package dayExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author zouz
 * @Date 2022/7/4 17:21
 */
public class Question1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr.length < 2) {
            return result;
        }
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        result.add(Arrays.asList(arr[0], arr[1]));
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < min) {
                result = new ArrayList<>();
                result.add(Arrays.asList(arr[i], arr[i + 1]));
                min = arr[i + 1] - arr[i];
            } else if ((arr[i + 1] - arr[i]) == min) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String sql = "  delete * from; 123";
        System.out.println(sql.substring(0,5));
        System.out.println(sql.split("\\;")[0]);
        System.out.println(sql.split("\\;")[1]);
        System.out.println(sql.trim().substring(0,6));
    }
}
