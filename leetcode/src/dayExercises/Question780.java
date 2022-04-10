package dayExercises;

/**
 * @author zouzh
 * @date 2022/4/9 21:18
 */

//到达终点，从终点逆推
//正推通过递归会超时
//如果通过一系列的转换可以从起点 (sx, sy) 到达终点 (tx, ty)，则返回 true
//从点 (x, y) 可以转换到 (x, x+y)  或者 (x+y, y)
public class Question780 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx > sx && ty > sy && tx != ty) {
            if (tx > ty) {//直接取模就相当于减了很多次
                tx %= ty;
            } else {
                ty %= tx;
            }
        }
        if (tx == sx && ty == sy) {
            return true;
        } else if (tx == sx) {
            return ty > sy && (ty - sy) % tx == 0;
        } else if (ty == sy) {
            return tx > sx && (tx - sx) % ty == 0;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
