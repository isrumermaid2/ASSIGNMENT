
package doublylinkedlist;


    
class Node {
    public int data; 
    public Node next; 
    public Node previous; 
 
    
    public Node(int data){
           this.data = data;
    }
 
    
    public void displayNode() {
           System.out.print( data + " ");
    }
}
 
 

class LinkedList {
    private Node head; 
    private Node tail; 
 
    
    public LinkedList(){
           head = null;
    }
  
 
    
    public void insertFirst(int data){ 
           Node newNode = new Node(data); 
           if (head == null) 
                  last = newNode; 
           else
                  head.previous = newNode; 
           newNode.next = head; 
           head= newNode; 
    }
 
    
    public Node deleteHead() { 
                
           if(Head==null){               
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }

           Node tempNode = head;
           if (head.next == null)  
                  tail = null; 
           else
                  head.next.previous = null; 
           head = head.next;
           return tempNode;
    }
 
    
   
    public void display() {
           System.out.print("Displaying in forward direction [head--->last] : ");
           Node tempDisplay = head; 
           while (tempDisplay != null){ 
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println("");
    }
 
 

      
    }
    
 
}
 
 
  

public class DoublyLinkedList {
    public static void main(String[] args) {
           LinkedList linkedList = new LinkedList(); // creation of Linked List
           
           linkedList.insertHead(11);
           linkedList.insertHead(21);
           linkedList.insertHead(59);
           linkedList.insertHead(14);
          
 
           linkedList.display(); 
        
                        
           System.out.print("Deleted Nodes: ");
           Node deletedNode = linkedList.deleteHead(); 
           deletedNode.displayNode();                                 
           deletedNode = linkedList.deleteHead();    
           deletedNode.displayNode();                                 
           
           System.out.println();
           
           linkedList.display(); 
        
           
           
