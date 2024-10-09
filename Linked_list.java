// // ............................print linked list...............................
// class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	   Node head = new Node(1);
// 	   head.next = new Node(2);
// 	   head.next.next = new Node(3);
// 	   head.next.next.next = new Node(4);
	   
// 	   Node temp = head;
// 	   while(temp.next != null){
// 	       System.out.print(temp.data + " -> ");
// 	       temp = temp.next;
// 	   }
// 	   System.out.println("null");
// 	}
// }


// // .....................INSERTION ELEMENT AT STARTING.................
// //     custom class.......
// class Node{      // two part of Node : 1 data, 2: next point of head..
//     int data;    
//     Node next;
//     // constructor..........
//     Node(int data){
//         this.data = data;  // this.data - instance variable..inside class 
//         this.next = null;  // data = construtor data
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// // 	 initializie element.........
// 	 Node head = new Node(10);
// 	 head.next = new Node(20);
// 	 head.next.next = new Node(30);
	  
// // 	  insertion at starting......
// 	  Node newNode = new Node(5);
// 	  newNode.next = head;
// 	  head = newNode;
	  
// // 	 orint all element.......... 
// 	  Node temp = head;
// 	  while(temp != null){
// 	      System.out.print(temp.data + " -> ");
// 	      temp = temp.next;
// 	  }
// 	  System.out.println("null");
// 	}
// }

// // ..................insertion at end.......................
// class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
       
//          Node newNode = new Node(4);
       
//       if(head == null){
//           head = newNode;
//       }
//       else {
//           Node temp = head;
//           while(temp.next != null){
//               temp = temp.next;
//           }
//           temp.next = newNode;
//       }
         
            
//       Node temp = head;
//       while(temp != null){
//           System.out.print(temp.data + " -> ");
//           temp = temp.next;
//       }
//       System.out.println("null");
// 	}
// }



// //     custom class.......
// class Node{      // two part of Node : 1 data, 2: next point of head..
//     int data;    
//     Node next;
//     // constructor..........
//     Node(int data){
//         this.data = data;  // this.data - instance variable..inside class 
//         this.next = null;  // data = construtor data
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// // 	 initializie element.........
// 	 Node head = new Node(10);
// 	 head.next = new Node(20);
// 	 head.next.next = new Node(30);
	  
// // 	  insertion at starting......
// 	  Node newNode = new Node(5);
// 	  newNode.next = head;
// 	  head = newNode;

// // 	 orint all element.......... 
// 	  Node temp = head;
// 	  while(temp != null){
// 	      System.out.print(temp.data + " -> ");
// 	      temp = temp.next;
// 	  }
// 	  System.out.println("null");
	  
// 	   //  traversing from starting.......
// 	    temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
        
// //    insert element at end......
// 	 Node lastNode = new Node(40);
// 	  temp.next = lastNode;
// 	  lastNode.next = null;
	  
// 	    temp = head;
// 	    while(temp != null){
// 	        System.out.print(temp.data + " -> ");
// 	        temp = temp.next;
// 	    }
// 	    System.out.println("null");
// 	}
// }

// //  ......................bich me insert krna element ko..............

// class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
      
//        int position = 2;
//        int Newdata = 100;
//       Node newNode = new Node(Newdata);
      
//       if(position == 0){
//           newNode.next = head;
//           head = newNode;
//       }
//       else {
//           Node temp = head;
//           for(int i=0; i<position-1; i++){
//               temp = temp.next;
//           }
//            newNode.next = temp.next; 
//             temp.next = newNode;
//       }
      
//       Node temp = head;
//       while(temp != null){
//           System.out.print(temp.data + " -> ");
//           temp = temp.next;
          
//       }
//      System.out.println("null");
// 	}
// }


// // .........................replace ka element..........................
// class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
      
//        int position = 2;
//        int Newdata = 100;
//       Node newNode = new Node(Newdata);
      
