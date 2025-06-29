import java.util.ArrayList;

public class Arrays {
    //........................ Array Question...........//////////////////

//  sum of all the items of the arrayion.....
// int sum = 0;
// int arr[] = {1,2,3,4,5,6};
// for(int i=0; i<arr.length; i++){
//     sum = sum + arr[i];  
// }
// System.out.println(sum);


   //  print Odd and Even Numbers from an Array.....
//      int arr[] = {1,2,3,4,5,6};
//      System.out.println("ODD NUMBER");
//      for(int i=0; i<arr.length; i++){
//        if(arr[i] % 2 != 0){
//          System.out.println(arr[i]);
//        }
//      }
//      System.out.println();
     
//      System.out.println("EVEN NUMBER");
//      for(int i=0; i<arr.length; i++){
//        if(arr[i] % 2 == 0){
//          System.out.println(arr[i]);
//        }
//      }
//  }




	//  print single line Odd and Even Numbers from an Array.....
		// Scanner sc = new Scanner(System.in);
		// System.out.println("chooose any number");
		// int n = sc.nextInt();
		// for(int i=0; i<=n; i++) if(i % 2 == 0)
		// System.out.println(i + " ");
		// for(int i=0; i<=n; i++) if(i % 2 != 0)
		// System.out.println(i + " ");


     //........................ REVERSE ELEMENT OF ARRAY...........//////////////////
    //  int start = 0;
    //  int end = arr.length-1;
    //  while(start < end ){
    //    int temp = arr[start];
    //    arr[start] = arr[end];
    //    arr[end] = temp;
    //     start++;
    //      end--;
    //      System.out.println(Arrays.toString(arr));

    
    //........................ SORTED ELEMENT OF ARRAY...........//////////////////
    //  for(int i=0; i<arr.length; i++){
    //     for(int j=i+1; j<arr.length; j++){
    //       if(arr[i] > arr[j]){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //       }
    //     }
    //   }
    //   System.out.println(Arrays.toString(arr));

   //........ MAXIMUM ELEMENT OF ARRAY....
//    int arr[] = {43,80,76,34,7,2};
//    int largest = arr[0];
//    for(int i=1; i<arr.length; i++){
//      if(arr[i] > largest){
//        largest = arr[i];
//      }
//    }
//    System.out.println(largest);

  // .. SECOND MAXIMUM ELEMENT OF ARRAY.....
      // Assending order means chote se bda..
    //   int arr[] = {43,65,34,87,44,84};
    //    for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[j] < arr[i]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(arr[arr.length-2]);


          // .. SECOND MAXIMUM ELEMENT OF ARRAY.....
      // desending order means bde se chota ..
    //   int arr[] = {43,65,34,87,44,84};
    //   for (int i = 0; i < arr.length; i++) {
    //        for (int j = i + 1; j < arr.length; j++) {
    //            if (arr[j] > arr[i]) {
    //                int temp = arr[i];
    //                arr[i] = arr[j];
    //                arr[j] = temp;
    //            }
    //        }
    //    }
    //    System.out.println(arr[1]);

     // ........... MINIMUM ELEMENT OF ARRAY........
    //  int arr[] = {43,65,34,87,44,84,10,13};
    //  int min = arr[0];
    //  for(int i=0; i<arr.length; i++){
    //    if(arr[i] < min){
    //      min = arr[i];
    //    }
    //  }
    //  System.out.println(min);

    // .................................SECOND LARGEST..........................
    // int[] arr = {5, 2, 9, 1, 5, 12, 6};
    // int largest = arr[0];
    // int secondlargest = arr[0];
    // for(int i=1; i<arr.length; i++){
    //     if(arr[i] > largest){
    //         secondlargest = largest;
    //         largest = arr[i];
    //     }
    // }
    // System.out.println("largest : " + largest);
    // System.out.println("secondlargest : " + secondlargest);

  // .................................SECOND LARGEST..........................?

  // int [] arr = {1,2,3,32,4,5,54};
  // int largest = arr[0];
  // int Sndlargest = arr[0];
  
  // for(int i=0; i<arr.length; i++){
  //     if(arr[i] > largest){
  //         Sndlargest = largest;
  //         largest = arr[i];
  //     }
  //     else if(arr[i] > Sndlargest && arr[i] != largest){
  //         Sndlargest = arr[i];
  //     }
  // }
  // System.out.println(Sndlargest);


    // ........... second MINIMUM ELEMENT OF ARRAY........
    // int [] arr = {2,3,32,4,5,54};
    // int mini = Integer.MAX_VALUE;  
    //  int sndmini = Integer.MAX_VALUE;
     // sbse bda value kuki jitne value
    //aaye usse chote aaye
      // agr smaller niklna h to max lelo or max
       // to min lelo
     
//      for(int i=0; i<arr.length; i++){
//      if(arr[i] < mini){
//          sndmini = mini;
//          mini = arr[i];
//      }
//      else if(arr[i] < sndmini && arr[i] != mini){
//          sndmini = arr[i];
//      }
//  }
//  System.out.println(sndmini);
//  System.out.println(mini);
 
        // .................RIGHT ROTATION ELEMENT OF ARRAY......
        // int arr[] = {43,65,34,87,44};
        // int lastelement = arr[arr.length-1];
        // for(int i=arr.length-1; i>0; i--){
        //   arr[i] = arr[i-1];
        // }
        // arr[0] = lastelement;
        // System.out.println(Arrays.toString(arr));


        // Input size of array
        // System.out.println("Kitne element honge:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        
        // Input elements of the array
        // System.out.println("Array ke elements input karein:");
        // for(int j = 0; j < n; j++) {
        //     arr[j] = sc.nextInt();
    }
        
    // Right rotation of the array
    // int lastelement = arr[n - 1];
    // for(int i = n - 1; i > 0; i--) {
    //     arr[i] = arr[i - 1];
    // }
    // arr[0] = lastelement;
    
    // Print the rotated array
    // System.out.println("Rotated array:");
    // for(int i = 0; i < n; i++) {
    //     System.out.print(arr[i] + " ");

         
    // .............LEFT ROTATION OF ELEMENT.........
//   int arr[] = {2,4,3,5,10,1};
//   for(int i=0; i<arr.length; i++){
//     System.out.println(Arrays.toString(arr));
//   }
//   int first = arr[0];
//   for(int i=1; i<arr.length; i++){
//     arr[i-1] = arr[i];
//   }
//    arr[arr.length-1] = first;
//    System.out.println(Arrays.toString(arr));
    // }

   // ...................MISSING OF ELEMENT.........
