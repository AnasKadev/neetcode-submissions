/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> m= new HashMap<>();
        Node curr=head;
        Node res=head;
        while(head!=null ){
            m.put(head,new Node(head.val));
            head=head.next;
        }

     
     while(curr!=null ){
       Node n= m.get(curr);
       n.next=m.get(curr.next);
       n.random=m.get(curr.random);

              n=n.next;
       curr=curr.next;
     }
     return m.get(res);
        
    }
}