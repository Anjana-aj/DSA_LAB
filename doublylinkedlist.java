class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class DoublyLinkedList {
   public Node head;
   public Node tail;

   public  void addNode(int data) {
       Node newNode = new Node(data);
   if(head == null){
       head = newNode;
       

   }
   else{
       tail.next = newNode;
       newNode .prev = tail;
      
       
   }
   tail = newNode;
   
   }
   public void display(){
       if(head == null){
           System.out.println("empty");
           return;
       }
       Node temp = head;
       while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
       }

   }

   
   public void delete(int data){
       Node temp = head;
       if(head.data == data){
           head = temp.next;
           head.prev = null;
           return;
       }
       while(temp!=null){

         if(temp.data == data){
             temp.prev.next = temp.next;
             temp.next.prev = temp.prev;
             if(temp == tail){
                 tail = temp.prev;
                 tail.next = null;
             }
             return;
         }
         temp = temp.next;

       }
   }
   public void insert(int searchData, int data){
       Node newNode = new Node(data);
       Node temp = head;
       if(head.data == searchData){
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
           return;
           
       }
       while(temp!=null){
           if(searchData == temp.data){
               newNode.next = temp;
               temp.prev.next = newNode;
               temp.prev = newNode;
               return;

           }
           temp = temp.next;
       }
   }
   public void removeDuplicate(){
       Node i = head;
      
       while(i!=null){
        Node j = i.next;
           while(j!=null){
               if(i.data == j.data){
                   if(j==tail){
                       tail.prev.next = null;
                       tail = tail.prev;
                       break;
                   }
                j.prev.next = j.next;
                j.next.prev = j.prev;

               }
               j = j.next;
           }
           i = i.next;


       }
   }
   public static void main(String[] args){
      doublylinkedlist list=new doublylinkedlist();
      Scanner sc=new Scanner(System.in);
      int choice=0,temp;
      while(choice!=5){
      System.out.println("enter 1 to add,2 for display,3 for insert,4 for delete,5 for exit:");
      choice=sc.nextInt();
      switch(choice){
       case 1:
                System.out.println("enter no to add");
                temp=sc.nextInt();
                list.addlink(temp);
                break;
       case 2:
                System.out.println("current elements are");
                list.displaylink();
                break;
       case 3:
                System.out.println("enter element to be deleted");
                temp=sc.nextInt();
                list.delete(temp);
                break;
       case 4:
                System.out.println("enter where to insert");
                temp=sc.nextInt();
                System.out.println("enter data to be inserted");
                int data=sc.nextInt();
                list.insert(temp,data);
                break;
                
     default:
              System.out.println("exit");
      }
       
                
      
     }
   }
   }
 
    
    
