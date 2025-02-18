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


// ................Basic Implement of stack using arrays............

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        int[] stack = new int[size];
        int top = -1;  // Initial stack is empty

        // Pushing elements
        stack[++top] = 10;
        stack[++top] = 20;
        stack[++top] = 30;

        // Peek operation
        System.out.println("Top element: " + stack[top]);  // Output: 30

        // Popping elements
        System.out.println("Popped: " + stack[top--]);     // Output: 30
        System.out.println("Popped: " + stack[top--]);     // Output: 20

        // Check if stack is empty
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}


// ..................advance version of implement stack using arrays for interview.....


    static int size = 5;
    static int[] stack = new int[size];
    static int top = -1;

    // Push Function
    static void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    // Pop Function
    static int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek Function
    static int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        System.out.println("Top element: " + peek()); // Output: 30

        System.out.println("Popped: " + pop());       // Output: 30
        System.out.println("Popped: " + pop());       // Output: 20

        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}



// ...............advance implement stack using LinkedList for interview

class Node{
    int data;
    Node next;
    
    Node(int data){
       this.data = data;
       this.next = null;
    }
}


    static void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed element : " + value);
    }
    
    static int pop(){
        if(top == null){
            System.out.println("stack underflow");
            return -1;
        }
        else {
            int popedValue = top.data;
            top = top.next;
            return popedValue;
        }
    }
    
    static int peek(){
        if(top == null){
            System.out.println("stack IsEmpty");
            return -1;
        }
        else {
          return top.data;
        }
    }
    
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        
        
        System.out.println("Poped 1st element : " + pop());
        System.out.println("Poped 2nd element : " + pop());
        
        System.out.println("Peeked element : " + peek());
        
        if(top == null){
            System.out.println("stacl IsEmpty");
        }
        else {
            System.out.println("stack IsNotEmpty");
        }
    }
}


