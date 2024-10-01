import java.util.Arrays;
import java.util.HashMap;

public class String {
    public static void main(String[] args) {
        
//   ................REVERSE STRING......................
        //  String str = "mohit";
	    // StringBuilder sb = new StringBuilder(str);
		// System.out.println(sb.reverse().toString().toUpperCase());



    //  ....................PALLINDROME STRING......................
    //     String str = "lol";
	//     StringBuilder sb = new StringBuilder(str);
	//     sb.reverse();
	   
	// 	if(sb.toString().equals(str)){
	// 	    System.out.println("palimdrome");
	// 	}
	// 	else {
	// 	    System.out.println("not");
	// 	}


//     ....................ANAGRAM STRING......................
//     String s1 = "silent";
// 	String s2 = "listen";
// 	char[] arr1 = s1.toCharArray();
// 	char[] arr2 = s2.toCharArray();
	
//     Arrays.sort(arr1);
// 	Arrays.sort(arr2);
	
//    if(Arrays.equals(arr1, arr2)){
//        System.out.println("anagram");
//    }
//    else {
//        System.out.println("not");
//    }


//..................find more then once char..............
    //  String str = "Mohito";
    //  HashMap<Character, Integer> hs = new HashMap<>();
     
    //  for(char chacha: str.toCharArray()){
    //      hs.put(chacha, hs.getOrDefault(chacha, 0)+1);
    //  }
    
    // for(char key: hs.keySet()){
    //     if(hs.get(key) > 1){
    //         System.out.println(key + "  " + hs.get(key));
    //     }
    // }
   

    //....................find non repeated char...........
    // String str = "Mohhtot";
    // HashMap<Character, Integer> hs = new HashMap<>();
    
    // for(char chacha: str.toCharArray()){
    //     hs.put(chacha, hs.getOrDefault(chacha, 0)+1);
    // }
 
    //  for(char key: hs.keySet()){
    //      if(hs.get(key) == 1){
    //          System.out.println(key+ " ");
    //      }
    //  }
  

    //................................count each char..........................
    // String str = "apple";
    // HashMap<Character, Integer> hs = new HashMap<>();
    // for(char chacha: str.toCharArray()){
    //     hs.put(chacha, hs.getOrDefault(chacha, 0)+1);
    // }
    // for(char key: hs.keySet()){
    //     System.out.print(key + ": " + hs.get(key)+ " ");
    // }


    //........................ First Non-Repeating Character..................
//     String str = "aabbcc";
//     HashMap<Character, Integer> hs = new HashMap<>();
//  for(char chacha: str.toCharArray()){
//      hs.put(chacha, hs.getOrDefault(chacha, 0)+1);
//  }
//  for(char key: str.toCharArray()){
//      if(hs.get(key) == 1){
//          System.out.println(key);
//          return;
//      }
//  }
//  System.out.println(-1);


//.................................Compress a String.........................
// HashMap<Character, Integer> hs = new HashMap<>();
// String str = "aaabbccdee";

// for(char chacha: str.toCharArray()){
//    hs.put(chacha, hs.getOrDefault(chacha, 0)+1);
// }

// for(char key: hs.keySet()){
//    System.out.print(key + "" + hs.get(key));
// }

//..........................Unique Characters return true........................
// HashMap<Character, Integer> hs = new HashMap<>();
// String str = "abcde";
// boolean isunique = true;

// for(char chacha: str.toCharArray()){
//   hs.put(chacha, hs.getOrDefault(chacha, 0)+1);
// }
// for(char key: hs.keySet()){
//   if(hs.get(key) > 1){
//      isunique = false;
//      break;
//   }
  
// }
// if(isunique){
// System.out.println(true);
// }
// else {
// System.out.println(false);
// }


//.............. Find All Substrings of a String....................
// HashMap<Character, Integer> hs = new HashMap<>();
// String str = "abc";
// for(int i=0; i<str.length(); i++){
//     for(int j=i+1; j<= str.length(); j++){
//         System.out.println(str.substring(i, j));
//     }
// }

//........................ rotations of a String............................
// HashMap<Character, Integer> hs = new HashMap<>();
// String s1 = "abcd";
// String mama = s1.substring(2) + s1.substring(0,2);    
// System.out.println(mama);


//.......................Logest commom prefix ..........................
    
// String[] str = {"flower", "flow", "flight"};
         
// if(str == null){
//     System.out.println("");
//     return;
// }
//   Arrays.sort(str);
//   int index = 0;
//  String s1 = str[0];
//  String s2 = str[str.length-1];
  
//   while(index < s1.length()){
//       if(s1.charAt(index) == s2.charAt(index)){
//           index++;
//       }
//       else {
//           break;
//       }
//   }
//    System.out.println(s1.substring(0, index));



// Output: Vowels: 3, Consonants: 7
//....................Count Vowels and Consonants ......................
// HashMap<Character, Integer> hs = new HashMap<>();
// String str = "hello world";

// for(char chacha: str.toCharArray()){
//     if(chacha == ' '){
//         continue;
//     }
//     hs.put(chacha, hs.getOrDefault(chacha, 0)+1);
// }
// int vowel = 0;
// int consonent = 0;
// for(char key: hs.keySet()){
//    if("AEIOUaeiou".indexOf(key) != -1){
//        vowel = vowel + hs.get(key);
//    }
//    else{
//       consonent = consonent + hs.get(key);
//    }
// }
// System.out.println("vowel" + " " + vowel+ " " + "and consonent" + " " + consonent);



//..............................REMOVE OUTERMOST PARENTHIS..........................
// String str = "(()())(())";
// int count = 0;
// StringBuilder sb = new StringBuilder();

// for(char chacha: str.toCharArray()){

//  if(chacha == '('){
//      if(count > 0){
//         sb.append(chacha);
//      }
//      count++;
//  }
//  else if(chacha == ')'){
//        count--;
//      if(count > 0){
//         sb.append(chacha);
//      }
   
//  }
// }

 // .........................Largest Odd Number in String.....................
//  String str = "35427";
//  int update = -1;
// for(int i=0; i<str.length(); i++){
// char ch = str.charAt(i);
// if((ch - '0') % 2 != 0){
// update = i;
// }

// }
// if(update != -1){
// System.out.println(str.substring(0, update + 1));
// }
// else {
// System.out.println(" ");
// }




  // ............isomorphic String..................
  String s1 = "egg";
  String s2 = "add";
  

  boolean result = isIsomorphic(s1, s2);
  System.out.println(result);  
}

public static boolean isIsomorphic(String s1, String s2) {
  if (s1.length() != s2.length()) {
      return false;
  }
  int[] map1 = new int[256]; 
  int[] map2 = new int[256];
  
  for (int i = 0; i < s1.length(); i++) {
      char ch1 = s1.charAt(i);
      char ch2 = s2.charAt(i);
      
      if (map1[ch1] == 0 && map2[ch2] == 0) {
          map1[ch1] = ch2;
          map2[ch2] = ch1;
      } 
    
      else if (map1[ch1] != ch2 || map2[ch2] != ch1) {
          return false;
      }
  }
  
  return true;
    }
}
