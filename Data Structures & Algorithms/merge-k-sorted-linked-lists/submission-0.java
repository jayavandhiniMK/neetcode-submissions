/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        Queue<ListNode> pq=new PriorityQueue<>(lists.length,(a,b)->Integer.compare(a.val,b.val));
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        if(pq.isEmpty()){
            return null;
        }
        ListNode root=pq.poll();
        ListNode n=root;
        if(n.next!=null){
            pq.add(n.next);
        }
        while(!pq.isEmpty()){
            ListNode nn=pq.poll();
            if(nn.next!=null){
                pq.add(nn.next);
            }
            n.next=nn;
            n=n.next;
        }
        return root;
    }
}