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
    Queue<Integer> q = new LinkedList<>();
 
    
 void push(int value){
     q.add(value);
      int size = q.size();
    for(int i=0; i<size-1; i++){
        q.add(q.remove());
    }
     
 }
 int pop(){
   if(q.isEmpty()){
       return -1;
   } 
   else {
       return q.remove();
   }
    
}
 int peek(){
    if(q.isEmpty()){
        return -1;
    }
   else{
          return q.peek();
   }

 }
	public static void main(String[] args) {
		Main s = new Main();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println("poped " + s.pop());
		System.out.println("peeked " + s.peek());
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

// ............... Queue using two stack means  queue ko banan stack ki help se
public class Main
{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
 void enqueue(int value){
     s1.push(value);
 }
 
 int dequeue(){
     if(s1.isEmpty() && s2.isEmpty()){
         return -1;
     }
     else {
         if(s2.isEmpty()){
             while(!s1.isEmpty()){
                 s2.push(s1.pop());
             }
         }
         return s2.pop();
     }
 }
 
 int front(){
     if(s1.isEmpty() && s2.isEmpty()){
         return -1;
     }
     else {
         if(s2.isEmpty()){
             while(!s1.isEmpty()){
                 s2.push(s1.pop());
             }
         }
         return s2.peek();
     }
 }
	public static void main(String[] args) {
	   Main queueUsingstack = new Main();
	   queueUsingstack.enqueue(10);
	   queueUsingstack.enqueue(20);
	   queueUsingstack.enqueue(30);
	   queueUsingstack.enqueue(40);
	   System.out.println("dequeue first " + queueUsingstack.dequeue());
	   System.out.println("dequeue second " + queueUsingstack.dequeue());
	    System.out.println("peeked first " + queueUsingstack.front());
	}
}


// .......................Queue using one stack.......................
public class Main
{
    Stack<Integer> s1 = new Stack<>();
    
    
 void enqueue(int value){
    if(s1.isEmpty()){
        s1.push(value);
        return;
    }
    
        int top = s1.pop();
        enqueue(value);
        s1.push(top);
 }
 
 int dequeue(){
     if(s1.isEmpty()){
         return -1;
         
     }
     else{
         return s1.pop();
     }
 }
 
 int front(){
     if(s1.isEmpty()){
         return -1;
         
     }
     else{
         return s1.peek();
     }
 }
	public static void main(String[] args) {
	   Main queueUsingstack = new Main();
	   queueUsingstack.enqueue(10);
	   queueUsingstack.enqueue(20);
	   queueUsingstack.enqueue(30);
	   queueUsingstack.enqueue(40);
	   System.out.println("dequeue first " + queueUsingstack.dequeue());
	   System.out.println("dequeue second " + queueUsingstack.dequeue());
	    System.out.println("peeked first " + queueUsingstack.front());
	}
}