//    int arr[] = {3,2,5};
//    HashSet<Integer> set = new HashSet<>();
//    int max = 0;
//    for(int chacha :arr){
//      set.add(chacha);
//      if(chacha > max){
//        max = chacha;
//      }
//    }
//    for(int i=0; i<=max; i++){
//      if(!set.contains(i)){
//        System.out.println(i);
//      }
//    }

//     int arr[] =  {1,2,2,3,4,4,5,6,7,7,7,8};
//     // ............REMOVE DUPLICATE ELEMENT FROM SORTED ARRAYS...........
//     int temp[] = new int [arr.length];
//     int j = 0;
//     for(int i=0; i<arr.length-1; i++){
//       if(arr[i] != arr[i+1]){
//         temp[j] = arr[i];
//         j++;
//       }
//     }
//     temp[j] = arr[arr.length-1];
//     j++;
//   for(int i=0; i<j; i++){
//     System.out.println(temp[i]);
//   }

// ............REMOVE DUPLICATE ELEMENT FROM SORTED ARRAYS WITHOUT TEMP..........
  //  HashSet<Integer> set = new HashSet<>();
	//    int arr[] = {4,2,6};
	//      for(int num : arr){
	//          set.add(num);
	//      }
	//      for(int ans: set){
	//          System.out.print(ans + " ");
	//      }


// ............REMOVE DUPLICATE ELEMENT FROM SORTED ARRAYS WITHOUT TEMP...........
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         HashSet<Integer> hs = new HashSet<>();
//          int arr[] =  {1,2,2,3,4,4,5,6,7,7,7,8};
//          for(int chacha : arr){
//              hs.add(chacha);
//          }
//          System.out.println(hs);
//     }
// }

// ............REMOVE DUPLICATE ELEMENT FROM SORTED ARRAYS WITHOUT TEMP...........
//  int arr[] =  {1,2,2,3,4,4,5,6,7,7,7,8};
//  int j = 0;
// for(int i=0; i<arr.length-1; i++){
//   if(arr[i] != arr[i+1]){
//     arr[j] = arr[i];
//     j++;
//   }
// }
// arr[j] = arr[arr.length-1];
// j++;
// for(int i=0; i<j; i++){
//  System.out.println(arr[i]);
// }


// ...............REMOVE DUPLICATE ELEMENT FROM UNSORTED ARRAYS...........
//   int arr[] = {2,4,4,3,5,5,2,1};
//   HashSet<Integer> set = new HashSet<>();

//   for(int num: arr){
//     set.add(num);
//   }
//   for(int element : set){
//     System.out.println(element);
//   }

// .................REMOVE DUPLICATE ELEMENT FROM SORTED ARRAYS...........
//  int arr[] = {1,2,2,3,4,4,5,8,8,8};
//  HashSet<Integer> set = new HashSet<>();

//  for(int num: arr){
//    set.add(num);
//  }
//  for(int element : set){
//    System.out.println(element);
//  }

// ............ DUPLICATE ELEMENT FROM SORTED ARRAYS...........
//  int arr[] =  {1,2,2,3,6,7,4,4,5,6,7,7,7,8,18};
//  int temp[] = new int [arr.length];
//   int j = 0;
// for(int i=0; i<arr.length-1; i++){
//   if(arr[i] == arr[i+1]){
//    // temp[j] = arr[i];
//    if(j == 0 || temp[j-1] != arr[i]){
//      temp[j] = arr[i];

//     j++;
//   }
//   }
//   }
// for(int i =0; i<j; i++){
//   System.out.println(temp[i]);
// }

// ............ DUPLICATE ELEMENT FROM SORTED ARRAYS...........
// 	public static void main(String[] args) {
// 	    HashSet<Integer> hs = new HashSet<>();
// 	     HashSet<Integer> dupli = new HashSet<>();
// 	    int sum = 0;
// 		int arr[] =  {1,2,2,3,6,7,4,4,5,6,7,7,7,18,8,18};
// 		for(int num: arr){
// 		    if(!hs.add(num)){
// 		       dupli.add(num);
// 		    }
// 		}
		
// 	   System.out.println(dupli); 
// 	}
// }

// ..........Program to copy all elements of one array into another array............
// int arr1 [] = {4,2,6};
// int arr2 [] = Arrays.copyOf(arr1, arr1.length);

// arr1= kon se array se copy krna, arr1.length kitna copy krna pure element
// System.out.println(Arrays.toString(arr2));


// ..........Program to copy all elements of one array into another array.............

//  int arr1 [] = {1,2,6,4,5};
//  int arr2[]  = new int[arr1.length];
//  for(int i=0; i<arr1.length; i++){
//    arr2[i] = arr1[i];
//  }
//  for(int i=0; i<arr1.length; i++){
//    System.out.println(arr1[i]);
//  }
//  System.out.println();

//  for(int i=0; i<arr2.length; i++){
//    System.out.println(arr2[i]);
//  }

 // .............Program to find the frequency of each element in the array..........
//  int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6,4};
//  HashMap<Integer, Integer> fm = new HashMap<>();

//  for (int num : arr) {
//      fm.put(num, fm.getOrDefault(num, 0) + 1);
//  }

//  for (Integer key : fm.keySet()) {
//      System.out.println("Element: " + key + ", Frequency: " + fm.get(key));
//  }

 // .......Program to print the elements of an array present on even position...
//  int arr[] = {1,2,3,4,5,6};
//  for(int i=0; i<arr.length; i=i+2){
//    System.out.println(arr[i]);
//  }

  // .......Program to print the elements of an array present on odd position...
//  int arr[] = {1,2,3,4,5,6};
//  for(int i=1; i<arr.length; i=i+2){
//    System.out.println(arr[i]);
//  }

  // ..............Write a Java program to separate zeros from non-zeros............... 
// in an integer array?
// [12, 7, 8, 3, 0, 0, 0]
// int arr[] = {12, 0, 7, 0, 8, 0, 3};
// int index = 0;
// for(int i=0; i<arr.length; i++){
//   if(arr[i] != 0){
//     arr[index] = arr[i];
//     index++;
//   }
// }
// while(index < arr.length){
//   arr[index] = 0;
//   index++;
// }
// System.out.println(Arrays.toString(arr));
 // Write a Java program to separate zeros from non-zeros 
// in an integer array?
// [12, 7, 8, 3, 0, 0, 0]
//     int arr[] = {12, 0, 7, 0, 8, 0, 3};
//         int temp[] = new int [arr.length];
//     int index = 0;

//      for(int i=0; i<arr.length; i++){
//       if(arr[i] == 0){
//         temp[index] = arr[i];
//         index++;
//       }
//     }
//   for(int i=0; i<arr.length; i++){
//     if(arr[i] != 0){
//       temp[index] = arr[i];
//       index++;
//     }
//   }

