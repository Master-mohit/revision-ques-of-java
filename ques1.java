
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

      

