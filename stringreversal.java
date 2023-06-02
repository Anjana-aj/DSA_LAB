import java.io.*;
import java.util.*;

class link{

   int data;
   link next;
   link prev;
   
   public link(char s){
   
   data=s;
   }
   public void displaylink(){
    System.out.println(data);
    }
  }
  class doublylinkedlist{
  
   link first;
   link last;
   
   public doublylinkedlist(){
    first=null;
    last=null;
    }
    public boolean isEmpty(){
    
    return first==null;
    }
    
    public void insertfirst(char s){
      link nl=new link(s);
      if(isEmpty()){
       first=nl;
       last=nl;
       }else{
       nl.next=first;
       first.prev=nl;
       first=nl;
       }
      }
     public void insertlast(char s){
     
     link nl=new link(s);
     if(isEmpty()){
       first=nl;
       last=nl;
       }
       else{
       nl.prev=last;
       last.next=nl;
       last=nl;
      }
      }
     
      public void deletfirst(){
      if(isEmpty()){
       System.out.println("empty");
       }else if(last==first){
       last=first=null;
       }else{
       first=first.next;
       first.prev=null;
       }
      }

      public void deletlast(){
      if(isEmpty()){
       System.out.println("empty");
       }else if(last==first){
       last=first=null;
       }else{
       last=last.prev;
       last.next=null;
       }
      }
  
      public void displayforward(){
      link current=first;
      while(current!=null){
         current.displaylink();
         if(current.next==null){
         break;
         }
         else{
         current=current.next;
         }
         }
         if(current==null){
          System.out.println("empty");
          }
       }
       public void clearlist(){
        last=first=null;
        }

      public void displaybackward(){
        String rvr="";
        link current=last;
        while(current!=null){
         current.displaylink();
         rvr+=current.data;
        
        if(current.prev==null){
          break;
          }
          else{
           current=current.prev;
           }
           }
           if(current==null){
          System.out.println("empty");
         }
  return rvr;
   
    }
   // public void reverselist(){
    
   }
  
          
              
          
      
     
     public class stringreversal{
      public static void main(String args[]){
      doublylinkedlist l=new doublylinkedlist();
      
      l.insertfirst(10);
      l.insertfirst(20);
      l.displayforward();
      l.displaybackward();
      }
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    
      
   
