package common;

import java.util.List;

/**
 * @author zouzh
 * @date 2022/4/8 23:11
 */

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
    public static void main(String[] args) {

    }
}