//     System.out.println(Arrays.toString(temp));

//.............Write a Java program to find the intersection................... 
// of two arrays?
//     int[] arr1 = {1, 2, 3, 4, 5}; //set
//     int[] arr2 = {3, 4, 5, 6, 7};  //element

//  HashSet<Integer> set = new HashSet<>();

//    for(int num : arr1){
//      set.add(num);
//    }

//    List<Integer> inersection = new ArrayList<>();
//    for(int element: arr2){
//      if(set.contains(element)){
//        inersection.add(element);
//      }
//    }
//   System.out.println(inersection);


// ........Write a Java program to find all pairs of........... 
//....................... elements in an integer.......................
//................... array whose sum is equal to a given number?............

//   int[] arr= {2, 4, 3, 1, 5, 6, 8};
//   int target = 7;

// for(int i=0; i<arr.length; i++){
//   for(int j = i+1; j<arr.length; j++){
//     if(arr[i] + arr[j] == target){
//       System.out.println(arr[i] + " , " + arr[j] + " " );
//     }
//   }
// }

// ............Write a Java program to check the equality of two arrays?..............

//  int[] arr1 = {2, 5, 1, 7, 4};
//  int[] arr2 = {2, 5, 1, 7, 4};

//  if(arr1.length != arr2.length){
//    System.out.println("eual ni h");
//  }

//  boolean yesOrnot = true;
//  for(int i=0; i<arr1.length; i++){
//    if(arr1[i] != arr2[i]){
//      yesOrnot = false;
//      break;
//    }
//  }
//  if(yesOrnot){
//    System.out.println("euqal h");
//  }
//  else {
//    System.out.println("ni h");
//  }

// ..............Find the occurrence of an integer in the array...................
// int[] arr = {1, 2, 3, 4, 2, 4, 2, 5,4};
// int count = 0;
// System.out.println("take an any number");
//   int n = sc.nextInt();
//   for(int i=0; i<arr.length; i++){
//       if(arr[i] == n){
//             count++;
//       }
//   }
//   System.out.println(count);


// ..............Find the Longest Consecutive Sequence in the array............
// int[] arr = {100, 200, 1, 3, 2};
// int currentOne = 1;
// int longest = 1;
// Arrays.sort(arr);
// for(int i=1; i<arr.length; i++){
//     if(arr[i] == arr[i-1] +1){
//         currentOne++;
//     }
//     else if(arr[i] != arr[i-1]){
//         currentOne = 1;
//     }
//     longest = Math.max(longest, currentOne);
// }
// System.out.println(longest);

// ..............Find the Majority element of an integer in the array...................
	  //  HashMap<Integer, Integer> hs = new HashMap<>();
	  //  int arr[] = {2, 2, 1, 1, 1, 2, 2};
    //      int maxRepElem = arr.length/2;
    //      for(int num : arr){
    //          hs.put(num, hs.getOrDefault(num, 0) + 1);
            
    //      }
    //      for(int totl : hs.keySet()){
    //          if(hs.get(totl) > maxRepElem){
    //              System.out.println(totl);
    //              return;
    //          }
    //      }
    //      System.out.println("no majority element");
     
  //   missing number find................................
	//  HashSet<Integer>hs = new HashSet<>();
	//     int arr[] = {1,2,4};
	//     int n = arr.length;
	//     for(int num: arr){
	//         hs.add(num);
	//     }
	    
	//     for(int i=1; i<n+1; i++){
	//         if(!hs.contains(i)){
	//             System.out.println(i);
	//         }
	//     }

  ....................// Merge two arrays into one array...................
    // int arr1[] = {1, 2, 3};
    // int arr2[] = {4, 5, 6};
    // int arr3[] = new int[arr1.length + arr2.length];
    // for(int i=0; i<arr3.length; i++){
    //     if(i < arr1.length){
    //         arr3[i] = arr1[i];
    //     }
    //     else {
    //         arr3[i] = arr2[i-arr1.length];
    //     }
    // }

    // Find the maximum product of two distinct elements in an array...................

    	  //  int[] arr = {1, 20, 3, 4, 5};
        //    int max = Integer.MIN_VALUE;
        //    int smax = Integer.MIN_VALUE;
           
        //    for(int i =0; i<arr.length; i++){
        //        if(arr[i] > max){
        //            smax = max;
        //            max = arr[i];
        //        }
        //        else if(arr[i] > smax && arr[i] != max){
        //            smax = arr[i];
        //        }
        //    }
        //    System.out.println(max * smax);
    
    // for(int num : arr3){
    //     System.out.print(num + " ");
    // }

       // Merge two arrays into one array...................
  //  int arr1[] = {1, 2, 3};
  //      int arr2[] = {4, 5, 6};
  //      int arr3[] = new int[arr1.length + arr2.length];
  //      for(int i=0; i<arr3.length; i++){
  //          if(i < arr1.length){
  //              arr3[i] = arr1[i];
  //          }
  //          else {
  //              arr3[i] = arr2[i-arr1.length];
  //          }
  //          }
           
  //          for(int num : arr3){
  //              System.out.print(num + " ");
  //          }

    // ..............Find the duplicate element of an integer in the array...................	
    // HashMap<Integer, Integer> hs = new HashMap<>();
    // int arr[] = {2, 2, 1,1, 2, 2,3,5,3};
       
    //     for(int num : arr){
    //         hs.put(num, hs.getOrDefault(num, 0) + 1);
    //     }
    //     boolean findDupplicate = false;
    //     for(int key: hs.keySet()){
    //         if( hs.get(key) > 1){
    //             System.out.println(key);
    //             findDupplicate = true;
    //         }
    //     }
    //     if(!findDupplicate){
    //         System.out.println("koi ni h duplicate");
    //     }

    // ......................Program to put all negative numbers before positive numbers..........
       //  int arr[] = {1, -3, 4, -2} ;
       //  int pos[] = new int[arr.length];
       //  int neg[] = new int[arr.length];
       //  int j = 0;
       //  for(int i=0; i<arr.length; i++){
       //      if(arr[i] < 0){
       //          neg[j] = arr[i];
       //          j++;
       //      }
       //      else {
       //          pos[i-j] = arr[i];
       //      }
       //  }
       //  System.out.println(Arrays.toString(neg));
       //  System.out.println(Arrays.toString(pos));

    //    ...........seperate postive and negative element in arraus
    //  ArrayList<Integer>Neglist = new ArrayList<>();
	  //    ArrayList<Integer>poslist = new ArrayList<>();
    //        int arr[] = {1, -3, 4, -2} ;
    //        int pos[] = new int[arr.length];
    //        int neg[] = new int[arr.length];
    //        for(int i=0; i<arr.length; i++){
    //            if(arr[i] < 0){
    //                Neglist.add(arr[i]);
                   
    //            }
    //            else {
    //               poslist.add(arr[i]);
                  
    //            }
    //        }
    //        System.out.println(Neglist);
    //        System.out.println(poslist);