//       if(position == 0){
//           newNode.next = head;
//           head = newNode;
//       }
//       else {
//           Node temp = head;
//           for(int i=0; i<position-1; i++){
//               temp = temp.next;
//           }
//            newNode.next = temp.next; 
//             temp.next = newNode; 
//             newNode.next = newNode.next.next;
//       }
      
//       Node temp = head;
//       while(temp != null){
//           System.out.print(temp.data + " -> ");
//           temp = temp.next;
          
//       }
//      System.out.println("null");
// 	}
// }

// ........................all process of insert.....................

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
	public static void main(String[] args) {
	   //  initilize value....
     Node head = new Node(10);
     head.next = new Node(20);
     head.next.next = new Node(30);
     head.next.next.next = new Node(40);
     
    //   insert value at end....
     Node newNode = new Node(50);
     
     if(head == null){
         head = newNode;
     }
     else {
         Node temp = head;
         while(temp.next != null){
            temp = temp.next;
         }
         temp.next = newNode;
            newNode.next = null;
     }
     
    //    insert element at positon3...
     
     int position = 3;
     Node newnumber = new Node(100);
     
     if(position == 0){
         newnumber.next = head;
         head = newnumber;
     }
     else {
         Node temp = head;
         for(int i=0; i<position-1; i++){
             temp = temp.next;
         }
         newnumber.next = temp.next;
         temp.next = newnumber;
           //  newnumber.next = newnumber.next.next.next;
     }
     
     
    //    print element...
     Node temp = head;
     while(temp != null){
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
	}
}


// .......................Delete element ..........................
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
	public static void main(String[] args) {
	   //  initilize value....
     Node head = new Node(10);
     head.next = new Node(20);
     head.next.next = new Node(30);
     head.next.next.next = new Node(40);
     
    //   insert value at end....
     Node newNode = new Node(50);
     
     if(head == null){
         head = newNode;
     }
     else {
         Node temp = head;
         while(temp.next != null){
            temp = temp.next;
         }
         temp.next = newNode;
            newNode.next = null;
     }
     
    //  delete element...............
     
     int value = 2;
     if(head == null){
         System.out.println("null");
         return;
     }
     else {
         Node temp = head;
         for(int i=0; i<value-1; i++){
             temp = temp.next;
         }
        temp.next = temp.next.next;
     }
     
    //    print element...
     Node temp = head;
     while(temp != null){
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
	}
}


// ......................delete element of starting............

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
	public static void main(String[] args) {
	   //  initilize value....
     Node head = new Node(10);
     head.next = new Node(20);
     head.next.next = new Node(30);
     head.next.next.next = new Node(40);
     
    //   insert value at end....
     Node newNode = new Node(50);
     
     if(head == null){
         head = newNode;
     }
     else {
         Node temp = head;
         while(temp.next != null){
            temp = temp.next;
         }
         temp.next = newNode;
            newNode.next = null;
     }
     
    //  delete element at starting...............
     if(head == null){
         System.out.println("null");
         return;
     }
     else {
         head = head.next;
         head.next = head.next;
     }
 
     
    //    print element...
     Node temp = head;
     while(temp != null){
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
	}
}

// ...................... dleete element at end.......................

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
	public static void main(String[] args) {
	   //  initilize value....
     Node head = new Node(10);
     head.next = new Node(20);
     head.next.next = new Node(30);
     head.next.next.next = new Node(40);
     
    //   insert value at end....
     Node newNode = new Node(50);
     
     if(head == null){
         head = newNode;
     }
     else {
         Node temp = head;
         while(temp.next != null){
            temp = temp.next;
         }
         temp.next = newNode;
            newNode.next = null;
     }
     
    //  delete element at end.................
   
   if(head == null){
       System.out.println("null");
       return;
   }
   else {
        Node temp = head;
   while(temp.next.next != null){
       temp = temp.next;
   }
       temp.next = temp.next.next;
   }
  
 
     
    //    print element...
     Node temp = head;
     while(temp != null){
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
	}
}