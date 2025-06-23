// ............................print linked list...............................
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
	   head.next.next.next = new Node(4);
	   
	   Node temp = head;
	   while(temp.next != null){
	       System.out.print(temp.data + " -> ");
	       temp = temp.next;
	   }
	   System.out.println("null");
	}
}


// .....................INSERTION ELEMENT AT STARTING.................
//     custom class.......
class Node{      // two part of Node : 1 data, 2: next point of head..
    int data;    
    Node next;
    // constructor..........
    Node(int data){
        this.data = data;  // this.data - instance variable..inside class 
        this.next = null;  // data = construtor data
    }
}
public class Main
{
	public static void main(String[] args) {
// 	 initializie element.........
	 Node head = new Node(10);
	 head.next = new Node(20);
	 head.next.next = new Node(30);
	  
// 	  insertion at starting......
	  Node newNode = new Node(5);
	  newNode.next = head;
	  head = newNode;
	  
// 	 orint all element.......... 
	  Node temp = head;
	  while(temp != null){
	      System.out.print(temp.data + " -> ");
	      temp = temp.next;
	  }
	  System.out.println("null");
	}
}

// ..................insertion at end.......................
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
       
         Node newNode = new Node(4);
       
      if(head == null){
          head = newNode;
      }
      else {
          Node temp = head;
          while(temp.next != null){
              temp = temp.next;
          }
          temp.next = newNode;
      }
         
            
      Node temp = head;
      while(temp != null){
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
	}
}



//     custom class.......
class Node{      // two part of Node : 1 data, 2: next point of head..
    int data;    
    Node next;
    // constructor..........
    Node(int data){
        this.data = data;  // this.data - instance variable..inside class 
        this.next = null;  // data = construtor data
    }
}
public class Main
{
	public static void main(String[] args) {
// 	 initializie element.........
	 Node head = new Node(10);
	 head.next = new Node(20);
	 head.next.next = new Node(30);
	  
// 	  insertion at starting......
	  Node newNode = new Node(5);
	  newNode.next = head;
	  head = newNode;

// 	 orint all element.......... 
	  Node temp = head;
	  while(temp != null){
	      System.out.print(temp.data + " -> ");
	      temp = temp.next;
	  }
	  System.out.println("null");
	  
	   //  traversing from starting.......
	    temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
//    insert element at end......
	 Node lastNode = new Node(40);
	  temp.next = lastNode;
	  lastNode.next = null;
	  
	    temp = head;
	    while(temp != null){
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    }
	    System.out.println("null");
	}
}

//  ......................bich me insert krna element ko..............

class Node{
    int data ;
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
		head.next.next.next = new Node(40);
		
		Node newNOde = new Node(100);
		
		  int pos = 1;
		if(pos == 0){
		    head = newNOde;
		}
		else {
		      Node temp = head;
		    for(int i =0; i<pos-1; i++){
		        temp = temp.next;
		       
		    }
		     newNOde.next = temp.next;
		        temp.next = newNOde;
		}
		
		
		Node temp = head;
		while(temp != null){
		    System.out.print(temp.data + "->");
		    temp = temp.next;
		}
		System.out.println("null");
	}
}class Node{
    int data ;
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
		head.next.next.next = new Node(40);
		
		Node newNOde = new Node(100);
		
		  int pos = 1;
		if(pos == 0){
		    head = newNOde;
		}
		else {
		      Node temp = head;
		    for(int i =0; i<pos-1; i++){
		        temp = temp.next;
		       
		    }
		     newNOde.next = temp.next;
		        temp.next = newNOde;
		}
		
		
		Node temp = head;
		while(temp != null){
		    System.out.print(temp.data + "->");
		    temp = temp.next;
		}
		System.out.println("null");
	}
}


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

// ...................... delete element at end.............................

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
   
   class Node{
    int data ;
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
		head.next.next.next = new Node(40);
		
		Node newNOde = new Node(100);
		
	  if(head == null){
	     System.out.println("List is empty");
	  }
	  else if(head.next == null){
	      head = null;
	  }
	  else {
	       Node temp = head;
	       while(temp.next.next != null){
	           temp = temp.next;
	       }
	       temp.next = null;
	  }
		
		
		Node temp = head;
		while(temp != null){
		    System.out.print(temp.data + "->");
		    temp = temp.next;
		}
		System.out.println("null");
	}
}   


