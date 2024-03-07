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
    
    //method to insert the node at the beginning and if there is no node then than node is head
    void insert_front(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;
    }
    
    //method to insert a element at the given index position
    void insert_index(int d,int index){
        if(index==0){
            insert_front(d);
        }
        else if(index>=size){
            insert_end(d);
        }
        else{
            int i=1;
            Node temp=head;
            Node node=new Node(d);
            while(i<index){
                i++;
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next.prev=node;
            temp.next=node;
            node.prev=temp;
            size++;
        }
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

public class Doubly_LinkedList{
    public static void main(String args[]){
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.insert_end(10);
        dl.insert_end(20);
        dl.insert_end(30);
        dl.display();
        dl.reverse();
        dl.insert_front(40);
        dl.insert_front(50);
        dl.display();
        dl.insert_index(100,3);
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