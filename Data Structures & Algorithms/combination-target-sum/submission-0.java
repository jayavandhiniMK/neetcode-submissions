class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> cur=new ArrayList<>();
        backtrack(0,nums,target,cur);
        return res;
    }
    public void backtrack(int st,int[] nums,int tar,List<Integer> cur){
        if(tar==0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=st;i<nums.length;i++){
            if(nums[i]>tar) continue;
            cur.add(nums[i]);
            backtrack(i,nums,tar-nums[i],cur);
            cur.remove(cur.size()-1);
        }
    }
}