//  ...................middle se kahi se bhi delete node.................

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
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		int position = 3;
		  Node temp = head;
		  
		  if(temp == null){
		    System.out.println("null");
		    return;
		  }
		  else {
		      for(int i=0; i<position-1; i++){
		          temp = temp.next;
		      }
		      temp.next = temp.next.next;
		  }
	
	    temp = head;
		while(temp != null){
		    System.out.print(temp.data + "->");
		    temp = temp.next;
		}
		System.out.println("null");
	}
}

//  ...............delete middle elment of linked list...............

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
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    
    Node slow = head;
    Node fast = head;
    Node prev = null;
    
    while(fast.next != null && fast.next.next != null){
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    
    if(prev != null){
        prev.next = prev.next.next;
    }
    else {
        head = head.next;
    }
    
    Node temp =  head;
    while(temp != null){
        System.out.print(temp.data + "->");
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
       
        
       while(current != null){
        Node temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
		
       }
	     head = prev;
		
		
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
// Node head = new Node(10);
// head.next = new Node(20);
// head.next.next = new Node(30);
// head.next.next.next = new Node(40);
// head.next.next.next.next = new Node(50);

// Node slow = head;
// Node fast = head;
// while(fast != null && fast.next != null){
//     slow = slow.next;
//     fast = fast.next.next;
// }
//      System.out.println(slow.data);


// ..........................finding middle element on even number..............


//      class Node{
//     int data ;
//     Node next;
    
//   Node(int data){
//       this.data = data;
//       this.next = null;
//   }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 		Node head = new Node(10);
// 		head.next = new Node(20);
// 		head.next.next = new Node(30);
// 		head.next.next.next = new Node(40);
// 		head.next.next.next.next = new Node(50);
// 		head.next.next.next.next.next = new Node(60);
		
// 		Node newNOde = new Node(100);
	   
// 	    Node slow = head;
// 	    Node fast = head;
// 	    while(fast != null){
// 	        slow = slow.next;
// 	        fast = fast.next.next;
// 	    }
// 		System.out.println(slow.data);

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
               System.out.println("khalii");
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
		
         Node slow = head;
         Node fast = head;
    while(fast.next != null && fast.next.next != null){
              slow = slow.next;
              fast = fast.next.next;
          }
          
          Node current = slow.next;
          Node prev = null;
          while(current != null){
              Node temp = current.next;
              current.next = prev;
              prev = current;
              current = temp;
          }
            
            
            Node fristHlaf = head;
            Node secondHalf = prev;
            boolean isPallindrom = true;
            
            while(secondHalf != null){
                if(fristHlaf.data != secondHalf.data){
                    isPallindrom = false;
                    break;
                }
                fristHlaf = fristHlaf.next;
                secondHalf = secondHalf.next;
            }
            if(isPallindrom){
                System.out.println("this is Pallindrom");
            }
            else {
                System.out.println("not Pallindrom");
            }
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

    //     ....................find the length in linkedList....................

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
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		
		int index = 0;
        Node temp = head;
        while(temp != null){
            
            temp = temp.next;
            index++;
        }
       System.out.println(index);
	}
}

    // ..............................DOUBLYY LINKED LIST.................
    //     All deletion process of doubly linked list..................

    class Node{
        int data;
        Node next , prev;
        
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public class Main
    {
        public static void main(String[] args) {
             Node head = new Node(1);
             head.next = new Node(2);
             head.next.next = new Node(3);
             head.next.next.next = new Node(4);
             head.next.next.next.next = new Node(5);
             head.next.next.next.next.prev = head.next.next.next;
             
             
    //       dlete middle element......  
             Node prev = null;
             Node slow = head;
             Node fast = head;
             
             if(head == null){
                 System.out.println("Empty");
                 return;
             }
             else {
                 Node temp = head;
                 while(fast.next != null && fast.next.next != null){
                     prev = slow;
                     slow = slow.next;
                     fast = fast.next.next;
                 }
                 
                 prev.next = slow.next;
                 slow.next.prev  = prev; 
             }
             
             
             
            
           //   delete element in ending......
                  if(head == null){
                      System.out.println("Empty");
                      return;
                  }
                  else {
                         Node temp = head;
                      while(temp.next.next != null){
                         temp = temp.next;
                      }
                       temp.next = null;
                  }
                     Node temp = head;
                  if(temp.prev != null){
                      temp.prev.next = null;
                  }
                  
                  
          
    // 	        Delete element in the starting......
                if(head == null){
                    System.out.println("empty");
                    return;
                }
                else {
                    head = head.next;
                }
                if(head != null){
                   head.prev = null;
                }
          
    // 	      print..............
            Node temp = head;
             while(temp != null){
                 System.out.print(temp.data + "->");
                 temp = temp.next;
             }
             System.out.println("null");
        }
    }



    class Node{
        int data;
        Node next, prev;
        
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public class Main
    {
        public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        Node newnode = new Node(5);
        
            
        if(head == null){
            head = newnode;
        }
        else {
           
           newnode.next = head;
           head.prev = newnode;
           head = newnode;
         
        }
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    
    
        }
    }



     // ....................INSERTION ELEMENT AT THA end... .........


     class Node {
        int data;
         Node next, prev;
         
         Node(int data){
             this.data = data;
             this.next = null;
             this.prev = null;
         }
    }
    public class Main
    {
        public static void main(String[] args) {
         Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            
            Node newnode = new Node(50);
            
            
            if(head == null){
                head = newnode;
            }
            else {
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                   temp.next = newnode;
                    newnode.prev = temp;
            }
            
             Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }   


    // .......................INSERTION ELEMENT ANYWHERE IN LIST...............

 class Node{
    int data;
    Node next, prev;
    
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		Node newNOde = new Node(100);
	
	   int pos = 2;
	   
	   if(head == null){
	       System.out.println("List is Empty");
	       return;
	   }
	   else {
	          Node temp = head;
	       for(int i =0; i<pos-1; i++){
	         temp = temp.next;
	       }
	         newNOde.next = temp.next;
	         temp.next = newNOde;
	         newNOde.prev = temp;
	         if(newNOde.next != null){
	             newNOde.next.prev = newNOde;
	         }
	         
	   }
	   
		  Node temp = head;
		while(temp != null){
		    System.out.print(temp.data + "->");
		    temp = temp.next;
		}
	   System.out.println("null");
	}
}

//     All process of insertion in doubly linked list.................

    class Node{
        int data;
        Node next , prev;
        
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public class Main
    {
        public static void main(String[] args) {
             Node head = new Node(1);
             head.next = new Node(2);
             head.next.next = new Node(3);
             head.next.next.next = new Node(4);
             head.next.next.next.next = new Node(5);
             head.next.next.next.next.prev = head.next.next.next;
             
             Node newNode = new Node(35);
             
           //  insert element at starting...
           //     newNode.next = head;
           //     head.prev = newNode;
           //     head = newNode;
           
          // insert element at ending...
           //   if(head == null){
           //       System.out.println("khali");
           //       return;
           //   }
           //   else{
           //       Node temp = head;
           //       while(temp.next != null){
           //           temp = temp.next;
           //       }
           //        temp.next =  newNode; //single LL
           //        newNode.prev = temp;  // doubly ll
                     
           //   }
           
           //  insert element in the posistion..  
           //  int position = 4;
           // if(head == null){
           //     System.out.print("khali");
           // }
           // else {
           //     Node temp = head;
           //     for(int i=0; i<position-1; i++){
           //         temp = temp.next;
           //     }
           //     newNode.next = temp.next;
           //     temp.next = newNode;
           //     newNode.prev = temp;
           // }
           
            Node slow = head;
            Node fast = head;
         
           //........insert element in exact middle.. 
    // 	  while(fast.next != null && fast.next.next != null){
    // 	        slow = slow.next;
    // 	        fast = fast.next.next;
    // 	    }
    // 	        newNode.next = slow.next;
    // 	        slow.next = newNode;
    // 	        newNode.prev = slow; 
                 
    // 	         if(newNode.next != null){
    // 	             newNode.next.prev = newNode;
    // 	         }
            
             
             Node temp = head;
             while(temp != null){
                 System.out.print(temp.data + "->");
                 temp = temp.next;
             }
             System.out.println("null");
        }
    }


    // .......................DELETE ELEMENT AT STARTING................

    class Node{
        int data;
        Node next , prev;
        
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public class Main
    {
        public static void main(String[] args) {
             Node head = new Node(1);
             head.next = new Node(2);
             head.next.next = new Node(3);
             head.next.next.next = new Node(4);
             head.next.next.next.next = new Node(5);
             head.next.next.next.next.prev = head.next.next.next;
             
             Node newNode = new Node(35);
             
              if(head == null){
                  System.out.println("khalii");
                  return;
              }
              else {
                  head = head.next;
              }
              
              if(head != null){
                 head.prev = null;
              }
             
             Node temp = head;
             while(temp != null){
                 System.out.print(temp.data + "->");
                 temp = temp.next;
             }
             System.out.println("null");
        }
    }

    // ....................delete element at last........................
    class Node{
        int data;
        Node next, prev;
       
       Node(int data){
           this.data = data;
           this.next = null;
           this.prev = null;
       }
    }
    public class Main
    {
        public static void main(String[] args) {
           Node head = new Node(10);
           head.next = new Node(20);
           head.next.next = new Node(30);
           head.next.next.next = new Node(40);
           head.next.next.next.next = new Node(50);
           head.next.next.next.next.prev = head.next.next.next;
           
         if(head == null){
             System.out.println("null");
             return;
         }
         else {
             Node temp = head;
             while(temp.next != null){
               temp = temp.next;
                 
             }
              temp.prev.next = null;
              
         }
         
           
           Node temp = head;
           while(temp != null){
               System.out.print(temp.data + " <-> ");
               temp = temp.next;
           }
           System.out.println("null");
        }
    }

    // ...........................delete element accoding to postion in list....

    class Node{
        int data;
        Node next, prev;
       
       Node(int data){
           this.data = data;
           this.next = null;
           this.prev = null;
       }
    }
    public class Main
    {
        public static void main(String[] args) {
           Node head = new Node(10);
           head.next = new Node(20);
           head.next.next = new Node(30);
           head.next.next.next = new Node(40);
           head.next.next.next.next = new Node(50);
           
            int position = 4;
           
           
         if(head == null){
             System.out.println("null");
             return;
         }
         else {
             Node temp = head;
             for(int i=0; i<position-1; i++){
                 temp = temp.next;
             }
              temp.next = temp.next.next;
              
              if(temp.next != null){
                  temp.next.prev = temp;
              }
         }
        
         
           
           Node temp = head;
           while(temp != null){
               System.out.print(temp.data + " <-> ");
               temp = temp.next;
           }
           System.out.println("null");
        }
    }



    // ............................CIRCULOR LINKED-LIST.........................

// .......................PRINT ELEMENT IN CIRCULOR LINKED IN SINGLY..........

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
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
	   Node temp = head;
	   while(temp.next != null){
	       temp = temp.next;
	   }
	   temp.next = head;
	   
	   Node current = head;
	   while(current.next != null){
	       System.out.print(current.data + " -> ");
	       current = current.next;
	        if(current == head){
	       break;
	   }
	   }
	   System.out.println("back to head");
	  
	}
}


// .....................Detect cyclee.....................


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
	  Node head = new Node(10);
	  head.next = new Node(20);
	  head.next.next = new Node(30);
	  head.next.next.next = new Node(40);
	  head.next.next.next.next = head.next;
	  
	   
	    Node slow = head;
	     Node fast = head;
	     
	     boolean cycle = false;
	     
	     while(fast != null && fast.next != null){
	         slow = slow.next;
	         fast = fast.next.next;
	         if(slow == fast){
	             cycle = true;
	             break;
	         }
	     }
	     
	     if(cycle){
	         System.out.println("detect cycle " + slow.data);
	     }
	     else {
	         System.out.println(false);
	     }
	  
	  Node temp = head;
	  while(temp != null){
	      System.out.print(temp.data + " -> ");
	      temp = temp.next;
	  }
	  System.out.println("null");
	}
}

