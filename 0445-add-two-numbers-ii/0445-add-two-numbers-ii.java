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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1!=null){ // add the values of l1
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){ // add the values of l2
            s2.push(l2.val);
            l2=l2.next;
        }

        int carry=0;
        ListNode head = null;
        
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){

            int digit1 =0;
            int digit2 = 0;

            if(!s1.isEmpty()){
                digit1=s1.pop();
            }
            if(!s2.isEmpty()){
                digit2=s2.pop();
            }

            int sum =  digit1+digit2+carry;

            int digit = sum%10;
            carry = sum /10;

            ListNode newNode= new ListNode(digit);

            newNode.next = head;
            head = newNode;
            newNode = head;
        }
        return head;
    }
}