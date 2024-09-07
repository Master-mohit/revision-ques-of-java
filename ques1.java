
public class ques1 {
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
          }
         }
         

      

