class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1,zc=0,in=-1;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
                in=i;
            }
            else p*=nums[i];
        }

        if(zc==0){
            for(int i=0;i<nums.length;i++){
                res[i]=p/nums[i];
            }
        }else if(zc==1){
            res[in]=p;
        }
        return res;
    }
}  
