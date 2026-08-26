class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s=new HashSet<>();
        while(n>1){
            int c=ss(n);
            if(s.contains(c)){
                return false;
            }
            s.add(c);
            n=c;
        }
        return true;
    }
    public int ss(int n){
        int s=0;
        while(n>0){
            s+=((n%10)*(n%10));
            n/=10;
        }
        return s;
    }
}
