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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int res=0;
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode cur=q.poll();
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
            res++;
        }
        return res;
    }
}
