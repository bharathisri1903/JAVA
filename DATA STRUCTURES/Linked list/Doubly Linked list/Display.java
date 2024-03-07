class Node{
    int data;
    Node prev;//address of previous Node
    Node next;//address of next Node
    public Node(int d){
        data=d;
        prev=null;
        next=null;
    }
}

class DoublyLinkedList{
    Node head=null;
    static int size=0;
    
    //method to insert the node at the end and if there is no node then that node is the head
    void insert_end(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }
        size++;
    }
    
    //method to display all the elements
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    //method to display all the elements in the reverse order
    void reverse(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }
}

public class Display{
    public static void main(String args[]){
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert_end(10);
        dl.insert_end(20);
        dl.insert_end(30);
        dl.insert_end(40);
        dl.insert_end(50);
        dl.insert_end(60);
        dl.display();
        dl.reverse();
    }
}