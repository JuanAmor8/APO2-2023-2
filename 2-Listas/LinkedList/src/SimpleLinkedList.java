public class SimpleLinkedList {

    private Node head;

    public SimpleLinkedList() {
        this.head = null;
    }

    public void addNodeAtEnd(Person person, Node pointer){
        Node node = new Node(person);
        if(pointer==null) head = node; // lista esta vacia
        else {
            if(pointer.getNext()!=null){
                addNodeAtEnd(person, pointer.getNext()); // no hemos llegado al final, recursion
            } else {
                pointer.setNext(node);
            }
        }
    }

    public void getList(){
        getList(head);
    }
    
    private void getList(Node pointer) {
        if (pointer!=null){
            System.out.println(pointer.getPerson().getName());
            getList(pointer.getNext());
        }
    }

    public void addNodeAfterTarget(Node pointer, Person person, String targetName) {
        if(pointer!=null) { // caso base, lista vacía
            if(pointer.getPerson().getName()==targetName){ // se encontro el target
                Node node = new Node(person);
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            } else { // se sigue buscando el target recursivamente
                addNodeAfterTarget(pointer.getNext(), person, targetName);
            }
        }
    }

    public void deleteNode(Node pointer, String value){
        if(pointer!=null) { // caso base, lista vacía o no se encontro el target
            if (head.getPerson().getName() == value) { // caso en el que el target es el head
                head = pointer.getNext();
            } else if (pointer.getNext() != null) {
                if (pointer.getNext().getPerson().getName() == value) { // se encontro el target en el siguiente
                    pointer.setNext(pointer.getNext().getNext());
                } else { // se sigue buscando el target recursivamente
                    deleteNode(pointer.getNext(), value);
                }
            }
        }

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

}
