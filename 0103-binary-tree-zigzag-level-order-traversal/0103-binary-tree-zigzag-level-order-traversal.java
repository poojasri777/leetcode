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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return l;
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode r1=q.peek();
                if(r1.left!=null)
                    q.add(r1.left);
                if(r1.right!=null)
                    q.add(r1.right);
                 al.add(r1.val);
                q.remove();
            }
                if(level%2==0){
                    Collections.reverse(al);
                }
                level++;

            l.add(al);
        }
        return l;
    }
}