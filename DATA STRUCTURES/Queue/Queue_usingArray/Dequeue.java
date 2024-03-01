class Queue{
    static int size=7,front=0,rear=0;
    int q[]=new int[size];
    
    
    //method to check if the Queue is full
    boolean isFull(){
        return rear==size;
    }
    
    //method to add an element into the Queue
    void enQueue(int d){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            q[rear]=d;
            rear++;
        }
    }
    
     //method to check if the Queue is empty
    boolean isEmpty(){
        return rear==0;
    }
    
    //method to remove an element from the Queue
    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int val=q[front];
        for(int i=1;i<=rear-1;i++){
            q[i-1]=q[i];
        }
        rear--;
        q[rear]=0;
        return val;
    }
    
    //method to display all the elements present in the Queue
    void display(){
        for(int i=0;i<rear;i++){
            System.out.print(q[i]+" ");
        }
        System.out.println();
    }
}

public class Dequeue{
    public static void main(String args[]){
        Queue que=new Queue();
        que.enQueue(10);
        que.enQueue(20);
        que.enQueue(30);
        que.display();
        
        System.out.println("The removed element is "+que.deQueue());
        System.out.println("The removed element is "+que.deQueue());
        System.out.println("The removed element is "+que.deQueue());
        System.out.println("The removed element is "+que.deQueue());
    }
}