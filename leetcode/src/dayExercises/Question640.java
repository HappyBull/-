package dayExercises;

/**
 * @author zouzh
 * @date 2022/8/10 22:41
 */

public class Question640 {
    public static void main(String[] args) {

    }

    public String solveEquation(String equation) {
        int factor = 0, val = 0;
        int index = 0, n = equation.length(), sign1 = 1; // 等式左边默认系数为正
        while (index < n) {
            if (equation.charAt(index) == '=') {
                //等号右边系数默认-1
                sign1 = -1;
                index++;
                continue;
            }
            int sign2 = sign1, number = 0;
            boolean valid = false; // 记录 number 是否有效
            if (equation.charAt(index) == '-' || equation.charAt(index) == '+') {//去掉前面的符号
                sign2 = (equation.charAt(index) == '-') ? -sign1 : sign1;
                index++;
                valid = true;
            }
            while (n > index && Character.isDigit(equation.charAt(index))) {
                //继续遍历上一个符号后面的数字，每多一个数字就×10
                number = number * 10 + equation.charAt(index) - '0';
                index++;
                valid = true;
            }

            if (index < n && equation.charAt(index) == 'x') {
                factor += valid ? sign2 * number : sign2;
                index++;
            } else {
                val += sign2 * number;
            }
        }
        if (factor == 0) {
            return val == 0 ? "Infinite solutions" : "No solution";
        }
        return "x=" + (-val / factor);
    }
}
