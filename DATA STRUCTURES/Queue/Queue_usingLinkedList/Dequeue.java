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
    
    //method to check if the Queue is Empty
    boolean isEmpty(){
        return front==null;
    }
    
    //method to remove an element from the Queue
    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int val=front.data;
        front=front.next;
        size--;
        return val;
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

public class Dequeue{
    public static void main(String args[]){
        Queue que=new Queue();
        que.enQueue(10);
        que.enQueue(20);
        que.display();
        
        System.out.println("The removed element is "+que.deQueue());
        System.out.println("The removed element is "+que.deQueue());
        System.out.println("The removed element is "+que.deQueue());
    }
}