package Solutions;

import java.util.ArrayList;
import Execute.Node;

public class Solution559 {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int res = 1;
        for (Node child : root.children) {
            res = Math.max(res, maxDepth(child) + 1);
        }
        return res;
    }
    public static void main(String[] args){
        Node child11 = new Node(11,null);
        Node child12 = new Node(12,null);

        Node child21 = new Node(21,null);

        ArrayList ll =new ArrayList<>();
        ll.add(new Node(222,null));

        Node child22 = new Node(22,ll);
        ll =new ArrayList<>();
        ll.add(child11);
        ll.add(child12);
        Node child1 = new Node(1,ll);

        ll =new ArrayList<>();
        ll.add(child21);
        ll.add(child22);
        Node child2 = new Node(2,ll);

        ll =new ArrayList<>();
        ll.add(child1);
        ll.add(child2);
        Node root = new Node(10,ll);
//            10
//      1            2
//    11  12     21       22
//                     222
        Solution559 test = new Solution559();
        System.out.println(test.maxDepth(root));

    }
}
