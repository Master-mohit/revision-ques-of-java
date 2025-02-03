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