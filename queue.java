// Queue is linear data structure which is work on FIFO principle like fisrt in fisrt out.



// ..............................Implement Queue using Array.......................
static int size = 5;
static int arr[] = new int[size];
static int front = -1;
static int rear = -1;

// Enqueue Operation
static void enqueue(int value) {
    if (rear == size - 1) {
        System.out.println("Queue Overflow");
        return;
    }
    if (front == -1) {
        front = 0;
    }
    arr[++rear] = value;
    System.out.println(value + " enqueued");
}

// Dequeue Operation
static int dequeue() {
    if (front == -1 || front > rear) {
        System.out.println("Queue Underflow");
        return -1;
    }
    return arr[front++];
}

// Get Front Element
static int getFront() {
    if (front == -1 || front > rear) {
        System.out.println("Queue is Empty");
        return -1;
    }
    return arr[front];
}

public static void main(String[] args) {
    enqueue(10);
    enqueue(20);
    enqueue(30);

    System.out.println("Dequeued: " + dequeue()); // 10
    System.out.println("Dequeued: " + dequeue()); // 20

    System.out.println("Front Element: " + getFront()); // 30


    // ............................Implement Queue using LinkedList.................


class Node{
    int data;
    Node next;
     
     Node(int data){
        this.data = data;
        this.next = null;
     }
}

public class Main
{
    static Node front = null;
    static Node rear = null;

static void enqueue(int value){
    Node newNode = new Node(value);
    if(front == null){
        front = rear = newNode;
    }
    else {
        rear.next =  newNode;
        rear = newNode;
    }
    System.out.println("enqueue " + value);
}

static int dequeue(){
    if(front == null){
        System.out.println("stack underflow");
        return -1;
    }
    else {
        int dequeuValue = front.data;
        front = front.next;
       if(front == null){
           rear = null;
       }
        return dequeuValue;
    }
    
}

static int front(){
    if(front == null){
        System.out.println("stack is empty");
        return -1;
    }
    else {
        return front.data;
    }
}
	public static void main(String[] args) {
	   enqueue(10);
	   enqueue(20);
	   enqueue(30);
	   enqueue(40);
	   System.out.println("dequeue first " + dequeue());
	   System.out.println("dequeue second " + dequeue());
	   
	   System.out.println("frontend " + front());
	}
}


// .....................Stack using one Queue (Push Costly Approach).....................
public class Main
{
   static Queue<Integer> q = new LinkedList<>();
    
static void push(int value){
    q.add(value);
    int size = q.size();
    while(size > 1){
        size--;
        q.add(q.remove());
    }
}
static int pop(){
    if(q.isEmpty()){
        return -1;
    }
    else {
       return q.remove();
    }
}
static int peek(){
    if(q.isEmpty()){
        return -1;
        
    }
    else {
        return q.peek();
    }
}
	public static void main(String[] args) {
	    
		Main.push(10);
		Main.push(20);
		Main.push(30);
		Main.push(40);
		
		System.out.println("poped first " + Main.pop());
		System.out.println("poped second " + Main.pop());
		
		System.out.println("peeked " + Main.peek());
		
		
	}
}


// ..................Stack Using Two Queues (Pop Costly Approach)................

public class Main {
    static Queue<Integer> q1 =  new LinkedList<>();
    static Queue<Integer> q2 =  new LinkedList<>();
    
static void push(int value){
    q1.add(value);
}
static int pop(){
    if(q1.isEmpty()){
        return -1;
    }
    else {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int lastElement = q1.remove();
        
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return lastElement;
    }
}

static int peek(){
    if(q1.isEmpty()){
        return -1;
    }
    else {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int topElement = q1.peek();
         q2.add(q1.remove());
         
         Queue<Integer> temp = q1;
         q1 = q2;
         q2 = temp;
        
        return topElement;
    }
}

	public static void main(String[] args) {
	   Main.push(10);	
	   Main.push(20);
	   Main.push(30);
	   Main.push(40);
	   
	 System.out.println("poped first " + pop());
	 System.out.println("poped second " + pop());
	 System.out.println("peeked element " + peek());
	}
}