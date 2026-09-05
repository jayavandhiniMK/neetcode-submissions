class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.putIfAbsent(i,0);
            m.put(i,m.get(i)+1);
        }
        List<Integer> l=new ArrayList<>(m.keySet());
        Collections.sort(l,(a,b)->m.get(b)-m.get(a));
        int[] a=new int[k];
        for(int i=0;i<k;i++){
            a[i]=l.get(i);
        }
        return a;
    }
}
