import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseLevelOrderTraversal {
    public static List<List<Integer>> traverse(TreeNode root){
//        must LinkedList that we can add the element in the front of the list.
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(! queue.isEmpty()){
            int levelSize = queue.size();
//            can use linkedList and ArrayList
            List<Integer> treeLevel = new LinkedList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
//                the element in treeLevel is int, must use currentNode.val to get the int value instead of TreeNode
                treeLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                   queue.add(currentNode.right);
                }
            }
//            result.add(treeLevel) will add the element into the end of the List, result.add(0, treeLevel) will the
//            element at the beginning of the List. that's why we use LinkedList instead of ArrayList.
            result.add(0,treeLevel);
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
        List<List<Integer>> result = ReverseLevelOrderTraversal.traverse(root);
        System.out.println("Reverse level order traversal: " + result);
    }
}
