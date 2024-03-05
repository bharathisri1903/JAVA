import java.util.*;

class TreeNode{
    int data;
    TreeNode left;//Address of left child 
    TreeNode right;//Address of right child
    public TreeNode(int d){
        data=d;
        left=null;
        right=null;
    }
}

class BinarySearchTree{
    TreeNode root=null;
    
    //method to insert the nodes in to the tree
    void insert(int d){
        root=insert(root,d);
    }
    
    TreeNode insert(TreeNode curr,int d){
        if(curr==null){
            TreeNode node=new TreeNode(d);
            return node;//returns the address of the node 
        }
        if(curr.data>d){//if the data is less than the current node 
            curr.left=insert(curr.left,d);
        }
        else{//if the data is greater than the current node
            curr.right=insert(curr.right,d);
        }
        return curr;
    }
    
    //method for postorder tree traversal
    void post_order(){
        post_order(root);
    }
    
    void post_order(TreeNode curr){
        if(curr==null){
            return;
        }
        post_order(curr.left);
        post_order(curr.right);
        System.out.print(curr.data+" ");
    }
}
    
public class Post_order{
    public static void main(String args[]){
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.post_order(); // parent left right
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    