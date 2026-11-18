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
        ArrayList<Integer> list=new ArrayList<>();
        
        for(ListNode node:lists){
            while(node!=null){
                list.add(node.val);
                node=node.next;
            }
        }
        Collections.sort(list);

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int x:list){
            curr.next=new ListNode(x);
            curr=curr.next;
        }
        return dummy.next;
    }
}
