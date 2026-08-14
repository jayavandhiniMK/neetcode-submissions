class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return iseq( p,  q);
    }
    private boolean iseq(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        else if(p==null || q==null)
            return false;
        else if(p.val!=q.val)
             return false;
        return iseq(p.left,q.left) && iseq(p.right,q.right);
    }
}