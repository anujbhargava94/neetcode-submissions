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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val>list2.val){
            return mergeTwoLists(list2, list1);
        }
        ListNode p1 = list1.next;
        ListNode p2 = list2;
        ListNode current = list1;
        ListNode head = list1;

        while(p1!=null && p2!=null){

            if(p1.val <= p2.val){
                current.next = p1;
                p1 = p1.next;
            }else{
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        if(p1!=null){
            current.next = p1;
        }else if(p2!=null){
            current.next = p2;
        }

        return head;


    }
}