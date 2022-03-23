package dayExercises;

/**
 * @Author zouz
 * @Date 2022/3/23 14:03
 */
/*
困难题目:字典序的第K小数字
解析:字典树的先序遍历满足字典大小递增
如1，10，11，12，13，2，3，4，5，6，7，8，9
                              1               2 3 4 5 6 7 8 9
                        10  11  12  13
                     100  101
 */
public class Question440 {
    //1.判断当前节点有多少子节点step（i）
    // 2.如果子节点个数小于K，那么目标就不在当前节点和他的子节点里 k=k-step（i），去他的相邻节点做同样的操作
    // 3.如果子节点个数大于K，那么k=k——1 再对当前节点的第一个下级节点重复进行上述操作
    //注意同时需要满足所有遍历节点的最大值不能大于n
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while (k > 0) {
            int step = getSteps(curr, n);
            if (step <= k) { //不在当前curr的节点树上
                k -= step;
                curr++;
            } else {
                curr *= 10; //在当前结点树上，对他的第一个子节点重复操作
                k--;
            }
        }
        return curr;
    }

    protected int getSteps(int curr, long n) {
        int steps = 0;
        int first = curr;
        int last = curr;
        while (first <= n) {
            steps += Math.min(n, last) - first + 1; //当前节点行的节点个数
            first = first * 10; //当前节点的第一个子节点
            last = last * 10 + 9;//当前节点的理论最后一个节点
        }
        return steps;
    }
}
