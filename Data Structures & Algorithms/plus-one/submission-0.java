class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        while(--n>=0){
            if(digits[n]<9){
                digits[n]=digits[n]+1;
                return digits;
            }
            digits[n]=0;
        }
        int[] r=new int[digits.length+1];
        r[0]=1;
        return r;
    }
}
