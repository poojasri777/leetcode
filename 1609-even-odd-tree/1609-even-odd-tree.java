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
    public boolean isEvenOddTree(TreeNode root) {
       if(root==null) return true;
       Queue<TreeNode>q=new LinkedList<>();
       q.add(root);
       int level=0;
       while(!q.isEmpty()){
        
        int n=q.size();
          ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++){
               TreeNode r1=q.poll();
            if(r1.left!=null){
                q.offer(r1.left);
            }
            if(r1.right!=null) q.offer(r1.right);
            
            if(level%2==0){
                if(r1.val%2==0) return false;
                if(!al.isEmpty() && r1.val<=al.get(al.size()-1)) return false;
            }
            if(level%2!=0){
                if(r1.val%2==1)return false;
                if(!al.isEmpty() && r1.val>=al.get(al.size()-1))return false;
                
                
            }
            al.add(r1.val);
            
        }
        level++;
       }
       return true; 
    }
}