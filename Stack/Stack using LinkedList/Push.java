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

public class Push{
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
    }
}






