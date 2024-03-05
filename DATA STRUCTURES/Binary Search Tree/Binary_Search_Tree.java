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
    
    
    //method for preorder tree traversal
    void pre_order(){
        pre_order(root);
    }
    
    void pre_order(TreeNode curr){
        if(curr==null){
            return;
        }
        System.out.print(curr.data+" ");
        pre_order(curr.left);
        pre_order(curr.right);
    }
    
    
    //method for inorder tree traversal
    //prints value in ascending order
    void in_order(){
        in_order(root);
    }
    
    void in_order(TreeNode curr){
        if(curr==null){
            return;
        }
        in_order(curr.left);
        System.out.print(curr.data+" ");
        in_order(curr.right);
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
    
    //method to efficiently search an element in the Binary_Search_Tree
    boolean search(int key){
        return search(key,root);
    }
    
    boolean search(int key,TreeNode curr){
        if(curr==null){
            return false;
        }
        else if(key==curr.data){
            System.out.print(curr.data+" -> ");
            return true;
        }
        else if(key<curr.data){//if the key is less than the current data
            System.out.print(curr.data+" -> ");
            return search(key,curr.left);
        }
        else{//if the key is greater than the current data
            System.out.print(curr.data+" -> ");
            return search(key,curr.right);
        }
    }
    
    //method for level order tree traversal
    void level_order(){
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode curr=que.remove();
            System.out.print(curr.data+ " ");
            if(curr.left!=null){
                que.offer(curr.left);
            }
            if(curr.right!=null){
                que.offer(curr.right);
            }
        }
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

public class Binary_Search_Tree{
    public static void main(String args[]){
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.pre_order(); // parent left right
        System.out.println();
        bst.in_order(); // left parent right
        System.out.println();
        bst.post_order(); // left right parent
        System.out.println();
        System.out.println(bst.search(60));
        System.out.println(bst.search(80));
        bst.level_order();
        System.out.println();
        bst.leaf_node();
    }
}