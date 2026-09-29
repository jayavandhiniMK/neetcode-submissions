class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] taken=new boolean[nums.length];
        back(0,new ArrayList<>(),nums,taken);
        return res;
    }
    public void back(int in,List<Integer> cur,int[] nums,boolean taken[]){
        if(in==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!taken[i]){
                taken[i]=true;
                cur.add(nums[i]);
                back(in+1,cur,nums,taken);
                cur.remove(cur.size()-1);
                taken[i]=false;
            }
        }
    }
}
