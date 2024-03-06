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
   
    //method to insert node at the first
    void insert_first(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
        size++;
    }
   
    //method to insert node in the particular given index position
    void insert_index(int d,int index){
        Node node=new Node(d);
        //if index is 0 i.e. we need to insert before head
        if(index==0){
            insert_first(d);
        }
        //if index is greater than size we need to insert at the end
        else if(index>=size){
            insert_end(d);
        }
        else{
            int i=1;
            Node temp=head;
            while(i<index && temp.next!=null){
                i++;
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
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



public class Insertion{
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.insert_first(10);
        ll.insert_end(20);
        ll.insert_end(30);
        ll.display();
        ll.insert_index(40,1);
        ll.display();
        ll.insert_index(50,2);
        ll.display();
    }
}