//implementation of stack data structure
/*                                                    /* 
 * Name = Hanuman Kalyan Kawhale                       *
 *                                                     *
 * Program = Stack data structure                      *
 *                                                     *
 * Method = push, pop, peek ,printStack                *
 */                                                    /* */

public class StackX {
    
    static class Node {    
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    //class Stack
    static class Stack {
        public static Node head;
        //this is empty method
        public static boolean isEmpty() {
            return head == null;
        }
        /*
         * this is push method 
         * that is use push data in stack
         */
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }
           
        /*
         * this is pop method 
         * that use of pop method is last data remove 
         * means  last in first out (LIFO)
         */
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            //pop data
            else{
                int top = head.data;
                head = head.next;
                return top;
            }
         
        }
        /*
         * that is peek method 
         * stack peek data
         */
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
          
            return head.data;
    
        }
        //printStack method is print data 
        public static void printStack() {
            while(!isEmpty()) {
                System.out.print(peek()+" || ");
                pop();
            } 
            System.out.println();
        }
      
    }
    //program start here
    public static void main(String[] args) {
        Stack s = new Stack();  //object create   
        
    }
}