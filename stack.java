import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 
//     decalertion of Stack...
		Stack<Integer> st = new Stack<>();
		
// 		LIFO :- last in frist out...
//  or  FILO :- first in last out... 

//   push :- Add the element of Stack...
		st.push(50); 
		st.push(30);
		st.push(20);
		st.push(15);
		st.push(25);
		
//   Pop :- Remove the element from first...
       st.pop(); //  remove 25 element of stack...
       st.pop(); //  again remove 15 element of Stack
       
//   Peek :- return the element on the Frist like Top..
       System.out.println(st.peek());
       
//   print full stack       
 		System.out.println(st); 

//   Size of Stack....
       System.out.println(st.size());
	}
}

//  ............. Take the Input in Stack............................

// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();

   System.out.println("choose the no.of element");
   int n = sc.nextInt();
   System.out.println("enter element");
    
   for(int i=1; i<=n; i++){
        int x = sc.nextInt();
          st.push(x);
   }
   System.out.println(st);
     
// 	}
// }

//  ..................Move element from one stack to other stack..........

// import java.util.*;
// public class Main
// {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
       
        st.push(9);
        st.push(4);
        st.push(8);
        st.push(4);
        st.push(1);
        
     System.out.println(st);
//  make a new stack to copy emelent from st.
    Stack<Integer> rt = new Stack<>();
    
//   copy element to new stack and remove
    //  the element in old stack 
    // but this reverse order
      while(st.size() > 0){
        rt.push(st.pop());
//   Pop :- jayega utha kr first element layega
//         push krega or remove bhi kr dega sath me...
      }
      
      System.out.println(st);
      System.out.println(rt);
      
      Stack<Integer> ct = new Stack<>();
      while(rt.size() > 0){
          ct.push(rt.pop());
      }
      System.out.println(ct);
// 	}
// }


// ....................INSERTION ELEMENT ACCROING TO INDEX................
// import java.util.*;
// public class Main
// {
	public static void main(String[] args) {
	   Stack<Integer> st = new Stack<>();
	   
	   st.push(1);
	   st.push(2);
	   st.push(3);
	   st.push(4);
	   st.push(5);
	   
	   int index = 3;
	   int n = 100;
	  Stack<Integer> temp  = new Stack<>();
	  while(st.size() > index){
	      temp.push(st.pop());
	  }
	    st.push(n);
	    
	    while(temp.size() > 0){
	        st.push(temp.pop());
	    }
	 System.out.println(st);
	}
// }

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Stack<Integer> st = new Stack<>();
	   
	   st.push(1);
	   st.push(2);
	   st.push(3);
	   st.push(4);
	   st.push(5);
	   
	 int n = st.size();
	 int arr[] = new int[n];
	 for(int i=n-1; i>=0; i--){
	    int x = st.pop();
	    arr[i] = x;
	    
	 }
	 System.out.println(Arrays.toString(arr));
	}
}


// .......................Implement of stack using arrays............

public class Main {
       public static void main(String[] args) {
           int arr[] = new int[5]; // Array to store stack elements
           int top = -1;           // Stack is initially empty
   
           // Push operations
           arr[++top] = 10; // Push 10
           arr[++top] = 20; // Push 20
           arr[++top] = 30; // Push 30
   
           // Display Stack
           System.out.print("Stack: ");
           for (int i = 0; i <= top; i++) {
               System.out.print(arr[i] + " ");
           }
           System.out.println();
   
           // Pop operation
           System.out.println("Popped: " + arr[top--]); // Removes 30
   
           // Peek operation
           System.out.println("Top element: " + arr[top]); // Shows 20
   
           // Updated Stack
           System.out.print("Updated Stack: ");
           for (int i = 0; i <= top; i++) {
               System.out.print(arr[i] + " ");
           }
       }
   }
   