// .......................program to put all negative..................
// .......................numbers before positive numbers..........
    // ArrayList<Integer> list = new ArrayList<>();
    //  int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
    //  int j = 0;
       
    //    for(int i=0; i<arr.length; i++){
    //        if(arr[i] < 0){
    //            int temp = arr[i];
    //            arr[i] = arr[j];
    //            arr[j] = temp;
    //            j++;
    //        }
    //    }
    //   for(int i=0; i<arr.length; i++){
    //       list.add(arr[i]);
    //   }  
    //   System.out.println(list);

    // or

    // ArrayList<Integer>poslist = new ArrayList<>();
	  //    ArrayList<Integer>finallist = new ArrayList<>();
    //        int arr[] = {1, -3, 4, -2} ;
    //         int index = 0;
    //     //   int neg[] = new int[arr.length];
    //        for(int i=0; i<arr.length; i++){
    //            if(arr[i] < 0){
    //                finallist.add(arr[i]);
                   
    //            }
    //          else if (arr[i] > 0){
    //              poslist.add(arr[i]);
    //          }
                  
                  
    //        }
    //   finallist.addAll(poslist);
    //   System.out.println(finallist);

// ..............................ALL SUBARRAYS QUESTIONS..................
    // ............find All the subarrays of an array............
      //    int[] arr = {2, 3, 2, 4}; 
       
      //  for(int i=0; i<arr.length; i++){
      //     for(int j =i; j<arr.length; j++){
      //     for(int k =i; k<= j; k++){
      //         System.out.print(arr[k] + " ");
      //     }
      //     System.out.println();
      //     }
      //  }

      // ....................Subarray with given sum = 0...................
    //    	int[] arr = {4, 2, -3, 1, 6};
    //         boolean found = false;
            
		// for(int i=0; i<arr.length; i++) {
		// 	int sum = 0;
		// 	for(int j =i; j<arr.length; j++) {
		// 		sum += arr[j];
    //        if(sum == 0) {
    //            found = true;
		// 	break;
		// }
		// 	}
		// }
	  // 	if(found){
		// 		    System.out.println("yes");
		// 		}
		// 		else {
		// 		    System.out.println("No");
		// 		}

//..................Subarray with given Maximum Sum...................
//    .................Brute Force Approach...................
	// int arr[] = {1, 2, -1, 3};
	//     int maxSum = Integer.MIN_VALUE;
	    
	//     for(int i =0; i<arr.length; i++){
	//       int sum =0;
	//         for(int j = i; j<arr.length; j++){
	            
	//             sum = sum + arr[j];
	            
	//           maxSum =  Math.max(maxSum, sum);
	//         }
	        
	//     }
	//     System.out.println(maxSum);

//..................Subarray with given Maximum Sum...................
	// int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	// 	int maxSum = arr[0];
	// 	int current = arr[0];
		
	// 	for(int i = 1; i < arr.length; i++){
	// 	   current =  Math.max(arr[i] , current + arr[i]);
	// 	   maxSum = Math.max(maxSum , current);
	// 	}
	// 	System.out.println(maxSum);

  //  ........................Find the Length of the Longest Subarray with Sum = K
  // int arr[] = {1, 2, 3, 1, 1, 1, 1};
	// 	int k = 3;
	// 	int maxLen = 0;
		
	// 	for(int i=0; i<arr.length; i++){
	// 	    int sum = 0;
		    
	// 	    for(int j =i; j<arr.length; j++){
	// 	        sum = sum + arr[i];
		        
	// 	        if(sum == k){
	// 	       maxLen = Math.max(maxLen, j-i + 1);
	// 	    }
	// 	    }
	// 	}
  //        System.out.println(maxLen);

// .................Count subarrays with given sum K...................
  	// 	int arr[] = {1, 1, 1};
		// int k = 2;
		// int count = 0;
		
		// for(int i=0; i<arr.length; i++){
		//     int sum = 0;
		    
		//   for(int j = i; j<arr.length; j++){
		//       sum += arr[j];
		//        if(sum == k){
		//           count++;
		//   }
		//   }
		 
		// }
	   
	  //  System.out.println(count);


    ...........// Check if there is a subarray with sum = 0
    //  int[] arr = {1, 2, 2, -1, 1, 1, 1};
	  // int max =0;
	  // boolean Existz = false;
	  // for(int i=0; i<=arr.length; i++){
	  //     int sum =0;
	  //     for(int j =i; j<arr.length; j++){
	  //         sum+= arr[j];
	  //        if(sum == 0){
	  //           Existz = true;
	             
	  //        }
	  //     }
	  // }
	  // if(Existz){
	  //     System.out.println("exist");
	  // }
	  // else {
	  //     System.out.println("not exist");
	  // }

// ...........Find the length of the Longest Subarray with sum = 0
    	// int arr[] = {1, -1, 3, 2, -2, -3, 3};
	    //  int k = 0;
	    //  int maxLen = 0;
	     
	    //  for(int i=0; i<arr.length; i++){
	    //        int sum = 0;
	    //    for(int j = i; j<arr.length; j++){
	    //        sum += arr[j];
	           
	    //        if(sum == k){
	    //        maxLen = Math.max(maxLen, j - i + 1);
	    //    }
	    //    }
	        
	    //  }
	      
	    //    System.out.println(maxLen);

// ................Count subarrays with sum divisible by K...................
    //   	int arr[] = {2, 4, 1, 3, 5};
		// int count = 0;
		// int k = 3;
		// for(int i=0; i<arr.length; i++){
		//     int sum = 0;
		//     for(int j =i; j<arr.length; j++){
		//         sum += arr[j];
		//           if(sum % k == 0){
		//             count++;
		//         }
		//     }
		  
		// }
	  //   System.out.println(count);

// .................Find the length of the smallest subarray with sum >= K..........
    // int[] arr = {2, 3, 1, 2, 4, 3};
        //  int k = 7;
        //  int minLen = Integer.MAX_VALUE;
       
        //  for(int i=0; i<arr.length; i++){
        //      int sum = 0;
        //      for(int j= i; j<arr.length; j++){
        //          sum += arr[j];
                 
        //          if(sum >= k){
        //              minLen = Math.min(minLen, j - i + 1);
        //             break;
        //          }
        //      }
        //  }
        //  if(minLen == Integer.MAX_VALUE){
        //      System.out.println(0);
        //  }
        //  else {
        //       System.out.println(minLen);
        //  }


