#include<iostream>
using namespace std;

class Node {

    public:
    int data;
    Node* next;
    
    //constructor
    Node(int data) {
        this -> data = data;
        this -> next = NULL;
    }

    //destructor
    ~Node() {
        int value = this -> data;
        //memory free
        if(this -> next != NULL) {
            delete next;
            this -> next = NULL;
        }
    }
};

void insertAtHead(Node* &head, int data) {
    //new Node create
    Node* newNode = new Node(data);
    newNode -> next = head;
    head = newNode;
}

void insertAtTail(Node* &tail, int data) {
    //new Node create
    Node* newNode = new Node(data);
    tail -> next = newNode;
    tail = tail -> next;

}

void insertAtPosition(Node* &tail,Node* &head,int position, int data) {
    
    //insert
    if(position == 1) {
        insertAtHead(head,data);
        return;
    }
    Node* currNode = head;
    int cnt = 1;

    while(cnt < position-1) {
        currNode = currNode -> next;
        cnt++;
    }
    //insert tail 
    if(currNode -> next = NULL) {
       insertAtTail(tail,data);
       return;
    }
    //create a node
    Node* newNode = new Node(data);

    newNode -> next = currNode -> next;
    currNode -> next = newNode;
}



void deleteNode(int position,Node* &head) {

    if(position == 1) {
        Node* currNode = head;
        head = head -> next;
        delete currNode;
    }
    else {
        //deletint any middle node or last node
        Node* currNode = head;
        Node* prevNode = NULL;

        int cnt = 1;
        while(cnt <=position) {
            prevNode = currNode;
            currNode = currNode -> next;
            cnt++;
        }

        prevNode -> next = currNode -> next;
        currNode -> next = NULL;
        delete currNode;

    }
}

void print(Node* &head) {
    Node* currNode = head;

    while(currNode != NULL) {
        cout << currNode -> data << " ";
        currNode = currNode -> next;
    }
    cout << endl;
}

int main() {

    Node* node1 = new Node(10);
    cout << node1 -> data << endl;
    cout << node1 -> next << endl;
    
    //head pointed to node1
    Node* head = node1;
    //tail pointed to node1
    Node* tail = node1;
    print(head);

    insertAtHead(head, 12);
    print(head);
    insertAtTail(tail,23);
    print(head);

    
    insertAtHead(head,8);
    print(head);
    insertAtHead(head,6);
    print(head);
    insertAtHead(head,4);
    print(head);
    deleteNode(4,head);
    print(head);
    


    return 0;
}