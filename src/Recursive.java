public class Recursive(Node head) {
    if(head == null || head.next==null){
        null;
    }
    Node newHead=Recursive(head.next);
    head.next.next=head;
    head.next=null;
    return newHead
}
