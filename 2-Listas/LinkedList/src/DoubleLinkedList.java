public class DoubleLinkedList {

    private Node head;

    private Node tail;

    public void addNodeAtHead(Person person){
        Node node = new Node(person);
        if(head==null){ // lista vacia
            tail=node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head=node;
    }

    public void addNodeAtTail(Person person){
        Node node = new Node(person);
        if(head==null){ // lista vacia
            head=node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
    }

    public void deleteNodeAtHead(){
        if(head!=null){
            head=head.getNext();
            head.setPrevious(null);
        }
    }

    public void deleteNodeAtTail(){
        if(tail!=null){
            tail=tail.getPrevious();
            tail.setNext(null);
        }
    }

    public Node findNode(Node pointer, String value){
        if(pointer!=null && pointer.getPerson().getName()!=value){ // hace la recursion cuando no encuentra al nodo
            return findNode(pointer.getNext(),value);
        }
        return pointer; // null cuando no lo encuentra
    }

    public void deleteNode(String value){
        Node node = findNode(head, value);
        if (node!=null) deleteNode(node);
    }

    private void deleteNode(Node node) {
        if(node==head) deleteNodeAtHead();
        else if (node==tail) deleteNodeAtTail();
        else {
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
        }
    }

    public void print(){
        print(head);
    }

    private void print(Node pointer){
        if(pointer!=null){
            System.out.println(pointer.getPerson().getName());
            print(pointer.getNext());
        }
    }
}