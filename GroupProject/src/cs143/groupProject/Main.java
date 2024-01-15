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
		
		String input;
		
		
		do {

			System.out.println("Please type if you would like to add...");
			System.out.println("Instructor , Student, or a Person" );
			System.out.println("If you would like to print the people then type Print");
			System.out.println("If you would like to quit then type Quit");
			System.out.println("-----------------------");
			
			input = scnr.next();

			//Hunter Lindhorst 1/14/2024


			//Code for main


			//Prior to this if statement prompt for class type
			 
			if(input.equals("Intructor") == true) {


				 //Create New Instructor Object


				 Instructor newInstructor = new Instructor();


				 //Get Instructor Name


				 System.out.println("Instructor Name: ");
				 
				 String name = scnr.next();

				 newInstructor.setInstructorName(name);


				 //Get Instructor Number


				 System.out.println("Instructor Number: ");
				 
				 int num = scnr.nextInt();


				 newInstructor.setInstuctorIdNum(num);


				 //Get Instructor Salary


				 System.out.println("Instructor Salary: ");
				 
				 int salary = scnr.nextInt();


				 newInstructor.setInstuctorSalary(salary);


				 //Add instructor to array schoolRecord


				 people.add(newInstructor);


				}
			//Jessica Henry 
			//CS 143
			//1/14/23
			
			else if(input.equals("Student") == true) {
			//Jonathan Lee
			//CS 143
			//1/14/23				
				System.out.println("What is the type of student? (Grad or UnderGrad)")
				String studentType = scnr.next();

				if (studentType.equals("Grad")){
					Grad g = new Grad();
					System.out.println("What is the name of the student?");
					String name = scnr.next();
					g.setName(name);

					System.out.println("What is the students ID?");
					String major = scnr.next();
					g.setNumber(id);

					System.out.println("What is the student's degree?");
					String degree = scnr.next();
					g.setDegree(degree);

					people.add(g);

				} else if (studentType.equals("UnderGrad")){
					UnderGrad u = new UnderGrad();
					System.out.println("What is the name of the student?");
					String name = scnr.next();
					u.setName(name);

					System.out.println("What is the students ID?");
					String major = scnr.next();
					u.setNumber(id);

					System.out.println("What is the student's degree?");
					String degree = scnr.next();
					u.setDegree(degree);

					people.add(u);
				} else {
					System.out.println("Invalid entry. Please write 'Grad' or 'UnderGrad'." );
				
				
				
			}
			//Jessica Henry 
			//CS 143
			//1/14/23
			
			else if(input.equals("Person") == true) {

				System.out.println("What is the name of the person?");
				String name = scnr.next();
				Person p = new Person(name);
				//This will get the name of the person and call person
				
				people.add(p);
			}
			
			else if(input.equals("Print")== true) {
				for (Person arr : people) {

					 arr.printInfo();
					 }
			}//This should print off the arraylist
			
			
		}while(input.equals("Quit") == false);
		 
	}

}
