import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://www.educative.io/courses/grokking-the-coding-interview/xV7E64m4lnz
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
    }
}
public class LevelOrderTraversal {
   public static List<List<Integer>> traverse (TreeNode root){
//       List<List<Integer>> result = new LinkedList<>();
       List<List<Integer>> result = new ArrayList<>();
       if(root == null){
           return result;
       }
       Queue<TreeNode> queue = new LinkedList<>();
//       queue.offer() will return false , queue.add() will throw an exception when they out of the storage.both them
//      will add the element into the queue
       queue.offer(root);

       while(!queue.isEmpty()){
           int levelSize = queue.size();
           List<Integer> currentLevel = new ArrayList<>(levelSize);
           for(int i = 0; i< levelSize; i++){
//               queue.poll() remove the first element in the queue
               TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }

           }
           result.add(currentLevel);

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
        List<List<Integer>> result = LevelOrderTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
    }

}
