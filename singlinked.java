import java.io.*;
import java.util.*;

class link{

  public int data;
  public link next;
  
  public link(int d){
  
      data=d;
      }
  public void displaylink(){
     
     System.out.println(data);
     }
   }
   class linkedlist{
   
   private link first;
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
   public void displaylist(){
   link current=first;
   while(current!=null){
     current.displaylink();
     current=current.next;
     }
    }
   public void insertafterakey(int key,int d){
   
   link nl=new link(d);
   link current=first;
   while(current!=null){
     if(current.data==key){
       break;
       }
       else{
       current=current.next;
       }
      }
     if(current.data==key){
       nl.next=current.next;
       current.next=nl;
       
       }
   }
  
   public link deletekey(int key){
    
    link current=first;
    link previous=first;
    
    while(current!=null){
    
    if(current.data==key){
    break;
    }
    else{
    previous=current;
    current=current.next;
    } 
   }
    if(current.data==key){
    if(current==first){
    
    }else{
      previous.next=current.next;
      }
      }

    return current;
    }
  public int getlength(){
    link current=first;
    int count=0;
    while(current!=null){
       count++;
       current=current.next;
       }
       return count;
   }
   public double avg(){
     int pos;
     double result=0.0;
     int count=0;
     link current=first;
     
     if(getlength()%2==0){
     pos=getlength()/2;
     }else{
     pos=(getlength()+1)/2;
     }
     while(current!=null){
      if(count==pos){
       if(getlength()%2==0){
         result=(double) (current.data+current.next.data)/2.0;
         }
         else{
         result=(double) current.data;
         }
         break;
      }
      current=current.next;
      }
      
      return result;
      }
 
   public void swap(int pos1,int pos2){
     link n1=first;
     link n2=first;
     int count=0;
     while(n1.next!=null){
     if(count==pos1){
     break;
     }
     count++;
     n1=n1.next;
     }
     count=0;
     while(n2.next!=null){
     if(count==pos2){
       break;
       }
       count++;
       n2=n2.next;
       }
       int temp;
       temp=n1.data;
       n1.data=n2.data;
       n2.data=temp;
       }
       
    }
  
   
   public class singlinked{
     public static void main(String args[]){
         int pos1=0,pos2=0;
         Scanner sc=new Scanner(System.in);
         linkedlist l=new linkedlist();     
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        System.out.println("elements");
        for(int i=0; i<n; i++){
          l.insertfirst(sc.nextInt());
          }
          System.out.println("list");
          l.displaylist();
          
          System.out.println("avg"+l.avg());
          
        
        
           
        System.out.println("count"+l.getlength());
        System.out.println("enter pos to swapo");
        pos1=sc.nextInt();
        pos2=sc.nextInt();
        System.out.println("before swapping");
        l.displaylist();
        System.out.println("after swapping");
        l.displaylist();
        
     
        
        }
        }
        
        
      
