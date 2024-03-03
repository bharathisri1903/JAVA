class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}

class Stack{
    Node top=null;//top as head
    static int size=0;
    
    //method to add an element into the stack
    void push(int d){
        Node node=new Node(d);
        if(top==null){
            top=node;//if stack is empty then the given element is the top
        }
        else{
            node.next=top;
            top=node;
        }
        size++;
    }
    
    //method to check if the stack is empty
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    
    //method to remove an element from the stack
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        top=top.next;
        size--;
        return val;
    }
    
    //method to find the element in the top
    int peek(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        return val;
    }
    
    
    //method to display all the elements present in the stack
    void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class Stack_using_LinkedList{
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println("The popped element is "+st.pop());
        st.display();
        System.out.println("The top element is "+st.peek());
    }
}