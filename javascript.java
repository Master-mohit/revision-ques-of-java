// 1) ..................Reverse String.................
// const str = "hello";
// const reverse = str.split("").reverse().join("");
// console.log(reverse);

// 2) .................Prime number.....................
// const n = 11;
// let count =0;
// for(let i=1; i<=n; i++){
//   if(n % i == 0){
//     count++;
//   }
// }
// if(count == 2){
//     console.log("prime number");
//   }
//   else {
//     console.log("not prime");
//   }

// 3) .................Maximum number in array................
// const arr = [1,5,3,8,4];
// const ans = Math.max(...arr);
// console.log(ans);

// 4) .................Minimum number in array................
// const arr = [1,5,3,8,4];
// const ans = Math.min(...arr);
// console.log(ans);

// 5) .................Pallindrome string....................
// const str = "abca";
// const instance = str;
// const reverse = str.split("").reverse().join("");
// if(reverse == instance){
//   console.log("pallindrome");
// }
// else {
//   console.log("not pallindrome");
// }

// 6) .................Remove duplicate value.................
// const arr = [2,3,4,4,2,6,5];
// const unique = [...new Set(arr)];
// console.log(unique);

// 7) .................Remove duplicate value..................
// const arr = [2,3,4,4,2,6,5];
// const map = new Map();
// for(const num of arr){
//   map.set(num , (map.get(num) || 0) + 1);
// }
// for(const key of map.keys()){
//   if(map.get(key) > 1){
//     console.log(key);
//   }
// }

// 8) .................compress number..................
// const arr = [2,3,4,4,2,6,5];
// const map = new Map();
// for(const num of arr){
//   map.set(num, (map.get(num) || 0) +  1);
// }
// for(const key of map.keys()){
//    console.log(key + " " + map.get(key) + ' time')
// }

// 9) .................compress String...................
// const arr = "mohitt";
// const map = new Map();
// for(const ch of arr){
//   map.set(ch, (map.get(ch) || 0) +  1);
// }
// for(const key of map.keys()){
//    console.log(key + " " + map.get(key) + ' time')
// }