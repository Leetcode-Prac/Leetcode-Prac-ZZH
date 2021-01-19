import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagTraversal {
    public static List<List<Integer>> traverse(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
//            how many elements in current level
            int levelSize = queue.size();
            List<Integer> treeLevel = new LinkedList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
//                the first level should be in normal order, then switch to reverse order.
                if(leftToRight){
                    treeLevel.add(currentNode.val);
                } else {
                    treeLevel.add(0,currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(treeLevel);
//            get out of the for loop, then switch the order.
            leftToRight = !leftToRight;
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(20);
        root.right.left.right = new TreeNode(17);
        List<List<Integer>> result = ZigzagTraversal.traverse(root);
        System.out.println("Zigzag traversal: " + result);
    }
}
