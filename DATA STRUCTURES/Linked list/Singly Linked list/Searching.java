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
   
    //method to search an element
    boolean search(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    
    void freq_search(int key){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==key){
                count++;
            }
            temp=temp.next;
        }
        System.out.println(key+" has occurred "+count+" times");
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



public class Searching{
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.insert_end(10);
        ll.insert_end(20);
        ll.insert_end(30);
        ll.insert_end(30);
        ll.insert_end(40);
        ll.insert_end(50);
        ll.insert_end(60);
        ll.display();
        System.out.println(ll.search(40));
        System.out.println(ll.search(10));
        ll.freq_search(30);
    }
}