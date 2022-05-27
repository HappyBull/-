package dayExercises;

/**
 * @Author zouz
 * @Date 2022/3/22 10:23
 */
/*
如果相邻两个颜色均相同则删除当前颜色
Alice 和 Bob 在玩一个游戏，他们 轮流从这个字符串中删除颜色。Alice 先手。

如果一个颜色片段为 'A'且 相邻两个颜色都是颜色 'A'，那么 Alice 可以删除该颜色片段。Alice不可以删除任何颜色'B'片段。
如果一个颜色片段为 'B'且 相邻两个颜色都是颜色 'B'，那么 Bob 可以删除该颜色片段。Bob 不可以删除任何颜色 'A'片段。
Alice 和 Bob 不能从字符串两端删除颜色片段。
如果其中一人无法继续操作，则该玩家 输 掉游戏且另一玩家 获胜 。

 */
public class Question2038 {
    /*
    实际操作起来不可删除两边元素，所以每次删除A不会影响B的可删除情况
    根据贪心策略，只要看A和B每次删除一个的情况下，谁需要更多的次数删完谁就输
     */
    public static boolean winnerOfGame(String colors) {
        String[] a = colors.split("B");
        int numA = 0;
        int numB = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 2) {
                numA += (a[i].length() - 2);
            }
        }

        String[] b = colors.split("A");
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() > 2) {
                numB += (b[i].length() - 2);
            }
        }
        if (numA > numB) {
            return true;
        }

        return false;
    }

    //官方推荐写法
//    public boolean winnerOfGame(String colors) {
//        int[] freq = {0, 0};
//        char cur = 'C';
//        int cnt = 0;
//        for (int i = 0; i < colors.length(); i++) {
//            char c = colors.charAt(i);
//            if (c != cur) {
//                cur = c;
//                cnt = 1;
//            } else {
//                cnt += 1;
//                if (cnt >= 3) {
//                    freq[cur - 'A'] += 1;
//                }
//            }
//        }
//        return freq[0] > freq[1];
//    }

    public static void main(String[] args) {
        System.out.println(winnerOfGame("ABBBBBBBAAA"));
    }
}
