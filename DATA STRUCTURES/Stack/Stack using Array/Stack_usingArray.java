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
    
    //method to check if the stack is empty
    boolean isEmpty(){
        return top==0;
    }
    
    //method to remove an element from the Stack
    int pop(){
        int val=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            val=st[top];
        }
        return val;
    }
    
    int peek(){
        int val=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            val=st[top-1];
        }
        return val;
    }
    
    //method to display the first element of the Stack
    
    //method to display all the elements present in the Stack
    void display(){
        for(int i=top-1;i>=0;i--){
        System.out.println(st[i]);
        }
    }
}

public class Stack_usingArray{
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        System.out.println("The pop element is "+s.pop());
        s.display();
        System.out.println("The pop element is "+s.pop());
        s.display();
        System.out.println("The pop element is "+s.pop());
        s.display();
        System.out.println("The pop element is "+s.pop());
        s.display();
        System.out.println("The pop element is "+s.pop());
        s.display();
        System.out.println("The pop element is "+s.pop());
        s.display();
        System.out.println("The pop element is "+s.pop());
        s.display();
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.display();
        System.out.println("The peek element is "+s.peek());
        s.display();
    }
}
