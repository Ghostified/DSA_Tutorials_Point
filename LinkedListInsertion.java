public class LinkedListInsertion {
    static class node{
        int data;
        node next;
        node (int value) {
            data = value;
            next = null;
        }
    }
    static node head;

    //display the list
    static void printlist(){
        node p = head;
        System.out.print("\n[");

        //start from the beginning
        while (p!=null){
            System.out.println(" " + p.data + " ");
            p = p.next;
        }
        System.out.print("]");
    }

    //insertion at the beginning
    static void insertAtBegin (int data) {

        //create a link
        node one = new node(data);

        //point it to the first node
        one.next = head;

        //point first to new first node
         head = one;
    }
    public static void main (String [] args) {

        int k = 0;
        insertAtBegin(12);
        insertAtBegin(22);
        insertAtBegin(30);
        insertAtBegin(40);
        insertAtBegin(50);
        System.out.print("Linked List: ");

        //print list
        printlist();

    }

}
