class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}

class LinkedList{
    Node head=null;
    static int size=0;
   
    //method to insert node at the end
    void insert_end(int d){
        Node node=new Node(d);//creating Node
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
        size++;
    }
   
    //method to delete the node at the end
    void delete_first(){
        if(head!=null){
            head=head.next;
            size--;
        }
    }
    
    //method to delete the node at the last 
    void delete_last(){
       if(head!=null){
            if(head.next==null){
                delete_first();
            }
            else{
                Node temp=head;
                while(temp.next!=null&&temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
                size--;
            }
        }
    }
    
    //method to delete the node at the particular given index position
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
                temp.next=temp.next.next;
                size--;
            }
        }
    }
    
    //method to display the LinkedList
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
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.insert_end(10);
        ll.insert_end(20);
        ll.insert_end(30);
        ll.insert_end(40);
        ll.insert_end(50);
        ll.insert_end(60);
        ll.display();
        ll.delete_first();
        ll.display();
        ll.delete_last();
        ll.display();
        ll.delete_index(1);
        ll.display();
        ll.delete_index(2);
        ll.display();
    }
}