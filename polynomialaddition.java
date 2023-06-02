import java.io.*;
import java.util.*;

class link{

    public int data;
    public int coeff;
    public int exp;
    public link next;
    
    public link(int coeff,int exp){
     this.coeff=coeff;
     this.exp=exp;
     }
     public void displaylink(){
     if(exp!=0){
       System.out.println(String.valueOf(coeff)+"x^"+String.valueOf(exp));
       }
       else{
       System.out.println(String.valueOf(coeff));
       }
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
  
    public void insertfirst(int x,int e){
    
    link nl=new link(x,e);
    if(isEmpty()){
           first=nl;
    
           }
         else{
         nl.next=first;
         first=nl;
         }
       }
     public void insertlast(int x,int e){
     
     link nl=new link(x,e);
     link curr=first;
     if(isEmpty()) {
         first=nl;
     }
     else{
      
      while(curr.next!=null){
       curr=curr.next;
       }
       if(curr.next==null){
         curr.next=nl;
         }
        }
     
    }
    public void deletefirst(){
     link temp=first;
     first=first.next;
     return temp;
     }
     public void deletelast(){
     
      link curr=first;
      link prev=first;
      while(curr.next!=null){
      prev=curr;
      curr=curr.next;
      }
      if(curr.next==null){
       if(prev==first){
        first=null;
        }
       else{
         prev.next=null;
         }
        }
       return curr;
       }
     }
    public class polynomialaddition{
     public static void main(String st[]){
     
      linkedlist l=new linkedlist();
      l.insertfirst(an);
      }
     }
       