// ................. Check if a string is balanced (Valid Parentheses).......

	public static void main(String[] args) {
	 Stack<Character> stack = new Stack<>();
          String s1 = "{([])}";
         for(int i=0; i<s1.length(); i++){
             char ch = s1.charAt(i);
             if(ch == '{' || ch == '(' || ch == '['){
                   stack.push(ch);
                   
             }
             else {
                 if(stack.isEmpty()){
                     System.out.println("false");
                     return;
                 }
                 
                 char top = stack.pop();
                 
                 
                 if ((ch == '}' && top != '{') ||
                 (ch == ')' && top != '(') ||
                 (ch == ']' && top != '[')){
                     System.out.println("false");
                     return;
                 }
                 
             }
         }
         
         if(stack.isEmpty()){
             System.out.println("true");
             
         }
         else {
             System.out.println("false");
             
         }
	}


    // ................... Reverse String using stack............

	public static void main(String[] args) {
	  Stack<Character> stack = new Stack<>();
	     
	    String s = "mohit";
	   for(int i=0; i<s.length(); i++){
	       char ch = s.charAt(i);
	       stack.push(ch);
	   }
	      StringBuilder sb = new StringBuilder();
	   while(!stack.isEmpty()){
	       sb.append(stack.pop());
	   }
	   System.out.println(sb);


// ................. Implement 2 stacks in one array..........................
       
              static int n = 5;
              static int arr[] = new int[n];
              static int top1 = -1;
              static int top2 = n;
               
        static void push1(int value){
            if(top1 + 1 < top2){
                arr[++top1] = value;
            }
            else {
                System.out.println("stack overflow");
            }
        }
        
        static void push2(int value){
            if(top1 + 1 < top2){
                arr[--top2] = value;
            }
            else {
                System.out.println("stack overflow");
            }
        }
        
        static int pop1(){
            if(top1 >= 0 ){
                return arr[top1--];
            }
            else {
                System.out.println("stack underflow");
                return -1;
            }
        }
        
        static int pop2(){
            if(top2 < n ){
                return arr[top2++];
            }
            else {
                System.out.println("stack underflow");
                return -1;
            }
        }
       
           public static void main(String[] args) {
              
               push1(10);
               push1(20);
               push2(30);
               push2(40);
               
             System.out.println("poped1 element : " + pop1());
             System.out.println("poped2 element : " + pop2());
                
           }
       }


    //   ........................ NEXT GREATER ELEMENT (NGE)....................

	public static void main(String[] args) {
	   Stack<Integer>stack = new Stack<>();
	   int arr[] = {4, 5, 2, 10, 8};
	   int n = arr.length;
	   int nge[] = new int[n];
	   
	   for(int i = n-1; i>=0; i--){
	       while(!stack.isEmpty() && stack.peek() <= arr[i]){
	           stack.pop();
	       }
	       nge[i] = stack.isEmpty() ? -1 : stack.peek();
	       
	       stack.push(arr[i]);
	       
	   }
	   
	   System.out.println(Arrays.toString(nge));
	   


// ..................NEXT SMALLER ELEMENT (NSE)...............

	public static void main(String[] args) {
	   Stack<Integer>stack = new Stack<>();
	   int arr[] = {4, 5, 2, 10, 8};
	   int n = arr.length;
	   int nge[] = new int[n];
	   
	   for(int i = n-1; i>=0; i--){
	       while(!stack.isEmpty() && stack.peek() >= arr[i]){
	           stack.pop();
	       }
	       nge[i] = stack.isEmpty() ? -1 : stack.peek();
	       
	       stack.push(arr[i]);
	       
	   }
	   
	   System.out.println(Arrays.toString(nge));
	   


    // ............... NEXT GREATEST EKEMENT 2 (NGE) CIRCULOR .........................
       
           public static void main(String[] args) {
               int arr[] = {5, 3, 8, -2, 7};
                 int n = arr.length;
                int nge[] = new int[n];
                 Stack<Integer> stack =  new Stack<>();
                 for(int i = 2 * n - 1; i>=0; i--){
                     while(!stack.isEmpty() && stack.peek() <= arr[i % n]){
                         stack.pop();
                     }
               
                     if(i < n){
                     nge[i] = stack.isEmpty() ? -1 : stack.peek();
                    
                 }
                  stack.push(arr[i % n]);
                 }
             System.out.println(Arrays.toString(nge));
      

    //.....................	Number of NGEs to the right (counting).........
    int arr[] = {4, 5, 2, 10, 8};
    int n = arr.length;
    int countArr[] = new int[n];
    Stack<Integer> stack =  new Stack<>();
    
    for(int i=n - 1; i >= 0; i--){
       int count = 0;
        
        for(int num : stack){
            if(num > arr[i]){
                count++;
            }
        }
        countArr[i] = count;
          stack.push(arr[i]);
    }
    
  System.out.println(Arrays.toString(countArr));


// .........................Min stack.........................
import java.util.Stack;

public class Main {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minstack = new Stack<>();
    
    
static void push(int val){
    stack.push(val);
    if(minstack.isEmpty() || val <= minstack.peek()){
        minstack.push(val);
    } 
}

static void pop(){
    if(!stack.isEmpty()){
        if(stack.pop().equals(minstack.peek())){
            minstack.pop();
        }
    }
}

static int peek(){
    return stack.isEmpty() ? -1 : stack.peek();
}

static int getmin(){
    return minstack.isEmpty() ? -1 : minstack.peek();
}
    public static void main(String[] args) {
      push(3);
      push(1);
      push(5);
      push(-2);
      
      System.out.println(getmin());
      pop();
      
      System.out.println(getmin());
      System.out.println(peek());
      
    }
}

// .......................Daily Temperatures...........................

int arr[] = {73, 74, 75, 45, 96, 76, 54};
int n = arr.length;
int result[] = new int[n];

for(int i=0; i<n; i++){
    for(int j= i + 1; j<n; j++){
        if(arr[j] > arr[i]){
            result[i] = j - i;
            break;
        }
    }
}
for(int ans : result){
    System.out.print(ans + " ");
}

// .........................Asteroid Collision...........................
Stack<Integer> stack = new Stack<>();
		int nums[] = {3, -4, 6};
		for(int arr : nums){
		   	while(!stack.isEmpty() && arr < 0 && stack.peek() > 0){
		   int top =  stack.pop();
		   
		   if(top == -arr){
		       arr = 0;
		       break;
		   }
		   
		   if(top > -arr){
		       arr = 0;
		       stack.push(top);
		       break;
		   }
		  
		} 
		 if(arr != 0){
		       stack.push(arr);
		   }
		}
		
		int result[] = new int[stack.size()];
		  for(int i=stack.size()-1; i>=0; i--){
		      result[i] = stack.pop();
		  }
		  System.out.println(Arrays.toString(result));


// ..............................infix to postfix........................

import java.util.*;
public class Main
{
    static int precedence(char op){
       if(op == '+' || op == '-'){
            return 1;
      }
      else if(op == '*' || op == '/'){
            return 2;
      }
      else {
           return 0;
      } 
    }
	public static void main(String[] args) {
	    String infix = "(A+B)*C-(D+E)*(F+G)";
	    Stack<Character> stack = new Stack<>();
	    StringBuilder result = new StringBuilder();
	    
	    for(int i=0; i<infix.length(); i++){
	        char c = infix.charAt(i);
	        
	        if(Character.isLetterOrDigit(c)){
	            result.append(c);
	        }
	        else if(c == '('){
	            stack.push(c);
	        }
	        else if(c == ')'){
	            if(!stack.isEmpty() && stack.peek() != '('){
	               result.append(stack.pop());
	            }
	            stack.pop();
	        }
	        
	        else {
	           while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
	               result.append(stack.pop());
	           }
	           stack.push(c);
	        }
	        
	        
	    }
	    while(!stack.isEmpty()){
	        result.append(stack.pop());
	    }
            System.out.println(result.toString());
	}
}


// ............................Prefix to infix................
Stack<String> stack = new Stack<>();
String prefix = "*+AB-CD";
for(int i = prefix.length() - 1; i>=0; i--){
 char c = prefix.charAt(i);
 
 if(Character.isLetterOrDigit(c)){
      stack.push(c + "");
 }
 else {
     String op1 = stack.pop();
     String op2 = stack.pop();
     String exp = "(" + op1 + c + op2 + ")";
     
     stack.push(exp);
 }
}
System.out.println(stack.pop());