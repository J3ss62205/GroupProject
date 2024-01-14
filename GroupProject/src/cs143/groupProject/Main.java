package cs143.groupProject;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1/14/23
		//Jessica Henry
		//CS 143
		
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		
		do {

			System.out.println("Please type if you would like to add...");
			System.out.println("Intructor , Student, or a Person" );
			System.out.println("If you would like to quit then type quit");
			
			String input = scnr.next();

			//Hunter Lindhorst 1/14/2024


			//Code for main


			//Prior to this if statement prompt for class type
			 
			if(input.equals("Intructor") == true) {


				 //Create New Instructor Object


				 Instructor newInstructor = new Instructor();


				 //Get Instructor Name


				 System.out.println("Instructor Name: ");


				 newInstructor.setInstructorName(scnr.next);


				 //Get Instructor Number


				 System.out.println("Instructor Number: ");


				 newInstructor.setInstructorIdNum(scnr.next);


				 //Get Instructor Salary


				 System.out.println("Instructor Salary: ");


				 newInstructor.setInstructorSalary(scnr.next);


				 //Add instructor to array schoolRecord


				 people.add(newInstructor);


				}
			//Jessica Henry 
			//CS 143
			//1/14/23
			
			else if(input.equals("Student") == true) {

				Student s = new Student();
				
				Grad g = new Grad();
				
				UnderGrad u = new UnderGrad();
			}
			
			else if(input.equals("Person") == true) {

				System.out.println("What is the name of the person?");
				String name = scnr.next();
				Person p = new Person(name);
				//This will get the name of the person and call person
			}
			
			else if(input.equals("Print")== true) {
				for (Person arr : people) {

					 arr.printInfo();
					 }
			}//This should print off the arraylist
			
			
		}while(input.equals("quit") == false);
		 
	}

}
