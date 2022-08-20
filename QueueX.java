//implementation of Queue data structure 
/*                                                      /* 
 *   Name = Hanuman Kalyan Kawhale                       *
 *                                                       *
 *   Program = Queue data structure                      *
 *                                                       *
 *   Method = add ,remove , peek ,printlist              *
 *                                                       *
 */                                                      /* */

public class QueueX {    
   static Node head; 

    static class Node {  //create node class
        int data;
        Node next;

        Node(int data) {      //constructor initialize the data
            this.data = data;
            this.next = null;
        }
    }
    // empty method Queue is empty or not
    public static boolean isEmpty() {
       head = null;
       System.out.println("Queue is empty");
       return true; 
        
    }

    //enqueue
    /*
     * this method is add element in queue at next position
     */
    public static void add(int data) {
        Node newNode = new Node( data);
        
        //check your queue
        if(isEmpty()) {
            head = newNode;
            return;
        }

        // first create element and add next
        else{
            Node currNode = head;
            while(currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
                      
    }       

    //dequeue 
    /*
     * this method is remove first element 
     */
    public static void remove() {

        //check queue
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        //remove first element 
        else{
            head = head.next;
        }        
    }

    public static int  peek() {
        //check queue
        if(head == null) {
            System.out.println("Queue is empty");;
        }
        //print your peek element means front element
        else{
            System.out.println(head.data);
            
        }
        return head.data;       
    }
    
    //printList
    public static void printQueue() {
        //check queue
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        //print your Queuelist
        else{
            Node currNode = head;
            while(currNode != null) {
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            } 
            System.out.println("null");
        }
    }
    //main method start your program here
    public static void main(String[] args) {             
        
        QueueX q = new QueueX();    //cerete object that is physical entity of class 
                                       
    }

}