// ............160. Intersection of Two Linked Lists...............on leetcode...
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
        // Common intersection node
        Node common = new Node(8);
        common.next = new Node(10);

        // First Linked List: 3 → 6 → 9 → 8 → 10
        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = new Node(9);
        headA.next.next.next = common; // Intersection starts from node 8

        // Second Linked List: 4 → 7 → 8 → 10
        Node headB = new Node(4);
        headB.next = new Node(7);
        headB.next.next = common; // Intersection at node 8

        // Print Linked Lists
        printList(headA, "List A");
        printList(headB, "List B");
        
        
          Node temp1 = headA;
           Node temp2 = headB;
           
           int length1 = 0;
           while(temp1 != null){
               length1++;
               temp1 = temp1.next;
           }
       
         int length2 = 0;
           while(temp2 != null){
               length2++;
               temp2 = temp2.next;
           }
           
        System.out.println(temp1);
        System.out.println(temp2);
        
           Node temp3 = headA;
           Node temp4 = headB;
        
        if(length1 > length2){
            int distance = length1 - length2;
            for(int i=1; i<=distance; i++){
                temp3 = temp3.next;
            }
        }
        else {
            int distance = length2 - length1;
            for(int i=1; i<=distance; i++){
                temp4 = temp4.next;
            }
        }
        
         while(temp3 != null && temp4 != null){
             if(temp3 == temp4){
            System.out.println("Intersection Node: " + temp3.data);
                 return;
             }
             temp3 = temp3.next;
            temp4 = temp4.next;
         }
       System.out.println("No Intersection Found");
        
    }
    
        
    static void printList(Node head, String name) {
        System.out.print(name + ": ");
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }
}

