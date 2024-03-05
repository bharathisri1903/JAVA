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
    
    //method to print the leaf nodes using level_order traversal
    void leaf_node(){
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode curr=que.remove();
            if(curr.left==null && curr.right==null){
                System.out.print(curr.data+ " ");
            }
            if(curr.left!=null){
                que.offer(curr.left);
            }
            if(curr.right!=null){
                que.offer(curr.right);
            }
        }
    }
}
    
public class Leaf_order{
    public static void main(String args[]){
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.leaf_order(); // parent left right
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    