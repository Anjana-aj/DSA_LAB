import java.io.*;
import java.util.*;

class stack{
      
      private int top;
      private int max;
      private int arr[];
      
      public stack(int s){
       
       max=s;
       arr=new int[max];
       top=-1;
       }
     public void push(){
      
      int  j;
      
      top++;
      arr[top]=j;
      }
      public int pop(){
      
      int j=arr[top];
      top--;
      return j;
      }
      public int peek(){
      
      return arr[top];
      }
      public boolean isEmpty(){
      
      if(top==-1){
      return true;
      }
      else{
      return false;
      }
      }
      public boolean isFull(){
      
      if(top==max-1){
      return true;
      }
      else{
      return false;
      }
      }
      public void main(String st[]){
      
      stack ob=new stack(50);
      if(!ob.isEmpty()){
      ob.push(25);
      }
      }
      }
     
      
 
    
      
