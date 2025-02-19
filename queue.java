// Queue is linear data structure which is work on FIFO principle like fisrt in fisrt out.

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