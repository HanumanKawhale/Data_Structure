// implementation of Singly LinkedList data structure
/*                                                             /* 
 *  Name = Hanuman Kalyan Kawhale                               *
 *                                                              *
 *  Program = Singly LiskedList Data Structure                  *
 *                                                              *   
 *  Method = addFirst, addLast, addAtPosition,                  *
 *           deleteFirst, deleteLast, deleteAtPosition,         *
 *           printList                                          *  
 */                                                             /* */  
public class Linkedlist {
    Node head;
    
    //constructor
    Linkedlist() {    
    
    }

    class Node {
        int data;
        Node next;
        // parameterized constructor
        Node(int data) {
            this.data = data;
            this.next = null;
            
        }
    }

    //insert at first 
    /*
     * addFirst method is insert data at first position
     * 
     */
    public void addFirst(int data) {
        // create new Node
        Node newNode = new Node(data);  
        //check your list 
        if(head == null) {
            head = newNode;
            return;
        }
        //add data first position and first position is head
        else {
            newNode.next = head;
            head = newNode;
        }    
    } 
    
    //addAtPosition
    /*
     * addAtPosition method is insert at position passing your position and data
     */
    public void addAtPosition(int position, int data) {
        //create new Node
        Node newNode = new Node(data);
        //assuming head is current Node 
        Node currNode = head;
        int cnt = 1;

        while(cnt<position - 1) {
            currNode = currNode.next;
            cnt++;
        }
        //set the Node at Position
        newNode.next = currNode.next;
        currNode.next=newNode;
        
        //at last position
        if(currNode.next == null) {
            addLast(data);
            return;
        }
    }
    //addLast
    /*
     * addLast method is data add last position
     */
    public void addLast(int data) {
        //create new Node 
        Node newNode = new Node(data);
        
        if(head == null) {
            head = newNode;
            return;
        }
        //add data at last
        else{
            Node currNode = head;
            while(currNode.next != null) {
                currNode = currNode.next;
            }
    
            currNode.next = newNode;
        }
      
    }

    //deleteFirst
    /*
     * deleteFirst method is first data delete
     */
    public void deleteFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        else{
            head = head.next;
        }       
    }
    
    //deleteAtPosition
    /*
     * deleteAtPosition method is delete data at any position
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
            currNode.next = null;
        }
    }

    //deleteLast
    /*
     * deleteLast method is data delete at last 
     */
    public void deleteLast() {
        //list is empty
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        
        // 1 data in list 
        if(head.next == null) {
            head = null;
            return;
        }
        // delete last 
        else{
            Node secondLast = head;
            Node lastNode = head.next;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
    
            }
            secondLast.next = null;
        }
     
    }
    //reverseList
    /*
     * reverseList method is list data is reverse
     */
    public void reverseList() {
        if(head == null || head.next == null ) {
            return;
        }
        //chage your head 
        else {
            Node prevNode = head;
            Node currNode = head.next;

            while(currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;

                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;
        }
    }
    //printList
    /*
     * printList method is data in list
     */
    public void printList() {
        if(head == null) {
            System.out.println("list is enpty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
             currNode = currNode.next;
        }
        
        System.out.println("NULL");
    }
    
    //main method program start here    
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
                       
    }

}