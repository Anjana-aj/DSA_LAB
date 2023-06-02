import java.io.*;
import java.util.*;
class Stack
{
private char array[];
private int max;
private int top;
public Stack(int s)
{
max=s;
array=new char[max];
}
public void Push(char j)
{
top++;
array[top]=j;
}
public char pop()
{
return(array[top--]);
}
public char peek()
{
return array[top];
}
public boolean IsEmpty()
{
if(top==-1)
return true;
else
return false;
}
public int op(char op)
{
if((op=='+')||(op=='-'))
return 1;
if((op=='*')||(op=='/'))
return 2;
if(op=='^')
return 3;
else 
return 0;
}
}
class InfixToPostfix
{
public static void main(String st[])
{
Scanner input=new Scanner(System.in);
String s;
String res="";
System.out.println("Enter the String: ");
s=input.nextLine();
Stack stck=new Stack(s.length());
for(int i=0;i<s.length();i++)
{
char a=s.charAt(i);
if((a!='+')&&(a!='-')&&(a!='*')&&(a!='/')&&(a!='^'))
{
res=res+a;
}
else if(a=='{')
{
stck.Push(a);
}
else if(a=='}')
{
char sr=stck.pop();
while(!stck.IsEmpty())
{
if(sr=='{')
break;
else
{
res=res+sr;
}
}
}
else
{
if(stck.IsEmpty())
{
stck.Push(a);
}
else
{
while(!stck.IsEmpty())
{
char m=stck.pop();
if(m=='{')
{stck.Push(m);
break;
}
else if((m=='+'||)(m=='-'||)(m=='*')||(m=='/')||(m=='^'))
{
if(stck.op(a)>stck.op(m))
{
stck.Push(a);
break;
}
else
{
res=res+stck.pop();
}
}
}
}
}
}
System.out.println("result: "+res);
}
}








