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

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// int num =1;
// for(int i=0; i<=6; i++){
// 	for(int j=1; j<=i; j++){
//  System.out.print( num + " ");
//     num++;
//     }
// 	System.out.println();
// }

// *     *
//  *   *
//   * *
//    *
//   * *
//  *   *
// *     *
// for(int i=1; i<=5; i++){
//     for(int j=1; j<=5; j++){
//         if(i == j || i+j == 5+1){
//             System.out.print("*");
//         }
//         else {
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

// *****
//    *
//   *
//  *
// *****
// 	  for(int i=1; i<=5; i++){
// 	      for(int j=1; j<=5; j++){
// 	          if(i == 1 || i == 5 || i+j == 5+1){
// 	              System.out.print("*");
// 	          }
// 	          else {
// 	              System.out.print(" ");
// 	          }
// 	      }
// 	      System.out.println();
// 	  }
