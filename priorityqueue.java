import java.io.*;
import java.util.*;

class link{

   public int data;
   public link next;
   
   public link(int s){
    data=s;
    }
    public void displaylink(){
    System.out.println(data);
    }
    }
    class linkedlist{
    
    public link first;
    
    public linkedlist(){
     first=null;
     }
     public boolean isEmpty(){
     
     return first==null;
     }
    
    public void insertfirst(int d){
    
    link nl=new link(d);
    
    if(isEmpty()){
     first=nl;
     }
     else{
     nl.next=first;
     first=nl;
     }
   }
   public link deletefirst(){
   
   link temp=first;
   first=first.next;
   return temp;
   } 
  public void enqueue(int d){
    link nl=new link(d);
    link current=first;
    link previous=first;
    if(isEmpty()){
      first=nl;
      }
      else{
      while(current!=null){
       if(current==first&&current.data>nl.data){
       nl.next=current;
       first=nl;
       }
       else if(current.data>nl.data){
       previous.next=nl;
       nl.next=current;
       }
       else if(current.next==null&&current.data<nl.data){
        current.next=nl;
        }
        else{
        previous=current;
        current=current.next;
        }
      }
      }
    }
    public int dequeue(){
    
    link current=first;
    link previous=first;
    
    while(current!=null){
        if(current.next==null){
        break;
        }
        else{
         previous=current;
         current=current.next;
         }
       }
       if(isEmpty()){
       System.out.println("empty");
       return -1;
       }else if (current.next==null){
        if(current==first){
          first=null;
          }
          else{
          previous.next=null;
          }
        }
        return current.data;
        }
        public void displaylist(){
        link current=first;
        while(current!=null){
        current.displaylink();
        current=current.next;
        
        }
      }
    }
    
       
    public class priority{
    
    public static void main(String args[]){
    
    linkedlist l=new linkedlist();
    
    int choice=0;
    int x;
    
    Scanner sc=new Scanner(System.in);
    do{
    
    System.out.println("........menu........");   
      System.out.println("\n1.enqueue\n2.dequeue\n3.displaylist\n4.exit\n");
      
        System.out.println("enter choice");
        choice=sc.nextInt();
        switch(choice){
        
       
         case 1:
               System.out.println("enter element want to insert");
               x=sc.nextInt();
               l.insertfirst(x);
               break;
        case 2:
               
               l.dequeue();
               break;
        case 3:
              l.displaylist();
              break;
        
        case 4:
             System.out.println("exit");
             break;
        default:
              System.out.println("error");
        }
        }while(choice!=4);
     }
     
   }
               
          
          
    
       
       
    
      
  
