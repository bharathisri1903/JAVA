class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}

class Queue{
    Node front=null,rear=null;
    static int size=0;
    
    //method to add an element into the Queue
    void enQueue(int d){
        Node node=new Node(d);
        if(front==null){ //if there is no element then we need to assign that node to front and rear 
            front=node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=rear.next;
        }
        size++;
    }
    
    //method to display all the elements present in the Queue
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class Enqueue{
    public static void main(String args[]){
        Queue que=new Queue();
        que.enQueue(10);
        que.enQueue(20);
        que.enQueue(30);
        que.enQueue(40);
        que.enQueue(50);
        que.enQueue(60);
        que.enQueue(70);
        que.enQueue(80);
        que.display();
    }
}