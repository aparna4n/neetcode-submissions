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
    PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
    public ListNode mergeKLists(ListNode[] lists) {
        for(ListNode node:lists){
            ListNode curr=node;
            while(curr!=null){
                pq.add(curr);
                curr=curr.next;
            }
        }
        ListNode res=new ListNode(0);
        ListNode dum=res;
        while(!pq.isEmpty()){
            res.next=pq.poll();
            res=res.next;
        }
        return dum.next;

    }
}
