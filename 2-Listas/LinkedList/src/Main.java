public class Main {
    public static void main(String[] args) {

        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        Person p1 = new Person("juan", 25);
        Person p2 = new Person("carlos", 25);
        Person p3 = new Person("daniel", 25);

        /*
        simpleLinkedList.addNodeAtEnd(p1, simpleLinkedList.getHead());
        simpleLinkedList.addNodeAtEnd(p2, simpleLinkedList.getHead());
        simpleLinkedList.addNodeAfterTarget(simpleLinkedList.getHead(), p3, "juan");
        simpleLinkedList.deleteNode(simpleLinkedList.getHead(),"juan");
        simpleLinkedList.getList();
         */

        doubleLinkedList.addNodeAtHead(p2);
        doubleLinkedList.addNodeAtTail(p3);
        doubleLinkedList.addNodeAtHead(p1);
        doubleLinkedList.print();
        System.out.println("eliminando...");
        doubleLinkedList.deleteNode("carlos");
        doubleLinkedList.print();
    }
}