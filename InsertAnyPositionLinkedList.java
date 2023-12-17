// public class InsertAnyPositionLinkedList {
//     public class node {
//         int data;
//         node next;
//         node (int value) {
//             data = value;
//             next = null;
//         }
//     }

//     static node head;

//         static void printList(){
//             node p = head;
//             System.out.print("\n[");

//             while(p != null) {
//                 System.out.print(" " + p.data + " ");
//                 p = p.next;
//             }
//             System.out.print(" ]");
//         }
//         static void insertatbegin(int data){

//             node one = new node(data);;
//             one.next = head;
//             head = one;
//         }

//         static void insertafternode ( node list , int data){
//             node one = new node(data);
//             one.next = list.next;
//             list.next = one;
//         }

//         public static void main(String [] args){
//             int k = 0;
//             insertatbegin(12);
//             insertatbegin(22);
//             insertatbegin(30);
//             insertatbegin(44);
//             insertafternode(head, 50);
//             insertafternode(head.next.next,33);
//             System.out.println("Linked List: ");

//             printList();

//         }
// }

public class InsertAnyPositionLinkedList  {
   static class node {
      int data;
      node next;
      node (int value) {
         data = value;
         next = null;
      }
   }
   static node head;

   // display the list
   static void printList() {
      node p = head;
      System.out.print("\n[");

      //start from the beginning
      while(p != null) {
         System.out.print(" " + p.data + " ");
         p = p.next;
      }
      System.out.print("]");
   }

   //insertion at the beginning
   static void insertatbegin(int data) {

      //create a link
      node lk = new node(data);;

      // point it to old first node
      lk.next = head;

      //point first to new first node
      head = lk;
   }
   static void insertafternode(node list, int data) {
      node lk = new node(data);
      lk.next = list.next;
      list.next = lk;
   }
   public static void main(String args[]) {
      int k=0;
      insertatbegin(12);
      insertatbegin(22);
      insertatbegin(30);
      insertatbegin(44);
      insertafternode(head.next, 50);
      insertafternode(head.next.next, 33);
      System.out.println("Linked List: ");

      // print list
      printList();
   }
}