// .............. Find the maximum product of a subarray...........
      //    int[] arr = {2, 3, -2, 4}; 
      //      int maxProduct = Integer.MIN_VALUE;
           
      //  for(int i =0; i<arr.length; i++){
      //      int product = 1;
           
      //      for(int j = i; j<arr.length; j++){
      //          product = product * arr[j];
      //        maxProduct =  Math.max(maxProduct, product);
      //      }
      //  }
      //  System.out.println(maxProduct);


//.......Find the number that appears once, and other numbers twice.
// int arr[] = {4,2,1,2,1};
//     //   Output: 2
//    int result = 0;
//    for(int i=0; i<arr.length; i++){
//        result = result^arr[i];
//    }
//    System.out.println(result);


// ..........Count the number of subarrays with equal number of 0's and 1's........

// int[] arr = {0, 1, 0, 1, 1, 1, 0};
//           int count = 0;
//           for(int i=0; i<arr.length; i++){
//               int onces = 0;
//               int zeros = 0;
              
//               for(int j =i; j<arr.length; j++){
//                   if(arr[j] == 0){
//                       zeros++;
//                   }
//                   else {
//                       onces++;
//                   }
//                    if(onces == zeros){
//               count++;
//           }
//               }  
//           }
//           System.out.println(count);

        // ...............MEDIUM QUESTION?.....................
// 		................................ 2 sum ...........................
//  int arr[] = {2, 7, 11, 15};
//  int target = 9;
//  for(int i=0; i<arr.length; i++){
//      for(int j=i+1; j<arr.length; j++){
//          if(arr[i] + arr[j] == target){
//                System.out.println(+ i + " " + j + " ");
//          }
//      }
//  }

 //...............Maximum Consecutive Ones.................
//  0
//  //   Output: 3
// int count = 0;
// int maxcount = 0;

// for(int i=0; i<arr.length; i++){
//     if(arr[i] == 1){
//         count++;
//     }
//     else {
//         maxcount = Math.max(maxcount, count);
//         count = 0;
//     }
//      maxcount = Math.max(maxcount, count);
// }
// System.out.println(maxcount);

//..................... Sort an array of 0's 1's and 2'....................
// int[] arr = {2, 0, 2, 1, 1, 0}; 
// int count0 = 0;
// int count1 = 0;
// int count2 = 0;
// for(int i=0; i<arr.length; i++){
//     if(arr[i] == 0){
//         count0++; //    2
//     }
//     else if(arr[i] == 1){
//         count1++;   //  2
//     }
//     else {
//         count2++;   //  2
//     }
// }
//   int index = 0;
// while(count0 > 0){
//     arr[index] = 0;
//     index++;
//     count0--;
// }
// while(count1 > 0){
//     arr[index] = 1;
//     index++;
//     count1--;
// }
// while(count2 > 0){
//     arr[index] = 2;
//     index++;
//     count2--;
// }
// System.out.println(Arrays.toString(arr));



//.....................Count subarrays with given sum....................
    // int arr[] = {1,2,3};
    // int target = 3;
    // int count = 0;
    
    // for(int i=0; i<arr.length; i++){
    //     	int sum = 0;
    //     for(int j =i; j<arr.length; j++){
    //         sum = sum + arr[j];
    //         if(sum == target){
    //             count++;
    //         }
    //     }
    // }
    // System.out.println(count);


//..................Leaders in an Array problem...................
    // int arr[] = {16, 17, 4, 3, 5, 2}; 
    // int n = arr.length;
    // int leader = arr[n-1];
    
    //         System.out.println(leader);
          
    // for(int i = n-2; i >= 0; i--){
    //     if(arr[i] > leader){
    //         System.out.println(arr[i]);
    //         leader = arr[i];
    //     }
    // }



//   .....................Stock Buy And Sells..................
// int arr[] = {7, 1, 5, 3, 6, 4}; 
// int maxprofit = 0;
// int minfar = arr[0]; // 5

// for(int i=0; i<arr.length; i++){

//     minfar = Math.min(minfar, arr[i]);
//       int profit = arr[i] - minfar;
//       maxprofit = Math.max(maxprofit, profit);
// }

// System.out.println(maxprofit);


   //...................... sum of upper and lower triangles...........
        //  int mat[][] = {{1, 2, 3},
        //             {4, 5, 6},
        //             {7, 8, 9}};

        //  int upper = 0;
        //  int lower = 0;
                    
        //  for(int i=0; i<mat.length; i++){
        //      for(int j =0; j<mat.length; j++){
        //          if(i <= j){
        //            upper = upper + mat[i][j];
        //          }
        //           if(i >= j){
        //              lower = lower + mat[i][j];
        //          }
        //      }
        //  }    
        //  System.out.println("Upper " + upper);
        //  System.out.println("Lower " + lower);

  //...................... find transpose matrinx.................
      //  int mat[][] = {{1, 2, 3},
      //               {4, 5, 6},
      //               {7, 8, 9}};
        
      //   for(int i=0; i<mat.length; i++){
      //       for(int j =i + 1; j<mat.length; j++){
      //           int temp = mat[i][j];
      //           mat[i][j] = mat[j][i];
      //           mat[j][i] = temp;
      //       }
      //   }
        
      //   for(int i=0; i<mat.length; i++){
      //       for(int j =0; j<mat.length; j++){
      //           System.out.print(mat[i][j] + " ");
      //       }
      //       System.out.println();
      //   }


 //.....................90 degree rotation clockwise...............
    //  int mat[][] = {{1, 2, 3},
    //                 {4, 5, 6},
    //                 {7, 8, 9}};
        

    //     //   .. ...........transpose..................
    //     for(int i=0; i<mat.length; i++){
    //         for(int j =i + 1; j<mat.length; j++){
    //             int temp = mat[i][j];
    //             mat[i][j] = mat[j][i];
    //             mat[j][i] = temp;
    //         }
    //     }
        
    //     //   .. ...........reverse each row..................
    //   for(int i=0; i<mat.length; i++){
    //       int left = 0;
    //       int right = mat.length-1;
    //        while(left < right){
    //            int temp = mat[i][left];
    //            mat[i][left] = mat[i][right];
    //            mat[i][right] = temp;
    //            left++;
    //            right--;
    //        }
    //   }
      //   .. ...........print..................
      // for(int i=0; i<mat.length; i++){
      //     for(int j = 0; j<mat.length; j++){
      //         System.out.print(mat[i][j] + " ");
      //     }
      //     System.out.println();
      // }

