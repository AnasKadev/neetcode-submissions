/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> fres= new ArrayList<>();
    Queue<TreeNode> q = new ArrayDeque<>();


if(root==null)
return new ArrayList<>();
q.add(root);

while(!q.isEmpty()) {
    List<Integer> res= new ArrayList<>();

    for(int i=q.size();i>0;i--){
TreeNode t= q.poll();
if(t!=null){
res.add(t.val);

if (t.left != null) q.add(t.left);
                if (t.right != null) q.add(t.right);

}



    }
    fres.add(res);



}
return fres;
   
    }
}
