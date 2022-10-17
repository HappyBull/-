package dayExercises;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zouzh
 * @date 2022/10/17 20:50
 */

public class Question904 {

    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        int left = 0, ans = 0;
        for (int i = 0; i < n; i++) {//这里相当于右窗口
            cnt.put(fruits[i], cnt.getOrDefault(fruits[i], 0) + 1);
            while (cnt.size() > 2) {//采摘的水果种类大于两种
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);//去除左边一棵树
                if (cnt.get(fruits[left]) == 0) {//如果这种水果数量为0 就删掉这种水果
                    cnt.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}
