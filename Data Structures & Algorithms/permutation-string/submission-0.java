class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1=new int[26];
        int[] f2=new int[26];
        List<Character> l=new ArrayList<>();
        int len=s1.length();
        for(char c:s1.toCharArray()){
            f1[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            if(l.size()>=len){
                char v=l.remove(0);
                f2[v-'a']--;
            }
            f2[c-'a']++;
            if(Arrays.equals(f1,f2)) return true;
            l.add(c);
        }
        return false;
    }
}
