//implementation of Doubly LinkedList data structure
/*                                                                 /* 
 *  Name = Hanuman Kalyan Kawhale                                   *
 *                                                                  *
 *  Program = Doubly LinkedList Data Structure                      *
 *                                                                  *
 *  Method = addFirst, addLast, addAtPosition,                      *
 *           deletefirst, deleteLast, deleteAtPosition,             *
 *           printList                                              *
 */                                                                 /**/
public  class DoublyLink {
    Node head;
    
    class Node {
        int data;
        Node next;
        Node prev;

        // parameterized constructor
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //addFirst
    /*
     * addFirst method is add data first in dobly linkedList
     */
    public void addFirst(int data) {
        //create new node
        Node newNode = new Node(data);
        //no node in list then first node is new Node
        if(head == null) {
            head = newNode;
            return;
        }
        //already have Node then add Node at first 
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }     
    }
    //addLast 
    /*
     * addLast method is data add at last 
     */
    public void addLast(int data) {
        //create new node
        Node newNode = new Node(data);
        //no node in list then first node is new Node
        if(head == null) {
            head = newNode;
            return;
        }
        //already have Node then add Node at last 
        else {
            Node currNode = head;
            while(currNode.next != null) {
                currNode = currNode.next;
    
            }
            currNode.next = newNode;
            newNode.prev = currNode;
            currNode = newNode;
        }      

    }
    //addAtPosition
    /*
     * addAtPosition method is add data at position
     * passing position and data as parameter
     */
    public void addAtPosition(int position,int data) {
        Node currNode = head;
        //position first
        if(position == 1) {
            addFirst(data);
            return;
        }
         //addlast
        else if(currNode.next == null) {
            addLast(data);
            return;
        }
        //add the node at middle position
        else {
            int cnt=1;
            while(cnt<position - 1) {
                currNode=currNode.next;
                cnt++;   
            }
    
            Node newNode = new Node(data);
            newNode.next = currNode.next;
            currNode.next.prev = newNode;
            currNode.next = newNode;
            newNode.prev = currNode;
        }       

    }
    
    //deleteFirst 
    /*
     * deleteFirst method is delete data at first position
     */
    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        //delete first position
        else {
            Node currNode = head;
            currNode.next.prev = null;
            head = currNode.next;
            currNode.next = null;
        }
        
    }
    
    //deleteAtPosition 
    /*
     * deleteAtPosition method is delete data Doubly LinkedList
     * passing position 
     */
    public void deleteAtPosition(int position) {
        //delete at first position
        if(position == 1) {
            Node currNode = head;
            head = head.next;
            currNode = null;
        }
        //delete at position passing position 
        else {
            
            Node currNode = head;
            Node prevNode = null;

            int cnt = 1;
            while(cnt < position) {
                prevNode = currNode;
                currNode = currNode.next;
                cnt++;
            }

            prevNode.next = currNode.next;
            currNode.next.prev = prevNode;
            currNode = null;
            currNode=null;

        }
    }

    //deleteLast
    /*
     * deleteLast method is delete last data
     */
    public void deleteLast() {
        // list is empty
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        //head null
        else if(head.next == null) {
            head = null;
            return;
        }
        //delete last Node
        else {
            Node secondLast = head;
            Node lastNode = head.next;

            while(lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next.prev = null;
            secondLast.next = lastNode.next;
            secondLast.next = null;

        }
        
    }

    //printList
    /*
     * printList method is print list 
     */
    public void printList() {

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
             currNode = currNode.next;
        }
        System.out.println("null");  
    }

    //program start here
    public static void main(String[] args) {

        DoublyLink list = new DoublyLink();  //object create
      
        

    }
}
