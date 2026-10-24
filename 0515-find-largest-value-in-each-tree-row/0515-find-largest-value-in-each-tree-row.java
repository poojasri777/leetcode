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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        
        if(root==null) return l;
        q.add(root);
        while(!q.isEmpty()){
            int max=Integer.MIN_VALUE;
            int n=q.size();
            
            for(int i=0;i<n;i++){      
                TreeNode r1=q.peek();
                max=Math.max(max,r1.val);
                if(r1.left!=null)
                    q.add(r1.left);
                if(r1.right!=null)
                    q.add(r1.right);
                
                 
                q.remove();
            }
            
            l.add(max);
                    }
        return l;
    }
}