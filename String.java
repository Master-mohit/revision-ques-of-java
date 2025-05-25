//////////////////////////OPERATIONS WITH STRINGBUILDER...............
        // n*n+1/2:--- find subString...



        
// String s = "mohit";
// StringBuilder sb = new StringBuilder(s);
//   sb.append(" gupta");
//    System.out.println(sb);
   
//    sb.insert(3, "x");
//    System.out.println(sb);
   
//    sb.delete(3,4);
//    System.out.println(sb);
   
//    sb.replace(0,3, "chacha");
//    System.out.println(sb);
   
//    sb.setCharAt(0, 'm');
//    System.out.println(sb);
  
//    System.out.println(sb.length());
        
//   ................REVERSE STRING......................
        //  String str = "mohit";
	    // StringBuilder sb = new StringBuilder(str);
		// System.out.println(sb.reverse().toString().toUpperCase());

    // ..............2nd apporch to REVERSE STRING......................
    // 	String name = "mohit";
	  // String reverse = "";
	  // for(int i=name.length()-1; i>=0; i--){
	  //     reverse += name.charAt(i);
	  // }
	  // System.out.println(reverse);

  // ................3rd apporch to REVERSE STRING......................
   String name = "mohit";
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		System.out.println(sb);


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

  // ....................remove all vowel in string......................
  // String s = "mohit";
  // StringBuilder sb = new StringBuilder(s);
  // String consonent =  sb.toString().replaceAll("[aeiouAEIOU]", "");
  //  System.out.println(consonent);
  

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
    // HashMap<Character, Integer> hs = new HashMap<>();
    // int vowel = 0;
    // int consonent = 0;
    // String s = "swiss";
    // for(char ch : s.toCharArray()){
    //     hs.put(ch, hs.getOrDefault(ch, 0) + 1);
    // }
    // boolean isfound = false;
    // for(char key: hs.keySet()){
    //     if(hs.get(key) == 1){
    //         System.out.println(key);
    //         isfound = true;
    //         break;
    //     }
    // }
    // if(!isfound){
    //     System.out.println("no one ");
    // }
    
    // ...........Check if a String Contains Only Digits.........
//     List<String> list = new ArrayList<>();
//     String s = "12345";
//     boolean result = true;
//     for(int i=0; i<s.length(); i++){
//         if(!Character.isDigit(s.charAt(i))){
//             result = false;
//             break;
//         }
//     }
//  System.out.println(result);

//................................Compress a String.........................
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



//......................REMOVE OUTERMOST PARENTHIS..........................
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


//    // .......................isomorphic String....................
//    String s1 = "egg";
//    String s2 = "add";
   
//    int [] map1 = new int[256];
//    int [] map2 = new int[256];
   
//    if(s1.length() != s2.length()){
//           System.out.println("ni h bhai");
//           return;
//    }
//    boolean isisomorphic = true;
   
//    for(int i=0; i<s1.length(); i++){
//        char ch1 = s1.charAt(i);
//        char ch2 = s2.charAt(i);
       
//        if(map1[ch1] == 0 && map2[ch2] == 0){
//            map1[ch1] = ch2;
//            map2[ch2] = ch1;
         
//        }
//        else if(map1[ch1] != ch2 || map2[ch2] != ch1){
//         isisomorphic = false;
//          break;
//        }
       
       
//    }
//    if(isisomorphic){
//        System.out.println("hai bhai");
//    }
  
//   else {
//       System.out.println("ni hhhhhh");
//   }



 // ......................Rotate String......................
//  String s1 = "abcde";
//  String s2 = "cdeab";
 
//  if(s1.length() != s2.length()){
//       System.out.println("ni h");
//       return;
//  }
// String ans = s1 + s2;

// if(ans.contains(s2)){
//     System.out.println("hai");
// }
// else {
//    System.out.println("ni   hh");
// }



 // ....................Sort Characters By Frequency..............
//  String s1 = "abc";
        
//  int n = s1.length();
//  int ans = (n * (n+1))/2;
 
//  System.out.println(ans);


 // .....................SORT Character BY FREQUENCY..................
//  String str = "tree";
//  HashMap<Character, Integer> hs = new HashMap<>();
//  for(char chacha: str.toCharArray()){
//      hs.put(chacha, hs.getOrDefault(chacha, 0) + 1);
//  }
 
//  List<Character> list = new ArrayList<>(hs.keySet());
//  list.sort((a, b) -> hs.get(b) - hs.get(a));
 
//  StringBuilder result = new StringBuilder();
//  for(char ans: list){
//      int mama = hs.get(ans);
//      for(int i=0; i<mama; i++){
//             result.append(ans);
//      }
  
//  }
//  System.out.println(result.toString());


// //    ...........................Roman to Integer.........................
// int count = 0;
// for (int i = 0; i < s.length(); i++) {
//     char ch = s.charAt(i);

//     // Add the value of the current Roman numeral
//     if (ch == 'I') {
//         count += 1;
//     } else if (ch == 'V') {
//         count += 5;
//     } else if (ch == 'X') {
//         count += 10;
//     } else if (ch == 'L') {
//         count += 50;
//     } else if (ch == 'C') {
//         count += 100;
//     } else if (ch == 'D') {
//         count += 500;
//     } else if (ch == 'M') {
//         count += 1000;
//     }
//     if (i + 1 < s.length()) { 
//         char nextChar = s.charAt(i + 1);
//         if (ch == 'I' && (nextChar == 'V' || nextChar == 'X')) {
//             count -= 2; 
//         } else if (ch == 'X' && (nextChar == 'L' || nextChar == 'C')) {
//             count -= 20;
//         } else if (ch == 'C' && (nextChar == 'D' || nextChar == 'M')) {
//             count -= 200; 
//         }
//     }
// }
// return count;

  //.......................Longest Palindromic Substring..........   
