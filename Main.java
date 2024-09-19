
import java.util.Arrays;
import java.util.Scanner;


     // 1 - Sum of two integers
     public static void main(String[] args) {
 
    //     int a = 10;
    //     int b = 10;
    //     System.out.println("sum = " +(a + b));

    // 2- Print the messege along with values and sum....
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Tell me a: ");
    // int a = sc.nextInt(); // Taking input for 'a' from the user
    // System.out.println("Tell me b: ");
    // int b = sc.nextInt(); // Taking input for 'b' from the user
    // int sum = a + b;
    // System.out.println("The sum of " + a + " & " + b + " = " + sum);    
          
     // 4- Accept the User's name, age and print in following manner
	       // Ex - Hello Shery, you are 12 years old.                 
                //  Scanner sc = new Scanner(System.in);
                //  System.out.println("Type your name:");
                //  String name = sc.nextLine();
                //  System.out.println("Type your age:");
                //  int age = sc.nextInt();
                //  System.out.println("Hello " + name + ", you are " + age + " years old.");
         
                // Swaping variable with third varibale...args
                // int a = 5; 
                // int b = 10;
                // int temp = a;
                //  a = b;
                //  b = temp;
                // System.out.println(a);
                // System.out.println(b);

     // Swaping variable without third varibale
        //  Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //    int b = sc.nextInt();
       
        //    a = a + b;
        //    b = a - b;
        //    a = a - b;
        //  System.out.println(a);
        //  System.out.println(b);

        // Swaping variable without third varibale Bitwise XOR operator...
    //       Scanner sc = new Scanner(System.in);
    //    int a = sc.nextInt();
    //    int b = sc.nextInt();
    //    a = a ^ b;
    //    b = a ^ b;
    //    a = a ^ b;
    //  System.out.println(a);
    // System.out.println(b);

    // 7- the length and width of a rectangle. Calculate & print the area and perimiter. 
    //   Scanner sc = new Scanner(System.in);
    //    int l = sc.nextInt();
    //    int w = sc.nextInt();
    //    System.out.println(l * w);
    //    System.out.println(2 * (l + w));

    // 8- Accept the parameters and calculate the Compound Interest & print it on
//      STDOUT (Use Math class methods)
//   Scanner sc = new Scanner(System.in);
//         System.out.println("principle");
//         int p = sc.nextInt(); 
//        System.out.println("Rate");
//         int r = sc.nextInt(); 
//         System.out.println("Time");
//         int t = sc.nextInt();
//         System.out.println("Number of interst");
//         int n = sc.nextInt();
        
//       double amount = p * Math.pow((1 + (r / 100) / n), n * t); 
//      double compount  = amount - p;

// 10 Find surface area of sphere

    //    Scanner sc = new Scanner(System.in);
    //   System.out.println("tell me radius");
    //   double radius = sc.nextDouble(); 
    //   double ans = 4 * Math.PI * Math.pow(radius, 2);
    //   System.out.println(ans);

//     8- Accept the parameters and calculate the Compound Interest & 
//     print it on STDOUT (Use Math class methods)

//     		Scanner sc = new Scanner(System.in);
// 		System.out.println("a");
// 		double a = sc.nextInt();
// 		System.out.println("b");
// 		double b = sc.nextInt();
// 		System.out.println("c");
// 		double c = sc.nextInt();
        
//       double semipermeter = (a + b + c) / 2;
      
//       double totl = Math.sqrt(semipermeter * (semipermeter - a) * 
//       (semipermeter - b) * (semipermeter - c));
      
//    System.out.println(totl);

// Accept two numbers and print the greatest between them
// System.out.println("a");
// double a = sc.nextInt();
// System.out.println("b");
// double b = sc.nextInt();

// if (a > b){
// System.out.println("a is the greatest");
// }
// else{
//  System.out.println("b is the greatest");
// } 

// 	Accept the gender from the user as char and print the respective greeting message
//       Ex - Good Morning Sir (on the basis of gender)
// System.out.println("enter male and female who are uhhh");
         
// char gender = sc.next().charAt(0);

// if(gender == 'f' || gender == 'F'){
//     System.out.println("gud morning mam");
// }
// else if (gender == 'm' || gender == 'M'){
//     System.out.println("gud momrning sir ");
// }
// else {
//     System.out.println("ni to apna gender badl kr aa");
// }

// 15- Accept an integer and check whether it is an even number or odd.
// System.out.println("take any number");
//  int n = sc.nextInt();
//  if(n % 2 == 0){
//      System.out.println("even number");
//  }
//  else {
//      System.out.println("odd number");
//  }

// 16- Accept name and age from the user. Check if the user is a valid voter or not.
//       Vaid - Hello Shery, You are a valid voter.
//       Invalid - Sorry Shery, you can't cast the vote.
// System.out.println("tell me name");
// String name = sc.nextLine();
// System.out.println("tell me age");
// int age = sc.nextInt();
// if(age >= 18 ){
//     System.out.println("hello " + name + " you are a valid voter.");  
// }
// else {
//     System.out.println("hello " + name + " you cant cast the vote.");

// }

// 	Part 2 - Print after how many years the user will be eligible
// System.out.println("tell me name");
// String name = sc.nextLine();
// System.out.println("tell me age");
// int age = sc.nextInt();
// if(age >= 18 ){
//     System.out.println("hello " + name + " you are a valid voter.");
    
// }
// else if(age < 18){
//    int n = 18 - age;
//    System.out.println("hello " + name + n + "after year will be eligible");
// }

 // 17- Accept a day number between 1-7 and print the corresponding dayname.
//  System.out.println("tell me any number between 1 to 7");
//  int n = sc.nextInt();
 
//  if(n == 1){
//      System.out.println("Monday");
//  }
//  else if(n == 2){
//      System.out.println("tuesday");
//  }
//  else if (n ==3 ){
//      System.out.println(":wedseday");
//  }
//  else if(n == 4){
//      System.out.println("thusday");
//  }
//  else if(n == 5){
//      System.out.println("friday");
//  }
//  else if(n == 6){
//      System.out.println("Saturday");
//  }
//  else if(n == 7){
//      System.out.println("sunday");
//  }
//  else {
//      System.out.println("ni pta fir");
//  }
  
//  18- Accept three numbers and print the greatest among them 
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
// if(a > b ){
//     System.out.println("a is the greatse numbere");
// }
// else if (b > c){
//     System.out.println("b is the greatse number");
// }
// else {
//     System.out.println("c is the greatse number");
// }

            //  19- Accept a year and check if it a leap year or not 
        // System.out.println("Enter a year:");
        // int year = sc.nextInt();
        
        // // Checking if the year is a leap year
        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //     System.out.println(year + " is a leap year."); // Semicolon here
        // } else {
        //     System.out.println(year + " is not a leap year."); // Semicolon here
        // }  

          //   22- Accept an english alphabet from user and check if
    //   it is a consonent or a vowel;
    // System.out.println("check vowel or consonent");
    // char c = sc.next().charAt(0);
    
    // if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
    // c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
    //     System.out.println("this is vowel");
    // }
    // else {
    //     System.out.println("consonent");
    // }

    // 23- Accept an integer and Print hello world n times
    // System.out.println("kitni baar");
    // int n = sc.nextInt();
    //  for(int i =0; i<n; i++){
    //      System.out.println("Hello world");
    //  }

       // 24- Print natural number up to n. 
    //    int n = sc.nextInt();
    //    for(int i =0; i<=n; i++){
    //        System.out.println(i);

    // 225- Reverse for loop. Print n to 1.
	// 	Scanner sc = new Scanner(System.in);
	// 	int n = sc.nextInt();
	// 	for(int i=n; i>=1; i--){
	// 	    System.out.println(i);
	// 	}
		// }
          // 26- Take a number as input and print its table
    //   5 * 1 = 5
    //   5 * 2 = 10 ... up to 10 terms
    // System.out.println("which table uh want..");
    // int n = sc.nextInt();
    // for(int i=1; i<=10; i++){
    //     System.out.println(n + "*" + i + "=" + n*i);
    // }

    //  27- Sum up to n terms.
//     System.out.println("number ??");
//     int sum = 0;
//     int n = sc.nextInt();
//     for(int i =0; i<=n; i++){
//          sum = sum + i;
//     }
//    System.out.println(sum);

  //   28- Factor of a number
//   System.out.println("choose any number");
//   int n = sc.nextInt();
//   for(int i=1; i<=n; i++){
//       if(n % i == 0){
//            System.out.println(i);
//       }
     
//   }

    //   28- Factorial of a number
    // int fact = 1;
    //  System.out.println("choose any number...");
    //  int n = sc.nextInt();
    //  for(int i=1; i<=n; i++){
    //   fact = fact * i;
    //  System.out.println(fact);

    // 29- Print the sum of all even & odd numbers in a range seperately.
//   System.out.println("choose any number");
//   int evensum = 0;
//   int oddsum = 0;
//   int n = sc.nextInt();
//   for(int i=0; i<=n; i++){
//       if(i % 2 == 0){
//            evensum = evensum + i;   
//       }
//       else {
//            oddsum = oddsum + i;
//       }
//   }
//  System.out.println(evensum);
//  System.out.println(oddsum);

// 31- Print the sum of all factors of a number, 50 -> 1 + 2 + 5 + 10 + 25 = 43
int sum = 0;
// System.out.println("choose any number");
// int n = sc.nextInt();
// for(int i=1; i<n; i++){
//     if(n % i == 0){
//         sum = sum + i;
//     }
// }
// System.out.println(sum);

// 32- Check if the number is Prime or not.
// int count = 0;
// System.out.println("choose any number");
// int n = sc.nextInt();
// for(int i= 1; i<=n; i++){
//     if(n % i == 0){
//         count++;
// }
//   }
//          if (count == 2){
//     System.out.println("this is prime number");
// }
// else {
//    System.out.println("this is not prime number");
// }

   //     33- Write a program to take two inputs a, b & find the value of a  raised to the power of b. 
    // 	Ex - a = 2, b = 5
    // 	OP - 2^5 = 32
//      System.out.println("choose a ");
//      int a = sc.nextInt();
//         System.out.println("choose b");
//       int b = sc.nextInt();
//      int sum = (int) Math.pow(a, b);
//    System.out.println(a + "^" + b + " = " + sum);
 
// 34- Seprate each digit of a number and print it on the new line ex - 123 
// 	OP
// 		3
// 		2
// 		1
    //   System.out.println("choose any more 2 digit ");
    //    int n = sc.nextInt();
    //      while(n > 0){
    //    int ans = n % 10;
    //   System.out.println(ans);
    //     n = n / 10;
    // }

    // 35- Sum of digits of a number, 936 = 18
//    System.out.println("choose any digit");
//    int n = sc.nextInt();
//    int sum = 0;
//    while(n > 0){
//        int ans = n % 10;
//           sum = sum + ans;
//        n = n / 10;
//    }
//    System.out.println(sum);

    // 36- Accept a number and print its reverse
//      System.out.println("choose any more 2 digit");
//      int n = sc.nextInt();
//      while(n > 0){
//     int ans = n % 10;
//     System.out.print(ans);
//     n = n / 10;
// } 

// 37- Accept a number and check if it is a pallindromic number (If number and its reverse are equal)
//       Ex - 12321 - Rerverse - 12321
// System.out.println("choose number");
// int rev = 0;
// int n = sc.nextInt();
// int totl = n;
// while(n > 0){
//     int ans = n % 10;
//   rev = rev * 10 + ans;
//     n = n / 10;
// }
// if(rev == totl){
//     System.out.println("its pallindrome");
// }
// else {
//     System.out.println("its not pallindrome");
// }

// 38- Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
//       Ex- 145 = 1! + 4! + 5! = 145
// int rev = 0;
       
// int sum = 0;
//  System.out.println("choose the number");
//  int n = sc.nextInt();
//  int ndijit = n;
//  while(n > 0){
//      int ans = n % 10;
//      int fact = 1;
//      for(int i =1; i<=ans; i++){
//          fact = fact * i;
//      }
//       sum = sum + fact;
//              n = n / 10;
//  }
//  if(sum == ndijit){
//      System.out.println("its strong number");
//  }
//  else {
//      System.out.println("its not strong number");
//  }

//   40- perfect number 6 is a perfect number.
// System.out.println("choose any number");
// int sum = 0;
// int n = sc.nextInt();
// int digitn = n;
// for(int i=1; i<n; i++){
//     if(n % i == 0){
//         sum = sum + i;
//     }
// }
// if(sum == digitn){
//     System.out.println("perfect number");
// }
// else {
//     System.out.println("not perfect number");
// }

 //  41-  Fibonacci Series 0, 1, 1, 2, 3, 5, 8, 13, 21 ...
//  System.out.println("any number");
//  int n = sc.nextInt();
//  int a = 0; 
//  int b = 1;
//  for(int i=2; i<=n; i++){
//       int c = a + b;
//        System.out.println(c);
//  a = b;
//  b = c;
//  }

//46- Right Triangle - Star
// 	*
// 	* *
// 	* * *
// 	* * * *
// 	* * * * *

// System.out.println("which keyword uh have to print");
// int n = sc.nextInt();
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// 	* * * * *
// 	* * * * 
// 	* * *
// 	* * 
// 	* 
// int n = sc.nextInt();
// for(int i=1; i<=n; i++){
//     for(int j=5; j>=i; j--){
//         System.out.print("* ");
//     }
//     System.out.println();
// }
    //    }

       // 	*
// 	* *
// 	* * *
// 	* * * *
// 	* * * * * 
// 	* * * * 
// 	* * *
// 	* * 
// 	* 
//  int n = sc.nextInt();
//  for(int i =1; i<=5; i++){
//     for(int j=1; j<=i; j++){
//      System.out.print("* ");   
//     }
//     System.out.println("");
// }
//   for(int i=1; i<=5; i++){
//       for(int j =4; j>=i; j--){
//           System.out.print("* ");
//       }
//       System.out.println();
//   }

//       *
//     * *
//   * * *
// * * * *
// int n = sc.nextInt();
// for(int i =1; i<=n; i++){
//     for(int k=n-1; k>=i; k--){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

     
//       *
//      * *
//     * * *
//    * * * * 
//   * * * * * 
// for(int i=1; i<=n; i++){
//     for(int k=n-1; k>=i; k--){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

//   * * * * *
//     * * * *
//       * * *
//         * *
//           *
// int n = sc.nextInt();
// for(int i=1; i<=n; i++){
//     for(int k=1; k<=i; k++){
//         System.out.print(" ");
//     }
//     for(int j=n; j>=i; j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
// int n = sc.nextInt();
// for(int i=1; i<=n; i++){
//     for(int k=1; k<=i; k++){
//         System.out.print(" ");
//     }
//     for(int j=n; j>=i; j--){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

  //           * 
	 //      * *
    //     * * *
    //   * * * *     
    // * * * * *
    //   * * * *  
    //     * * *
    //       * *
    //         *
    
    // for(int i=1; i<=5; i++){
    //     for(int k=5-1; k>=i; k--){
    //         System.out.print(" ");
    //     }
    //     for(int j =1; j<=i+1; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=1; i<=5; i++){
    //     for(int k=1; k<=i; k++){
    //         System.out.print(" ");
    //     }
    //     for(int j = 5; j>=i; j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

     
//    *
//     *
//      *
//       *
//        *	
// for(int i=1; i<=5; i++){
//     for(int j =1; j<=i; j++){
//         System.out.print(" ");
//     }
//     System.out.println("*");
// }


	// *
    //*
   //*
  //*
 //*	
//  for (int i = 1; i <= 5; i++) {
         
//     for (int j = 5; j > i; j--) {
//         System.out.print(" ");
//     }
    
//     System.out.println("*");
// }

//  A
// 	A B
// 	A B C
// 	A B C D
// 	A B C D E  
	   
// for(int i =1; i<=5; i++){
//     for(int j =1; j<=i; j++){
//         System.out.print((char) (j+64)+ " ");
//     }
//     System.out.println();
// }

//  A
// 	B B
// 	C C C
// 	D D D D
// 	E E E E E  
	   
// for(int i =1; i<=5; i++){
//     for(int j =1; j<=i; j++){
//         System.out.print((char) (i+64)+ " ");
//     }
//     System.out.println();
// }
//           }
      
//  1
// 	1 2
// 	1 2 3
// 	1 2 3 4
// 	1 2 3 4 5  
	   
// for(int i =1; i<=5; i++){
//     for(int j =1; j<=i; j++){
//         System.out.print(j + " ");
//     }
//     System.out.println();
// }
    
//  1
// 	2 2
// 	3 3 3
// 	4 4 4 4
// 	5 5 5 5 5  
	   
// for(int i =1; i<=5; i++){
//     for(int j =1; j<=i; j++){
//         System.out.print(i + " ");
//     }
//     System.out.println();
// }

// *     *
//  *   *
//   * *
//    *
//   * *
//  *   *
// *     *
// int n = 5;  // Size of the pattern     
// for (int i = 0; i < n; i++) {  // Loop for rows
//     for (int j = 0; j < n; j++) {  // Loop for columns
//         if (j == i || j == n - i - 1) {
//             System.out.print("*");  // Print '*' for the diagonals
//         } else {
//             System.out.print(" ");  // Print space for non-diagonal positions
//         }
//     }
//     System.out.println();  // Move to the next line after each row
// }   

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
      // decending order means chote se bda..
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

// .......................program to put all negative..................
// .......................numbers before positive numbers..........
// int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
// int j = 0;
// for(int i=0; i<arr.length; i++){
//     if(arr[i] < 0){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//        j++;
//     }
// }
// for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i] + " ");
// }

  //..................Subarray with given Sum...................
  // int[] arr = {1, 2, 3, 7, 5};
  // int sum = 12;
  // int current = 0;
  // int start = 0;
  // for(int i=0; i<arr.length; i++){
  //    current = current + arr[i];
 
  // while(current > sum && start <= i){
  //     current = current - arr[start];
  //     start++;
  // }
  // if(current == sum){
  //    System.out.println("Subarray found from index " + (start+1) + " to " + (i + 1));
  // }
  // }

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

    //.......Find the number that appears once, and other numbers twice.
    // int arr[] = {4,2,1,2,1};
    //     //   Output: 2
    //    int result = 0;
    //    for(int i=0; i<arr.length; i++){
    //        result = result^arr[i];
    //    }
    //    System.out.println(result);
  

    // ..........Longest subarray with given sum K(positives)..........
  //         int[] arr = {1, 2, 3, 4, 5}; // Input array
  //         int K = 9; // Desired sum
  
  //         int start = 0; // Start of the window
  //         int currSum = 0; // Current sum of the window
  //         int maxLength = 0; // Length of the longest subarray
  
  //         // Iterate through the array with the 'end' pointer
  //         for (int end = 0; end < arr.length; end++) {
  //             // Add the current element to the current sum
  //             currSum += arr[end];
  
  //             // Shrink the window from the start if the current sum exceeds K
  //             while (currSum > K && start <= end) {
  //                 currSum -= arr[start];
  //                 start++;
  //             }
  
  //             // Check if the current sum equals K and update maxLength
  //             if (currSum == K) {
  //                 maxLength = Math.max(maxLength, end - start + 1);
  //             }
  //         }
  
  //         System.out.println("Length of the longest subarray with sum " + K + " is: " + maxLength);
  //     }
  // }

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


//.................... Majority Element (>n/2 times).....................
// int[] arr = {2, 2, 1, 1, 1, 1, 1, 2, 2}; 
// int count = 0;
// int candidate = -1; //take no which is not present giving array
//  for(int i=0; i<arr.length; i++){
//      if(count == 0){
//          candidate = arr[i];
//      }
//      if(arr[i] == candidate){
//          count++;
//      }
//      else {
//          count--;
//      }
//  }
//  count = 0;
//  for(int i=0; i<arr.length; i++){
//      if(arr[i] == candidate){
//          count++;
//      }
//  }
 
//  if(count > arr.length/2){
//      System.out.println("MAjority element = " + candidate);
//  }
    //  }


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


     //....................Longest Consecutive Sequence..................
		// int arr[] = {1,2,100,4,300,5}; 
		// int maxlength = 1;
		// int currlength = 1;
		
	  //   Arrays.sort(arr);
		// for(int i=1; i<arr.length; i++){
		//     if(arr[i] == arr[i-1] + 1){
		//         currlength++;
		//     }
		//     else{
		//         currlength = 1;
		//     }
		    
		//     maxlength = Math.max(maxlength, currlength);
		// }
		// maxlength = Math.max(maxlength, currlength);
		// System.out.println(maxlength);


    //..................Leaders in an Array problem...................
		// int arr[] = {16, 17, 4, 3, 5, 2}; 
		// int n = arr.length;
	  //   int leader = arr[n-1];
	    
	  //           System.out.println(leader);
	          
    //     for(int i = n-2; i >= 0; i--){
    //         if(arr[i] > leader){
    //             System.out.println(arr[i]);
    //             leader = arr[i];
    //         }
    //     }


  //.........Rearrange the array in alternating positive and
  //....................negative items.................
  // int arr[] = {-4, -17, 4, 3, 5, -2 ,10}; 
  // List<Integer> positive = new ArrayList<>();
  //   List<Integer> negative = new ArrayList<>();
  //   for(int num: arr){
  //      if(num >= 0){
  //          positive.add(num);
  //      }
  //      else {
  //          negative.add(num);
  //      }
  //   }
  //   int posiveidx =0;
  //   int negaidx =0;
  //   int i=0;
    
  //   while(posiveidx < positive.size() && negaidx < negative.size()){
  //       if(i % 2 == 0){
  //           arr[i] = positive.get(posiveidx);
  //           posiveidx++;
  //       }
  //       else {
  //          arr[i] = negative.get(negaidx);
  //          negaidx++;
  //       }
  //       i++;
  //   }
  //   for(int num: arr){
  //       System.out.print(num + " ");
  //   }


  		
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