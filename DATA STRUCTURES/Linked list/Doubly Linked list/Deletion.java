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
    
    //method to delete a element at the first only if the head is not null
    void delete_first(){
        if(head!=null){
            if(head.next==null){
                head=null;//if there is only one node 
            }
            else{
                Node temp=head.next;
                temp.prev=null;
                head.next=null;
                head=temp;
            }
            size--;
        }
    }
    
    //method to delete a element at the last
    void delete_last(){
        if(head!=null){
            if(head.next==null){
                head=null;//if there is only one node
            }
            else{
                Node temp=head;
                while(temp.next!=null && temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next.prev=null;
                temp.next=null;
            }
            size--;
        }
    }
    
    //method to delete the element at the particular index position
    void delete_index(int index){
        if(index<size){
            if(index==0){
                delete_first();
            }
            else if(index==size-1){
                delete_last();
            }
            else{
                Node temp=head;
                int i=1;
                while(i<index && temp.next!=null){
                    i++;
                    temp=temp.next;
                }
                temp.next.next.prev=temp;
                temp.next=temp.next.next;
                size--;
            }
        }
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
}

public class Deletion{
    public static void main(String args[]){
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert_end(10);
        dl.insert_end(20);
        dl.insert_end(30);
        dl.insert_end(40);
        dl.insert_end(50);
        dl.insert_end(60);
        dl.display();
        dl.delete_first();
        dl.display();
        dl.delete_last();
        dl.display();
        dl.delete_index(2);
        dl.display();
        dl.delete_index(1);
        dl.display();
    }
}