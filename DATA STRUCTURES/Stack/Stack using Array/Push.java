class Stack{
    static int top=0,size=6;
    int st[]=new int[size];
   
    //method to check if the stack is full
    boolean isFull(){
        return top==size;
    }
   
    //method to add an element into the stack
    void push(int d){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            st[top]=d;
            top++;
        }
    }
    
    //method to display all the elements present in the Stack
    void display(){
        for(int i=top-1;i>=0;i--){
            System.out.println(st[i]);
        }
    }
}

public class Push{
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
    }
}