public class Main
{
	public static void main(String[] args) {
	   // ................union of two list.................
	   
	    Node head1 = new Node(1);
	    head1.next = new Node(2);
	    head1.next.next = new Node(3);
	    head1.next.next.next = new Node(4);
	   // output :- 1-> 2-> 3-> 4-> 5-> 6 -> 7......
	    Node head2 = new Node(6);
	    head2.next = new Node(3);
	    head2.next.next = new Node(5);
	    head2.next.next.next = new Node(4);
	    head2.next.next.next.next = new Node(7);
	    
	    Node temp1 = head1;
	    Node temp2 = head2;
	     HashSet<Integer> hs = new HashSet<>();
	   
	   while(temp1 != null){
	       hs.add(temp1.data);
	       temp1 = temp1.next;
	   }
	   
	    while(temp2 != null){
	       hs.add(temp2.data);
	       temp2 = temp2.next;
	   }
	   
	   Node unionHead = null;
	   Node unionTail = null;
	   
	   for(int chacha: hs){
	       Node newNode = new Node(chacha);
	       if(unionHead == null){
	           unionHead = newNode;
	           unionTail = newNode;
	       }
	       else {
	           unionTail.next = newNode;
	           unionTail = unionTail.next;
	       }
	   }
	   
	  Node unionList = unionHead;
	  while(unionList != null){
	      System.out.print(unionList.data + " -> ");
	      unionList = unionList.next;
	  }
	  System.out.println("null");
	}
}



