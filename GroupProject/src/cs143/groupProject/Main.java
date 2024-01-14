package cs143.groupProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub





		//Hunter Lindhorst 1/14/2024


//Code for main


//Prior to this if statement prompt for class type


if(input.equals("Intructor") == true)


{


 //Create New Instructor Object


 Instructor newInstructor = new Instructor();


 //Get Instructor Name


 System.out.println("Instructor Name: ");


 newIntructor.setInstructorName(scnr.next);


 //Get Instructor Number


 System.out.println("Instructor Number: ");


 newInstructor.setInstructorIdNum(scnr.next);


 //Get Instructor Salary


 System.out.println("Instructor Salary: ");


 newInstructor.setInstructorSalary(scnr.next);


 //Add instructor to array schoolRecord


 schoolRecord.add(newInstructor);


}

	}

}