//   String str = "cbbd";
//   if(str == null || str.length() == 0){
//  System.out.println(0);
//  return;
// }
//         String ans ="";
//  for(int i=0; i<str.length(); i++){
//      for(int j=i+1; j<str.length(); j++){ 
//       String temp = str.substring(i, j);     
//          int left =0;
//          int right = temp.length()-1;
//          while(left < right){
//              if(temp.charAt(left) != temp.charAt(right)){
//                   break; 
//              } 
//              left++;
//              right--;
//          }
//          if(left >= right && temp.length() > ans.length()){
//              ans = temp;
//          }
//      }
     
//  }
//  System.out.println(ans);

 //  ......................Sum of Beauty of All Substrings.............
            //   String str = "aabcbaa";
            //   int totl =0;
           
            //   for(int i=0; i<str.length(); i++){
            //       for(int j=i+1; j<=str.length(); j++){
            //        String temp = str.substring(i, j);
                   
            //         HashMap<Character, Integer> hs = new HashMap<>();
                    
            //        for(char chacha: temp.toCharArray()){
            //            hs.put(chacha, hs.getOrDefault(chacha, 0) + 1);
            //        }
            //           int maxfreq = Integer.MIN_VALUE;
            //           int minfreq = Integer.MAX_VALUE;
                      
            //            for(int val: hs.values()){
            //              maxfreq = Math.max(maxfreq, val);
            //              minfreq = Math.min(minfreq, val);
            //          }
                   
            //          totl += (maxfreq - minfreq);
                      
                      
                   
            //       }
            //   }
            //   System.out.println(totl);



      // .......................Reverse Words in a String......................
        //     String input = "Hello world this is a test";
        //     String[] words = input.split(" ");
        //     StringBuilder sb = new StringBuilder();
        //     for(int i = words.length-1; i>=0; i--){
        //         sb.append(words[i]);
        //         if(i != 0){
        //             sb.append(" ");
        //         }
        //     }
        // System.out.println(sb);

        // // ........Minimum Add to Make Parentheses Valid.................
        // String str = "())";
        // int open = 0;
        // int close = 0;
        // for(char ch: str.toCharArray()){
        //     if(ch == '('){
        //        open++;
        //     }
        //     else if(ch == ')'){
        //         if(open > 0){
        //             open--;
        //         }
        //         else {
        //             close++;
        //         }
        //     }
        // }
        // int result = open + close;
        // System.out.println(result);


        //  ........................Count and say....................................
    //     int n = 3;
    //     String result = "1";
    //     for(int j=0; j<n; j++){
    //            int count = 1;
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=1; i<result.length(); i++){
    //         if(result.charAt(i) == result.charAt(i-1)){
    //             count++;
    //         }
    //         else {
    //             sb.append(count).append(result.charAt(i-1));
    //             count = 1;
    //         }
    //     }
    //     sb.append(count).append(result.charAt(result.length()-1));
    //        result = sb.toString();
    //     }
    //     System.out.println(result);


    //// .....................Repeated String Match..................
    //     String s1 = "abc";
    //     String s2 = "cabca";
        
    //     int count = 0;
    //   StringBuilder sb = new StringBuilder();
    //   while(sb.length() < s2.length()){
    //       sb.append(s1);
    //       count++;
    //   }
    //   if(sb.toString().contains(s2)){
    //      System.out.println(count);
    //      return;
    //   }
    //   sb.append(s1);
    //   count++;
      
    //   if(sb.toString().contains(s2)){
    //      System.out.println(count);
    //      return;
    //   }
    //   else {
    //       System.out.println(-1);
    //   }


    // ........Longest Substring Without Repeating Characters.

  //   HashSet<Character> hs = new HashSet<>();
	//   String s = "abcabcabc";
	//   int maxLength = 0;
	//   int left = 0;
	
	//  for(int right=0; right<s.length(); right++){
	//      char akhshar = s.charAt(right);
	     
	//      while(hs.contains(akhshar)){
	//          hs.remove(s.charAt(left));
	//          left++;
	//      }
	     
	//      hs.add(akhshar);
	//     maxLength = Math.max(maxLength, right - left +1);
	//  }
	 
	//   System.out.println(maxLength);
      
  
  //  .................Group anagram................
  // HashMap<String, List<String>> map = new HashMap<>();
  // String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
  // for(String word : words){
  //     char[] ch =  word.toCharArray();
  //     Arrays.sort(ch);
  //     String newstring = new String(ch);
      
  //     if(!map.containsKey(newstring)){
  //         map.put(newstring, new ArrayList<>());
  //     }
  //     map.get(newstring).add(word);
  // }
  // System.out.println(map.values());
       
  // .................maximum nasted parenthsis................
  // String str = "(1)+((2))+(((3))";
	//    int maxcount = 0;
	//    int currentcount = 0;
	//    for(char ch : str.toCharArray()){
	//        if(ch  == '('){
	//            currentcount++;
	//            maxcount = Math.max(maxcount, currentcount);
	//        }
	//        else if(ch == ')'){
	//            currentcount--;
	//        }
	//    }
	//    System.out.println(maxcount);