//............................817. Linked List Components....................

import java.util.HashSet;
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
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		int arr[] = {1 , 2 , 4 , 5};
		
		HashSet<Integer> hs = new HashSet<>();
		
	
		for(int chacha: arr){
		    hs.add(chacha);
		}
	     int count = 0;
	     while(head != null){
	         if(hs.contains(head.data) && head.next == null 
	         || !hs.contains(head.next.data)){
	             count++;
	         }
	         head = head.next;
	     }
		System.out.println("connected components = " + count);
	}
}


// ..............................linked-list frequency......................

import java.util.HashMap;
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
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(4);
		head.next.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next.next = new Node(4);
		
		
	 HashMap<Integer, Integer> map = new HashMap<>();
	  
	 Node current = head;
	 while(current != null){
	     int value = current.data;
	     
	        map.put(value, map.getOrDefault(value, 0)+1);
	         current = current.next;
	 }
	           
		for(int key : map.keySet()){
		    System.out.println(" Element = " + key + " Frequency = " + map.get(key));
		}
	}
}


// ......................................odd even linked-list...............................


import java.util.ArrayList;

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
        // Original linked list creation
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        
        Node oddHead = null; 
        Node oddTail = null;
        Node evenHead = null;
        Node evenTail = null;
        
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 != 0){
                if(oddHead == null){
                    oddHead = new Node(temp.data);
                    oddTail = oddHead;
                }
                else {
                    oddTail.next = new Node(temp.data);
                    oddTail = oddTail.next;
                }
            }
            else {
                if(evenHead == null){
                    evenHead = new Node(temp.data);
                    evenTail = evenHead;
                }
                else {
                    evenTail.next = new Node(temp.data);
                    evenTail = evenTail.next;
                }
            }
              temp = temp.next;
        }
         
                Node temp3 = evenHead;
             while(temp3 != null){
                 System.out.print(temp3.data + "->");
                 temp3 = temp3.next;
             }
                System.out.println("null");
           
        Node temp4 = oddHead;
             while(temp4 != null){
                 System.out.print(temp4.data + "->");
                 temp4 = temp4.next;
             }
                System.out.println("null");
    }
}


// ................................... plus one in linked-list...................................

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
		
		Node prev = null;
		Node current = head;
		while(current != null){
		      Node next = current.next;
		      current.next = prev;
		      prev = current;
		      current = next;
		}
		   head = prev;
		   
		   int carry = 1;
		    current = head;
		 while(current != null){
		     int sum = current.data + carry;
		     carry = sum / 10;
		    current.data = sum % 10;
		     if(carry == 0){
		        current = current.next;
	     	  }
		 }
		 if(carry > 0){
		     Node newNode = new Node(carry);
		         newNode.next = head;
		         head = newNode;
		     }
	  	  prev = null;
		  current = head;
		while(current != null){
		      Node next = current.next;
		      current.next = prev;
		      prev = current;
		      current = next;
		}
		   head = prev;
		 	
		    Node temp = head;
		    while(temp != null){
		        System.out.print(temp.data + " -> ");
		        temp = temp.next;
		    }
		     System.out.println("null");
}
}



     