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
    class postfixeval{
            public static void main (String st[]){
             
             
