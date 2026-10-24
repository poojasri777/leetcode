/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       
       while(!q.isEmpty()){
        int n=q.size();
       
        ArrayList<Node>al=new ArrayList<>();
        for(int i=0;i<n;i++){
            Node r1=q.poll();
            
            if(r1.left!=null)
                q.offer(r1.left);
                
            if(r1.right!=null)
                q.offer(r1.right);
                al.add(r1);
        }
        for(int i=0;i<al.size()-1;i++){
            al.get(i).next=al.get(i+1);
        }
        al.get(al.size()-1).next=null;
        
       }
       return root;
    }
}