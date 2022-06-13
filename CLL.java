// implementation of Circular LinkedList data structure
/*                                                   /* 
 *   Name = Hanuman Kalyan Kawhale                    *
 *                                                    *
 *   Program = Circular LinkedList Data Structure     *
 *                                                    *
 *   Method = insertNode, deleteNode, printNode       *  
 */                                                   /* */
public class CLL {

    Node tail;

    class Node {

        int data;
        Node next;
        
        //parameterized constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //insertNode
    /*
     * insertNode method is insert data 
     * passing element and data
     */
    public void insertNode(int element, int data) {
        //assuming that element is present in the list

        //empty list
        if(tail == null) {
            Node newNode = new Node(data);
            tail = newNode;
            newNode.next = newNode;
        }
        else {
            //non empty list
            Node currNode = tail;
            while(currNode.data != element) {
                currNode = currNode.next;
            }

            //element found
            Node newNode = new Node(data);
            newNode.next = currNode.next;
            currNode.next = newNode;
           
        }
   
    }
    //deleteNode
    /*
     * deleteNode method is passing data and that data delete 
     */

    public void deleteNode(int value) {

        //list is empty
        if(tail == null) {
            System.out.println("list is empty");
            return;
        }
        else {
            //non empty
            //value is present in list
            Node prevNode = tail;
            Node currNode = prevNode.next;

            while(currNode.data != value) {
                prevNode = currNode;
                currNode = currNode.next;

            }
            prevNode.next = currNode.next;
         
        }
    }
    //printList 
    /*
     * printList method is data print 
     */
    public void printList() {
        Node currNode = tail;
        //do while loop is use iterate at least one time 
        do {
            System.out.print(tail.data + "->");
            tail = tail.next;
        } while(tail != currNode );

        System.out.println("null");
    }
    //program start here
    public static void main(String[] args) {
        CLL list = new CLL();  //object create
      
    }
}
