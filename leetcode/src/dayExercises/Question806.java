package dayExercises;

/**
 * @Author zouz
 * @Date 2022/4/12 17:37
 */
//写字符串需要的行数
public class Question806 {
    public int[] numberOfLines(int[] widths, String s) {
        int lineNum = 0,lineWidth=0;
        for (int i = 0; i < s.length(); i++) {
            int width = widths[s.charAt(i)-'a'];
            if ((width + lineWidth) > 100) {
                lineWidth = width;
                lineNum+=1;
            }else {
                lineWidth += width;
            }
        }
        return new int[] {lineNum, lineWidth};
    }
}
