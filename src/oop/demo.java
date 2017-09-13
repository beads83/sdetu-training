package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	 void eat() {
		 System.out.println(email);
		 
	 }
	
	 void sleep() {
		 System.out.println(name + " is sleeping");
		 
	}
}

public class demo {

	public static void main(String[] args) {
		//initiating an object		
		Person person1 = new Person();
		
		//define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7815701407";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		//initiating an object		
		Person person2 = new Person();
		
		//define some properties
		person2.name = "Sara";
		person2.email = "sara@testemail.com";
		person2.phone = "7819999999";
		
		//Abstraction
		person2.walk();
		person2.sleep();
		person2.eat();
		
		/*
		// person
		
		//Atributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7815701407";
		
		//Action, activity,behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we wanted to do this for another person
		
		//Atributes, variables, adjectives, descriptors
		String name2 = "Sara";
		String email2 = "Sara@testemail.com";
		String phone2 = "7815555555";
		
		//Action, activity,behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		
		System.out.println(name2 + " is eating");
		
		//What about binding attributes and properties together?

	}
	
	//Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}
	
}


