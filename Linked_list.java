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

// ...................... dleete element at end.............................

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

// ..............................REVERSE LINKED LIST...................................
// class Node {
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
		
// 		Node head = new Node(10);
// 		head.next = new Node(20);
// 		head.next.next = new Node(30);
// 		head.next.next.next  = new Node(40);
		
// // 		reverse approch...........

//         Node current = head;
//         Node prev = null;
       
        
//        while(current != null){
//         Node temp = current.next;
//         current.next = prev;
//         prev = current;
//         current = temp;
		
//        }
// 	     head = prev;
		
		
// // 		print element..........
// 	    Node temp = head;
// 		while(temp != null){
// 		    System.out.print(temp.data + " -> ");
// 		    temp = temp.next;
// 		}
// 		System.out.println("null");
		
// 	}
// }



//.......................finding index based on element...............

class Node {
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
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next  = new Node(40);
		
// 		finding index based on element.......
		int index = 0;
		int value = 20;
		
		    Node temp = head;
		   while(temp != null){
		       if(temp.data == value){
		           System.out.println(" found at index: " + index);
		           return;
		       }
		       temp = temp.next;
		       index++;
		   }
// 		print element..........
	    temp = head;
		while(temp != null){
		    System.out.print(temp.data + " -> ");
		    temp = temp.next;
		}
		System.out.println("null");
		
	}
}

//.......................finding middle element on odd number..........
Node head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);
head.next.next.next = new Node(40);
head.next.next.next.next = new Node(50);

Node slow = head;
Node fast = head;
while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}
     System.out.println(slow.data);



//  ........................Merge sorted linkedlist...........................
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
	Node head1 = new Node(1);
	head1.next = new Node(3);
	head1.next.next = new Node(4);
	head1.next.next.next = new Node(6);
	
	Node head2 = new Node(2);
	head2.next = new Node(5);
	head2.next.next = new Node(7);
	head2.next.next.next = new Node(8);
	
	Node dummy = new Node(-1);
	   Node current = dummy;
	   Node l1 = head1;
	   Node l2 = head2;
	   
	   while(l1 != null && l2 != null){
	       if(l1.data <= l2.data){
	           current.next = l1;
	           l1 = l1.next;
	       }
	       else {
	           current.next = l2;
	           l2 = l2.next;
	       }
	       current = current.next;
	   }
	   
	     if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
	   
	   System.out.println(dummy.next);	
	Node temp = head1;
	while(temp != null){
	    System.out.print(temp.data +" -> ");
	    temp = temp.next;
	}
	System.out.println("null");



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
            
    //...Delete alternate nodes of a Linked ListDelete alternate nodes of a Linked List
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            head.next.next.next.next.next = new Node(6);
            head.next.next.next.next.next.next = new Node(7);
            
           if(head == null){
               System.out.println("kahlii");
               return;
           }
           else {
                  Node current = head;
                  while(current != null && current.next != null){
                      current.next = current.next.next;
                      current = current.next;
                  }
           }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }


    //  ...................check pallindrome.......................

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
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(1);
            
    // 		find middle element.....
            Node slow = head;
            Node fast = head;
            
            while(fast  != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
    // 		System.out.println(slow.data);
            
            
            
    // 	     reverse element.....
             Node cur = slow;
             Node prev = null;
             Node next = null;
             
             while(cur != null){
                 next = cur.next;
                 cur.next = prev;
                 prev = cur;
                 cur = next;
                 
             }
    // 		 System.out.println(prev);
        
            
            //   Node temp = prev;
            //   while(temp != null){
            //       System.out.print(temp.data + " <- ");
            //       temp = temp.next;
            //   }
            //   System.out.println("null");
            
    // 		check paliindrome...............
            
             Node firsthalf = head;
             Node secondhalf = prev;
             boolean isplalindrom = true;
             
             while(secondhalf != null){
                 if(firsthalf.data != secondhalf.data){
                      isplalindrom = false;
                   break;
                 }
                 firsthalf = firsthalf.next;
                 secondhalf = secondhalf.next;
             }
             
             if(isplalindrom){
                 System.out.println("pallindrom h sir..");
             }
             else {
                  System.out.println("nahiii h sir....");
             }
             
            
            
    // 		print all element.....
    // 		 temp = head;
    // 		while(temp != null){
    // 		    System.out.print(temp.data + " -> ");
    // 		    temp = temp.next;
    // 		}
    // 		System.out.println("null");
        }
    }



    // .....................pallindrome with method.....................
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(1);
    
            if (isPalindrome(head)) {
                System.out.println("Palindrome hai sir.....");
            } else {
                System.out.println("Nahi hai..");
            }
        }
    
        // Find the middle node of the linked list
        public static Node findMiddle(Node head) {
            Node slow = head;
            Node fast = head;
    
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    
        // Reverse the linked list from a given node
        public static Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;
    
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    
        // Check if the linked list is a palindrome
        public static boolean isPalindrome(Node head) {
            // Find the middle of the list
            Node middle = findMiddle(head);
    
            // Reverse the second half of the list
            Node secondHalfHead = reverse(middle);
    
            // Compare the first and second halves
            Node firstHalf = head;
            Node secondHalf = secondHalfHead;
            boolean isPalindrome = true;
    
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {  // Compare data, not nodes
                    isPalindrome = false;
                    break;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
    
            // Restore the original list (optional)
            reverse(secondHalfHead);
    
            return isPalindrome;
        }
    }
    