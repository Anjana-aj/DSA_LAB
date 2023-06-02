import java.io.*;
import java.util.*;

class node{

   public int data;
   public node lchild;
   public node rchild;
   
   public node(int s){
    data=s;
    lchild=rchild=null;
    }
    public void displaynode(){
     System.out.println(data);
     }
     }
   class tree{
     public node root;
     public tree(){
     root=null;
     }
     public boolean isEmpty(){
      return root==null;
      }
      
    public node insert(int d){
    node newnode=new node(d);
      node current=root;
      node parent;
      if(current==null){
        root=newnode;
        return newnode;
        }else{
        while(true){
        parent=current;
        if(d<current.data){
           current=current.lchild;
           if(current==null){
             parent.lchild=newnode;
             return newnode;
             }
           }
           else{
           current=current.rchild;
           if(current==null){
             parent.rchild=newnode;
             return newnode;
             }
          }
          }
       }
   }
   public void search(int key){
     node current=root;
     node parent;
     int flag=0;
     if(current==null){
       System.out.println("empty");
       }else{
       while(true){
          parent=current;
          if(key<current.data){
          current=current.lchild;
             if(current==null){
              flag=0;
              break;
              }
            }else if(key>current.data){
             current=current.rchild;
             flag=0;
             break;
             }
             else{
             flag=1;
             break;
             }
           }
             if(flag==1){
               System.out.println("item found");
               }
               else{
               System.out.println("not found");
               }
            }
         }
         public void inorder(node localroot){
           if(localroot==null){
            return;
            }
            else{
            inorder(localroot.lchild);
            localroot.displaynode();
            inorder(localroot.rchild);
      }
     }
      public void preorder(node localroot){
           if(localroot==null){
            return;
            }
            else{
            localroot.displaynode();
            preorder(localroot.lchild);
            preorder(localroot.rchild);
      }
      }
       public void postorder(node localroot){
           if(localroot==null){
            return;
            }
            else{
            postorder(localroot.lchild); 
            postorder(localroot.rchild);
            localroot.displaynode();
      }
     }
   }
     
 
    public class tree2{
      public static void main(String args[]){
      int choice=0;
      int n;
        tree t=new tree();
        Scanner sc=new Scanner(System.in);
        do{
        
        System.out.println("...........menu...............");
        System.out.println("\n1.insert\n2.search\n3.inorder\n4.preorder\n5.postorder\n6.exit");
         System.out.println("enter choice");
        choice=sc.nextInt();
        
        switch(choice){
          case 1:
                System.out.println("enter value to insert");
                n=sc.nextInt();
                t.insert(n);
                break;
          case 2:
               System.out.println("enter value to search");
                n=sc.nextInt();
                t.search(n);
                break;
          case 3:
               System.out.println("inorder");
               t.inorder(t.root);
               break;
          case 4:
               System.out.println("preorder");
               t.preorder(t.root);
               break;
          case 5:
               System.out.println("postorder");
               t.postorder(t.root);
               break;
          case 6:
               System.out.println("exit");
               break;
          default:
               System.out.println("error");
         }
          
               
        }while(choice!=6);
     
  
    
      
      
   }
 }
               
               
                
             
   
