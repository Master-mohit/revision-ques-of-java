// .......Class.....
class car{
    String color;
    String model;
    
//........Constructor.... 
    car(String color, String model){
        this.color = color; // this.col. refer to the class
        this.model = model; // = ke bad vala refer to the constructor parameter
    }
    
//..........Method.... 
    void drive(){ // void means return kuch ni krta....
        System.out.println(color + " " + model + " is driving ");
    }
    void stop(){
        System.out.println("stop the car");
    }
    
}

public class Main
{
	public static void main(String[] args) {
		
// ..........Object.....
		car c = new car("red", "honda");

// .........mettod is calling on object.....
		c.drive();
		
		c.stop();
	
		
	}
}

// ..............................OVERLOADING................................

class calculator{
    int add(int a , int b){
        return a + b;
    }
//    this is overloading.....
    int add(int a , int b , int c){
        return a + b + c;
    }
    
    String add(String name, int age){
        return name + " " + " age is " + age;
    }
}

public class Main
{
	public static void main(String[] args) {
		calculator a = new calculator();
		System.out.println(a.add(5 , 5));
		
		System.out.println(a.add(1 , 2 , 3));
		
		System.out.println(a.add("mohit", 21));
	}
}

// .........................OVERRIDING................................

// ...Parent class....
class Animal{
    void sound(){
        System.out.println("animal makes a sound");
    }
}

// ...Child class....
class Dog extends Animal{
    void sound(){
        System.out.println("Dogs bark...");
    }
}

// ....also Child class....
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meoms..");
    }
}

public class Main
{
	public static void main(String[] args) {
	    Animal an = new Animal();  
	     an.sound();
// dog object but refrence animal......  
	    Animal d = new Dog();
	    d.sound();
	    
	   Animal c = new Cat();
	    c.sound();
	
	}
}


// ..........................overriding with pass parameter......................
// ...Parent class....
class Animal{
    void sound(String Animalllllll){
        System.out.println(Animalllllll + " makes a sound");
    }
}

// ...Child class....
class Dog extends Animal{
    void sound(String Animalllllll){
        System.out.println(Animalllllll + " bark...");
    }
}

// ....also Child class....
class Cat extends Animal{
    void sound(String Animalllllll){
        System.out.println(Animalllllll + " meoms..");
    }
}


public class Main
{
	public static void main(String[] args) {
	    Animal an = new Animal();  
	     an.sound("General animal");
	 
// dog object but refrence animal......  
	    Animal d = new Dog();
	    d.sound("dogg");
	    
	   Animal c = new Cat();
	    c.sound("catt");
	
	}
}


// ...................................INHERITANCE without constructor..............................

// .....parent class....
class animal{
    void eat(){
        System.out.println("eatiing...");
    }
}
// .......child class...
class dog extends animal{
   
}

public class Main
{
	public static void main(String[] args) {
// .......child class ke object ke through parent class ke method ko inherit kr skte h
		dog an = new dog();
		an.eat();
		
	}
}


// ...............................INHERITANCE with constructor.................

class animal{
    String name;
    int age;
    
    animal(String name , int age){
        this.name = name;
        this.age = age;
    }
    
    void eat(){
        System.out.println(name + " is eating... ");
    }
    
}

class Dog extends animal{
    Dog(String name, int age){
        super(name, age);   //call to parent class constructor using super keyword
    }
}

public class Main
{
	public static void main(String[] args) {
	    Dog an = new Dog("bull dog", 10);
	    an.eat();

	}
}


// ...............................INHERITANCE with constructor.................

// class animal{
//     String name;
//     int age;
    
//     animal(String name , int age){
//         this.name = name;
//         this.age = age;
//     }
    
//     void sleep(){
//         System.out.println(name + " slepping");
//     }
    
// }

// class hathi extends animal{
//     hathi(String name, int age){
//         super(name , age);
//     }
// }


// public class Main
// {
// 	public static void main(String[] args) {
// 			hathi h = new hathi("ghoda", 50);
// 		   System.out.println(h.name);
// 		   System.out.println(h.age);
// 		   h.sleep();
// 	}
// }


// ..........................Abstraction....................................

// .....Abstract class....
abstract class phone{
    
    abstract void call(); // abstract method.....
    
}

class Iphone extends phone{
     void call(){
        System.out.println("iphone se call lgaao...");
    }
}

class One_plus extends phone{
    void call(){
        System.out.println("Once plus se lga lo...");
    }
} 
public class Main
{
	public static void main(String[] args) {
	    
	    phone i = new Iphone();
	      i.call();
	      
	    phone o = new One_plus();
	     o.call();
	    
	
	}
}

