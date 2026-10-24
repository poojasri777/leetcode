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
    public TreeNode reverseOddLevels(TreeNode root) {
        
        if(root==null)return null;
       Queue<TreeNode>q=new LinkedList<>();
       q.add(root); 
       int level=0;
       while(!q.isEmpty()){
        int n=q.size();
         ArrayList<TreeNode>al=new ArrayList<>();
        for(int i=0;i<n;i++){
             TreeNode r1=q.poll();
            if(r1.left!=null)
            q.offer(r1.left);
            if(r1.right!=null)
            q.offer(r1.right);
            al.add(r1);
        }
            if(level%2==1){
               int i=0;
               int j=al.size()-1;
               while(i<j){
               int temp=al.get(i).val;
               al.get(i).val=al.get(j).val;
               al.get(j).val=temp;
               i++;j-- ;
            }
            }
            level++;
        
       }
       return root ;
    }
}