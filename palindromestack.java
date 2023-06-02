import java.io.*;
import java.util.*;

class Ourstack
{
      private int max;
      private char arr[];
      private int top;
      public Ourstack(int s){
            max=s;
            arr= new char[max];
            top=-1;
            }
      public void push(char j){
             top++;
             arr[top]=j;
             }
      public char pop(){
            char str=arr[top];
            top--;
            return str;
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
      
       }
    
      
      class palindromestack{
              
              public static void main (String st[]){
              
              Scanner sc=new Scanner(System.in);
              System.out.println("enter the string");
              
              String str;
              String reverse="";
              str=sc.nextLine();
              
              int n=str.length();
              Ourstack stack=new Ourstack(n);
              
              if(!stack.isFull()){
              for(int i=0; i<n; i++){
              stack.push(str.charAt(i));
              }
              while(!stack.isEmpty()){
              reverse=reverse+stack.pop();
              }
              if(str.equals(reverse)){
                System.out.println("palindrome");
               }
               else{
               System.out.println("not palindrome");
               }
              }
             }
             }
               
             

