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

class add{
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
		add a = new add();
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