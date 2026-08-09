class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> r=new HashMap<>();
        for(String s:strs){
            int[] f=new int[26];
            for(char c:s.toCharArray()){
                f[c-'a']++;
            }
            String k=Arrays.toString(f);
            r.putIfAbsent(k,new ArrayList<String>());
            r.get(k).add(s);
        }
        return new ArrayList<>(r.values());
    }
}