//.....................set of metrix zeros.........................

  // int mat[][] = {{1, 1, 1},
  //                   {1, 0, 1},
  //                   {1, 1, 1}};
        
  //     int row = mat.length;
  //     int coloums = mat[0].length;
      
  //     boolean [] rowzero = new boolean[row];
  //     boolean [] colzero = new boolean[coloums];
  //   //   ....Traversing element where is Zero..
  //     for(int i=0; i<row; i++){
  //         for(int j=0; j<coloums; j++){
  //             if(mat[i][j] == 0){
  //                 rowzero[i] = true;
  //                 colzero[j] = true;
  //             }
  //         }
  //     }
  //   //   ...set zero to entire row...
  //            for(int i=0; i<row; i++){
  //                if(rowzero[i]){
  //                    for(int j =0; j<coloums; j++){
  //                        mat[i][j] = 0;
  //                    }
  //                }
  //            }
  //   // ......set zero to entire coloums... 
  //            for(int j=0; j<coloums; j++){
  //                if(colzero[j]){
  //                    for(int i=0; i<row; i++){
  //                        mat[i][j] = 0;
  //                    }
  //                }
  //            }
 
  //   //  ......print element....
  //     for(int i=0; i<row; i++){
  //         for(int j =0; j<coloums; j++){
  //             System.out.print(mat[i][j] + " ");
  //         }
  //         System.out.println();
  //     }
//........................multiply matrix....................... 
    
// int[][] mat1 = {{1, 2, 3},
// {4, 5, 6}};

// int[][] mat2 = {{7, 8},
// {9, 10},
// {11, 12}};

// int row1 = mat1.length;
// int col1 = mat1[0].length;
// int col2 = mat2[0].length;

// int [][] result = new int[row1][col2]; 

// for(int i=0; i<row1; i++){
// for(int j=0; j<col2; j++){
// int sum = 0;
// for(int k=0; k<col1; k++){
// sum = sum + mat1[i][k] * mat2[k][j];
// }
// result[i][j] = sum;
// }
// }
           
// for(int i=0; i<row1; i++){
// for(int j=0; j<col2; j++){
// System.out.print(result[i][j]+ " ");
// }
// System.out.println();
// }


//........................... Spiral Matrix.......................... 
//  int[][] mat = {
//   {1, 2, 3, 4},
//   {5, 6, 7, 8},
//   {9, 10, 11, 12},
//   {13, 14, 15, 16}};
// List<Integer> result = new ArrayList<>();

// int top  =  0;       
// int left = 0;
// int right = mat[0].length-1;
// int bottom = mat.length-1;

// while(top <= bottom && left <= right){
// for(int i=left; i<=right; i++){
// result.add(mat[top][i]);
// }
// top++;

// for(int i=top; i<=bottom; i++){
// result.add(mat[i][right]);
// }
// right--;
// if(top <= bottom){
// for(int i=right; i>=left; i--){
// result.add(mat[bottom][i]);
// }
// }
// bottom--;

// if(left <= right){
// for(int i=bottom; i>=top; i--){
// result.add(mat[i][left]);
// }
// }
// left++;
// }


// System.out.println(result);


// import java.util.ArrayList;
// import java.util.List;
// public class Main
// {
//....................  pascel trinanglee....................
// 	public static void main(String[] args) {
//        List<List<Integer>> result = new ArrayList<>();
//        int n =5;
//        for(int i=0; i<n; i++){
       
//        List<Integer> row = new ArrayList<>();
   
//        for(int j=0; j<=i; j++){
//            if(j == 0 || j == i){
//                row.add(1);
//            }
//            else {
//                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
//            }
//        }
//        result.add(row);
//        }
   
//       for (List<Integer> row : result) {
//             System.out.println(row); 
//         }
// 	}

// }
    // ..............Find the duplicate element of an integer in the array...................	
    // HashMap<Integer, Integer> hs = new HashMap<>();
    // int arr[] = {2, 2, 1,1, 2, 2,3,5,3};
       
    //     for(int num : arr){
    //         hs.put(num, hs.getOrDefault(num, 0) + 1);
    //     }
    //     boolean findDupplicate = false;
    //     for(int key: hs.keySet()){
    //         if( hs.get(key) > 1){
    //             System.out.println(key);
    //             findDupplicate = true;
    //         }
    //     }
    //     if(!findDupplicate){
    //         System.out.println("koi ni h duplicate");
    //     }

// .......................program to put all negative..................
// .......................numbers before positive numbers..........
    // ArrayList<Integer> list = new ArrayList<>();
    //  int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
    //  int j = 0;
       
    //    for(int i=0; i<arr.length; i++){
    //        if(arr[i] < 0){
    //            int temp = arr[i];
    //            arr[i] = arr[j];
    //            arr[j] = temp;
    //            j++;
    //        }
    //    }
    //   for(int i=0; i<arr.length; i++){
    //       list.add(arr[i]);
    //   }  
    //   System.out.println(list);

// ..............................ALL SUBARRAYS QUESTIONS..................
    // ............find All the subarrays of an array............
      //    int[] arr = {2, 3, 2, 4}; 
       
      //  for(int i=0; i<arr.length; i++){
      //     for(int j =i; j<arr.length; j++){
      //     for(int k =i; k<= j; k++){
      //         System.out.print(arr[k] + " ");
      //     }
      //     System.out.println();
      //     }
      //  }

      // ....................Subarray with given sum = 0...................
    //    	int[] arr = {4, 2, -3, 1, 6};
    //         boolean found = false;
            
		// for(int i=0; i<arr.length; i++) {
		// 	int sum = 0;
		// 	for(int j =i; j<arr.length; j++) {
		// 		sum += arr[j];
    //        if(sum == 0) {
    //            found = true;
		// 	break;
		// }
		// 	}
		// }
	  // 	if(found){
		// 		    System.out.println("yes");
		// 		}
		// 		else {
		// 		    System.out.println("No");
		// 		}

//..................Subarray with given Maximum Sum...................
//    .................Brute Force Approach...................
	// int arr[] = {1, 2, -1, 3};
	//     int maxSum = Integer.MIN_VALUE;
	    
	//     for(int i =0; i<arr.length; i++){
	//       int sum =0;
	//         for(int j = i; j<arr.length; j++){
	            
	//             sum = sum + arr[j];
	            
	//           maxSum =  Math.max(maxSum, sum);
	//         }
	        
	//     }
	//     System.out.println(maxSum);

