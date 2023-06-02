import java.io.*;
import java.util.*;

class node{
  public int data;
  public node next;
  
  public node(int d){
   data=d;
   }
   public void displaynode(){
     System.out.println(data);
     }
   }
   class cqueue{
    private node front;
    private node rear;
    
    public cqueue(){
     rear=front=null;
     }
     
     public boolean isEmpty(){
     return front==null;
     }
     public void enqueue(int d){
      
      node nl=new node(d);
      if(isEmpty()){
      rear=nl;
      front=nl;
      }else{
      rear.next=nl;
  }
      nl.next=front;
      rear=nl;
      
      }
      public void dequeue(){
      
      if(!isEmpty()){
        if(rear==front){
       front=rear=null;
       }
       else{
       front=front.next;
       rear.next=front;
       
       }
       }else{
       System.out.println("empty");
       }
      }
  
       public void displaylist(){
       
       node current=front;
       System.out.println("elements are");
       while(current!=null){
        System.out.println(current.data);
        current=current.next;
        if(current==front){
                current=null;
                }
            }
        }
        
        }   
      public class circularqueue{
      
      public static void main(String args[]){
      
      cqueue cq=new cqueue();
      Scanner sc=new Scanner(System.in);
      int choice=0;
      int i;
      
      
      do{
      System.out.println("1.enqueue\n2.dequeue\n3.displaylist\n4.exit\nenter choice");
      choice=sc.nextInt();
      switch(choice){
      
      case 1:  
             System.out.println("enter element to be inserted");
             i=sc.nextInt();
             cq.enqueue(i);
             break;
             
       case 2: 
               cq.dequeue();
               break; 
       case 3:  
              cq.displaylist();
              break;
       case 4:  
                
             System.out.println("exit");
             break;
       default:
               
             System.out.println("wrong");
             }
           }while(choice!=4);
           sc.close();
        }
     }
             
             
                    
            
      
        
     
    
