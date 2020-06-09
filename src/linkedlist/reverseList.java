package linkedlist;

public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public void printList(ListNode node){
        while (node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(5);
        reverseList rl = new reverseList();
        rl.printList(rl.reverseList(list.head));
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}
class LinkedList{
    ListNode head;
}