//..................Subarray with given Maximum Sum...................
	// int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	// 	int maxSum = arr[0];
	// 	int current = arr[0];
		
	// 	for(int i = 1; i < arr.length; i++){
	// 	   current =  Math.max(arr[i] , current + arr[i]);
	// 	   maxSum = Math.max(maxSum , current);
	// 	}
	// 	System.out.println(maxSum);

  //  ........................Find the Length of the Longest Subarray with Sum = K
  // int arr[] = {1, 2, 3, 1, 1, 1, 1};
	// 	int k = 3;
	// 	int maxLen = 0;
		
	// 	for(int i=0; i<arr.length; i++){
	// 	    int sum = 0;
		    
	// 	    for(int j =i; j<arr.length; j++){
	// 	        sum = sum + arr[i];
		        
	// 	        if(sum == k){
	// 	       maxLen = Math.max(maxLen, j-i + 1);
	// 	    }
	// 	    }
	// 	}
  //        System.out.println(maxLen);

// .................Count subarrays with given sum K...................
  	// 	int arr[] = {1, 1, 1};
		// int k = 2;
		// int count = 0;
		
		// for(int i=0; i<arr.length; i++){
		//     int sum = 0;
		    
		//   for(int j = i; j<arr.length; j++){
		//       sum += arr[j];
		//        if(sum == k){
		//           count++;
		//   }
		//   }
		 
		// }
	   
	  //  System.out.println(count);

// ...........Find the length of the Longest Subarray with sum = 0
    	// int arr[] = {1, -1, 3, 2, -2, -3, 3};
	    //  int k = 0;
	    //  int maxLen = 0;
	     
	    //  for(int i=0; i<arr.length; i++){
	    //        int sum = 0;
	    //    for(int j = i; j<arr.length; j++){
	    //        sum += arr[j];
	           
	    //        if(sum == k){
	    //        maxLen = Math.max(maxLen, j - i + 1);
	    //    }
	    //    }
	        
	    //  }
	      
	    //    System.out.println(maxLen);

// ................Count subarrays with sum divisible by K...................
    //   	int arr[] = {2, 4, 1, 3, 5};
		// int count = 0;
		// int k = 3;
		// for(int i=0; i<arr.length; i++){
		//     int sum = 0;
		//     for(int j =i; j<arr.length; j++){
		//         sum += arr[j];
		//           if(sum % k == 0){
		//             count++;
		//         }
		//     }
		  
		// }
	  //   System.out.println(count);

// .................Find the length of the smallest subarray with sum >= K..........
    // int[] arr = {2, 3, 1, 2, 4, 3};
        //  int k = 7;
        //  int minLen = Integer.MAX_VALUE;
       
        //  for(int i=0; i<arr.length; i++){
        //      int sum = 0;
        //      for(int j= i; j<arr.length; j++){
        //          sum += arr[j];
                 
        //          if(sum >= k){
        //              minLen = Math.min(minLen, j - i + 1);
        //             break;
        //          }
        //      }
        //  }
        //  if(minLen == Integer.MAX_VALUE){
        //      System.out.println(0);
        //  }
        //  else {
        //       System.out.println(minLen);
        //  }


// .............. Find the maximum product of a subarray...........
      //    int[] arr = {2, 3, -2, 4}; 
      //      int maxProduct = Integer.MIN_VALUE;
           
      //  for(int i =0; i<arr.length; i++){
      //      int product = 1;
           
      //      for(int j = i; j<arr.length; j++){
      //          product = product * arr[j];
      //        maxProduct =  Math.max(maxProduct, product);
      //      }
      //  }
      //  System.out.println(maxProduct);


//.......Find the number that appears once, and other numbers twice.
// int arr[] = {4,2,1,2,1};
//     //   Output: 2
//    int result = 0;
//    for(int i=0; i<arr.length; i++){
//        result = result^arr[i];
//    }
//    System.out.println(result);


// ..........Count the number of subarrays with equal number of 0's and 1's........

// int[] arr = {0, 1, 0, 1, 1, 1, 0};
//           int count = 0;
//           for(int i=0; i<arr.length; i++){
//               int onces = 0;
//               int zeros = 0;
              
//               for(int j =i; j<arr.length; j++){
//                   if(arr[j] == 0){
//                       zeros++;
//                   }
//                   else {
//                       onces++;
//                   }
//                    if(onces == zeros){
//               count++;
//           }
//               }  
//           }
//           System.out.println(count);

        // ...............MEDIUM QUESTION?.....................
// 		................................ 2 sum ...........................
//  int arr[] = {2, 7, 11, 15};
//  int target = 9;
//  for(int i=0; i<arr.length; i++){
//      for(int j=i+1; j<arr.length; j++){
//          if(arr[i] + arr[j] == target){
//                System.out.println(+ i + " " + j + " ");
//          }
//      }
//  }

 //...............Maximum Consecutive Ones.................
//  int arr[] = {1, 1, 0,1, 1, 1, 1};
//  //   Output: 3
// int count = 0;
// int maxcount = 0;

// for(int i=0; i<arr.length; i++){
//     if(arr[i] == 1){
//         count++;
//     }
//     else {
//         maxcount = Math.max(maxcount, count);
//         count = 0;
//     }
//      maxcount = Math.max(maxcount, count);
// }
// System.out.println(maxcount);

//..................... Sort an array of 0's 1's and 2'....................
// int[] arr = {2, 0, 2, 1, 1, 0}; 
// int count0 = 0;
// int count1 = 0;
// int count2 = 0;
// for(int i=0; i<arr.length; i++){
//     if(arr[i] == 0){
//         count0++; //    2
//     }
//     else if(arr[i] == 1){
//         count1++;   //  2
//     }
//     else {
//         count2++;   //  2
//     }
// }
//   int index = 0;
// while(count0 > 0){
//     arr[index] = 0;
//     index++;
//     count0--;
// }
// while(count1 > 0){
//     arr[index] = 1;
//     index++;
//     count1--;
// }
// while(count2 > 0){
//     arr[index] = 2;
//     index++;
//     count2--;
// }
// System.out.println(Arrays.toString(arr));



//.....................Count subarrays with given sum....................
    // int arr[] = {1,2,3};
    // int target = 3;
    // int count = 0;
    
    // for(int i=0; i<arr.length; i++){
    //     	int sum = 0;
    //     for(int j =i; j<arr.length; j++){
    //         sum = sum + arr[j];
    //         if(sum == target){
    //             count++;
    //         }
    //     }
    // }
    // System.out.println(count);


//..................Leaders in an Array problem...................
    // int arr[] = {16, 17, 4, 3, 5, 2}; 
    // int n = arr.length;
    // int leader = arr[n-1];
    
    //         System.out.println(leader);
          
    // for(int i = n-2; i >= 0; i--){
    //     if(arr[i] > leader){
    //         System.out.println(arr[i]);
    //         leader = arr[i];
    //     }
    // }



