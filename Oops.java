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

.........mettod is calling on object.....
		c.drive();
		
		c.stop();
	
		
	}
}

..............................OVERLOADING................................

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

.................................POLYMORPHISM................................
.........................OVERRIDING................................

// Parent Class
class Phone {
    void makeCall() {
        System.out.println("Making a call using a general phone.");
    }
}

// Child Class 1
class Landline extends Phone {
    @Override
    void makeCall() {
        System.out.println("Making a call using a landline (wired connection).");
    }
}

// Child Class 2
class Smartphone extends Phone {
    @Override
    void makeCall() {
        System.out.println("Making a call using a smartphone (wireless connection).");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Phone generalPhone = new Phone();
        Phone landline = new Landline();
        Phone smartphone = new Smartphone();

        generalPhone.makeCall();  // Output: Making a call using a general phone.
        landline.makeCall();      // Output: Making a call using a landline (wired connection).
        smartphone.makeCall();    // Output: Making a call using a smartphone (wireless connection).
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


...................................INHERITANCE without constructor..............................

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
.......child class ke object ke through parent class ke method ko inherit kr skte h h abhi ke liye
		dog an = new dog();
		an.eat();
		
	}
}


...............................INHERITANCE with constructor.................

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


...............................INHERITANCE with constructor.................

class animal{
    String name;
    int age;
    
    animal(String name , int age){
        this.name = name;
        this.age = age;
    }
    
    void sleep(){
        System.out.println(name + " slepping");
    }
    
}

class hathi extends animal{
    hathi(String name, int age){
        super(name , age);
    }
}


public class Main
{
	public static void main(String[] args) {
			hathi h = new hathi("ghoda", 50);
		   System.out.println(h.name);
		   System.out.println(h.age);
		   h.sleep();
	}
}


..........................Abstraction....................................

.....Abstract class....
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

.............................ENCAPSULATION..........................

class BankAccount{
    private double Balannce;
    
    public BankAccount(double Balannce){
        this.Balannce = Balannce;
    }
    
    public void deposite(double amount){
        if(amount > 0){
            Balannce += amount;
        }
        else {
            System.out.println("in valid Amount");
        }
    }
    
    public void widrow(double amount){
        if(amount > 0 && amount <= Balannce){
            Balannce -= amount;
        }
        else{
            System.out.println("insufficient amount");
        }
    }
    
    public double getbalance(){
        return Balannce;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	 BankAccount bank = new BankAccount(300);
	 bank.deposite(200);
	 System.out.println("dEPOSITE MONEY = " + bank.getbalance());
	 
	 bank.widrow(100);
	 System.out.println("Total = " + bank.getbalance());
	 
	}
}