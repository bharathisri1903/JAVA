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



public class Singly_LinkedList{
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
        ll.delete_first();
        ll.display();
        ll.delete_last();
        ll.display();
        ll.delete_index(1);
        ll.display();
        System.out.println(ll.search(40));
        System.out.println(ll.search(10));
        ll.insert_end(20);
        ll.insert_end(10);
        ll.insert_end(20);
        ll.insert_end(30);
        ll.display(); 
        ll.freq_search(20);
        ll.freq_search(100);
    }
}
