package dayExercises;

/**
 * @Author zouz
 * @Date 2022/9/13 16:25
 */
public class Question670 {
    //从左到右依此遍历
    //每次遍历从尾部寻找比他大最多的数和他交换
//    public int maximumSwap(int num) {
//        char[] charArray = String.valueOf(num).toCharArray();
//        int current;
//        int max;
//        int maxIndex = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            current = charArray[i];
//            if (current == 57) {
//                continue;
//            }
//            max = current;
//            for (int j = charArray.length - 1; j >= i + 1; j--) {
//                if (charArray[j] > max) {
//                    max = charArray[j];
//                    maxIndex = j;
//                    if (max == 57) {
//                        break;
//                    }
//                }
//            }
//            if (max != current) {
//                //i和j交换 i的值为current j的值为max
//                char temp = charArray[i];
//                charArray[i] = charArray[maxIndex];
//                charArray[maxIndex] = temp;
//                break;
//            }
//        }
//        return Integer.parseInt(new String(charArray));
//    }

    //本质是贪心思想
    public int maximumSwap(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int n = charArray.length;
        int maxIdx = n - 1;
        int idx1 = -1, idx2 = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (charArray[i] > charArray[maxIdx]) {
                maxIdx = i;
            } else if (charArray[i] < charArray[maxIdx]) {
                idx1 = i;
                idx2 = maxIdx;
            }
        }
        if (idx1 >= 0) {
            swap(charArray, idx1, idx2);
            return Integer.parseInt(new String(charArray));
        } else {
            return num;
        }
    }

    public void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    public static void main(String[] args) {
        Question670 question670 = new Question670();
        question670.maximumSwap(2736);
    }
}
