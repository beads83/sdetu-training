package Labs;

public class Lab2 {
	
	public static void main(String[] args) {
		
		/*Create a Student Database with the following attributes:
			 New Student constructor that takes name and SSN in the arguments
			 Automatically create an email ID based on the name
			 Set a private static ID
			 Generate a user ID that is combination of Static ID, random 4-digit number between 1000
			and 9000, and last 4 of SSN
			 Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
			 Use encapsulation to set variables (phone, city, state)
		*/
	
		Student stud1 = new Student("John","Beadle","019707454");
		stud1.setPhone("781-570-1407");
		stud1.setCity("Rockland");
		stud1.setState("Massachusetts");
		//stud1.setfirstName();
		//stud1.setlastName();		
		stud1.enroll("CIS151-Java Programming Level 1");
		stud1.enroll("CIS171-Java Programming Level 2");
		System.out.println(stud1.toString());
		stud1.payTuition(999);
		
		
	}
}
	
class Student {
		private String firstName;
		private String lastName;
		private String name;
		private String sSN;
		private String phone;
		private String city;
		private String state;
		private String email;
		private static int iD = 1000;
		private String userID;
		private String courses = "";
		private static final int costOfCourse = 1000;
		private int balance ;
			
		//constructors
			
		public Student (String firstName, String lastName, String sSN) {
			iD++;
			this.name = lastName + "," + firstName;
			this.sSN = sSN;
			//setEmail();
			setID();
			email = firstName + lastName + "@newstudent.com";
			
			
		}
	
		
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		/*
		public void setEmail() {
			email = firstName + lastName + "@newstudent.com";
			
		}
		public String getEmail() {
			return email;
		}
		  */                    
		
		private void setID() {
			int max = 9000;
			int min = 1000;
			int randNum = (int) (Math.random() * (max - min));
			randNum = randNum + min;
			//System.out.println(randNum);
			userID = iD + "" +  randNum + sSN.substring(5);
			//System.out.println("Your User ID: " + userID);
		}
		
		public void enroll(String course) {
			this.courses = this.courses + "\n" + course;
			//System.out.println(courses);
			balance = balance + costOfCourse;
		}
		
		public void payTuition(int amount) {
			balance = balance - amount;
			System.out.println("Your payment of $" + amount + " has been applied and your new balance is: $" + balance);
		}
		
		public void checkBalance() {
			System.out.println("Your balance is: $" + balance);
		}
		
		public void showCourses() {
			System.out.println("You have enrolled in: " + courses);
		}
		
		public String toString() {
			return "\nName: " + name + "\nYour User ID: " + userID + "\nYour Phone#: " + phone + "\nYour City: " + city + "\nYour State: " + state + "\nYour Email: " + email + "\nCourses: " + courses +" \nBalance: $" + balance;
			
		}
}
	
	
		
		
	