//   .....................Stock Buy And Sells..................
// int arr[] = {7, 1, 5, 3, 6, 4}; 
// int maxprofit = 0;
// int minfar = arr[0]; // 5

// for(int i=0; i<arr.length; i++){

//     minfar = Math.min(minfar, arr[i]);
//       int profit = arr[i] - minfar;
//       maxprofit = Math.max(maxprofit, profit);
// }

// System.out.println(maxprofit);


   //...................... sum of upper and lower triangles...........
        //  int mat[][] = {{1, 2, 3},
        //             {4, 5, 6},
        //             {7, 8, 9}};

        //  int upper = 0;
        //  int lower = 0;
                    
        //  for(int i=0; i<mat.length; i++){
        //      for(int j =0; j<mat.length; j++){
        //          if(i <= j){
        //            upper = upper + mat[i][j];
        //          }
        //           if(i >= j){
        //              lower = lower + mat[i][j];
        //          }
        //      }
        //  }    
        //  System.out.println("Upper " + upper);
        //  System.out.println("Lower " + lower);

  //...................... find transpose matrinx.................
      //  int mat[][] = {{1, 2, 3},
      //               {4, 5, 6},
      //               {7, 8, 9}};
        
      //   for(int i=0; i<mat.length; i++){
      //       for(int j =i + 1; j<mat.length; j++){
      //           int temp = mat[i][j];
      //           mat[i][j] = mat[j][i];
      //           mat[j][i] = temp;
      //       }
      //   }
        
      //   for(int i=0; i<mat.length; i++){
      //       for(int j =0; j<mat.length; j++){
      //           System.out.print(mat[i][j] + " ");
      //       }
      //       System.out.println();
      //   }


 //.....................90 degree rotation clockwise...............
    //  int mat[][] = {{1, 2, 3},
    //                 {4, 5, 6},
    //                 {7, 8, 9}};
        

    //     //   .. ...........transpose..................
    //     for(int i=0; i<mat.length; i++){
    //         for(int j =i + 1; j<mat.length; j++){
    //             int temp = mat[i][j];
    //             mat[i][j] = mat[j][i];
    //             mat[j][i] = temp;
    //         }
    //     }
        
    //     //   .. ...........reverse each row..................
    //   for(int i=0; i<mat.length; i++){
    //       int left = 0;
    //       int right = mat.length-1;
    //        while(left < right){
    //            int temp = mat[i][left];
    //            mat[i][left] = mat[i][right];
    //            mat[i][right] = temp;
    //            left++;
    //            right--;
    //        }
    //   }
      //   .. ...........print..................
      // for(int i=0; i<mat.length; i++){
      //     for(int j = 0; j<mat.length; j++){
      //         System.out.print(mat[i][j] + " ");
      //     }
      //     System.out.println();
      // }

//.....................set of metrix zeros.........................

  // int mat[][] = {{1, 1, 1},
  //                   {1, 0, 1},
  //                   {1, 1, 1}};
        
  //     int row = mat.length;
  //     int coloums = mat[0].length;
      
  //     boolean [] rowzero = new boolean[row];
  //     boolean [] colzero = new boolean[coloums];
  //   //   ....Traversing element where is Zero..
  //     for(int i=0; i<row; i++){
  //         for(int j=0; j<coloums; j++){
  //             if(mat[i][j] == 0){
  //                 rowzero[i] = true;
  //                 colzero[j] = true;
  //             }
  //         }
  //     }
  //   //   ...set zero to entire row...
  //            for(int i=0; i<row; i++){
  //                if(rowzero[i]){
  //                    for(int j =0; j<coloums; j++){
  //                        mat[i][j] = 0;
  //                    }
  //                }
  //            }
  //   // ......set zero to entire coloums... 
  //            for(int j=0; j<coloums; j++){
  //                if(colzero[j]){
  //                    for(int i=0; i<row; i++){
  //                        mat[i][j] = 0;
  //                    }
  //                }
  //            }
 
  //   //  ......print element....
  //     for(int i=0; i<row; i++){
  //         for(int j =0; j<coloums; j++){
  //             System.out.print(mat[i][j] + " ");
  //         }
  //         System.out.println();
  //     }
//........................multiply matrix....................... 
    
// int[][] mat1 = {{1, 2, 3},
// {4, 5, 6}};

// int[][] mat2 = {{7, 8},
// {9, 10},
// {11, 12}};

// int row1 = mat1.length;
// int col1 = mat1[0].length;
// int col2 = mat2[0].length;

// int [][] result = new int[row1][col2]; 

// for(int i=0; i<row1; i++){
// for(int j=0; j<col2; j++){
// int sum = 0;
// for(int k=0; k<col1; k++){
// sum = sum + mat1[i][k] * mat2[k][j];
// }
// result[i][j] = sum;
// }
// }
           
// for(int i=0; i<row1; i++){
// for(int j=0; j<col2; j++){
// System.out.print(result[i][j]+ " ");
// }
// System.out.println();
// }


//........................... Spiral Matrix.......................... 
//  int[][] mat = {
//   {1, 2, 3, 4},
//   {5, 6, 7, 8},
//   {9, 10, 11, 12},
//   {13, 14, 15, 16}};
// List<Integer> result = new ArrayList<>();

// int top  =  0;       
// int left = 0;
// int right = mat[0].length-1;
// int bottom = mat.length-1;

// while(top <= bottom && left <= right){
// for(int i=left; i<=right; i++){
// result.add(mat[top][i]);
// }
// top++;

// for(int i=top; i<=bottom; i++){
// result.add(mat[i][right]);
// }
// right--;
// if(top <= bottom){
// for(int i=right; i>=left; i--){
// result.add(mat[bottom][i]);
// }
// }
// bottom--;

// if(left <= right){
// for(int i=bottom; i>=top; i--){
// result.add(mat[i][left]);
// }
// }
// left++;
// }


// System.out.println(result);


// import java.util.ArrayList;
// import java.util.List;
// public class Main
// {
//....................  pascel trinanglee....................
// 	public static void main(String[] args) {
//        List<List<Integer>> result = new ArrayList<>();
//        int n =5;
//        for(int i=0; i<n; i++){
       
//        List<Integer> row = new ArrayList<>();
   
//        for(int j=0; j<=i; j++){
//            if(j == 0 || j == i){
//                row.add(1);
//            }
//            else {
//                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
//            }
//        }
//        result.add(row);
//        }
   
//       for (List<Integer> row : result) {
//             System.out.println(row); 
//         }
// 	}

// }






