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
    
    //method to display all the elements present in the Queue
    void display(){
        for(int i=0;i<rear;i++){
            System.out.print(q[i]+" ");
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