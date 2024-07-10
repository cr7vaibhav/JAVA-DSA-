package LinkedList;

class Node{
    int data;
    Node next;
    Node prev;
}

class DoublyLl{
    Node head;
    public void insert(int data){

    }

    public void insertAtStart(int data){
        
    }

    public void insertAt(int index,int data){
        
    }

    public void deleteAt(int index){

    }

    public void show(){
        Node node = head;
        while (node.next != null) {// this is how u traverse a linked list
            System.out.println(node.data);
            node = node.next; // this is how you shift
        }
        System.out.println(node.data);// last elemnent we have to print outside the loop
    }
    
}

public class Doubly {
    public static void main(String[] args) {
        DoublyLl dl=new DoublyLl();
        dl.insert(2);
        dl.insert(8);
        dl.insert(9);
        dl.insert(12);
        dl.insert(7);
        dl.insertAtStart(11);
        dl.insertAt(2,7);
        dl.deleteAt(4);
        dl.show();

    }

}
