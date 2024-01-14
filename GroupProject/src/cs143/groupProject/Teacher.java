package cs143.groupProject;
/**


 * @author Hunter Lindhorst


 *1/13/2024


 *CS 143 


 */


public class Instructor extends Person


{


 //Hunter Lindhorst 1/13/2024


 // local Variables


 private String instructorName;


 private int instructorIdNum;


 private int instructorSalary;


 


 //Hunter Lindhorst 1/13/2024


 // Instructors Getters


 public String getInstructorName() 


 {


 return instructorName;


 }


 public int getInstuctorIdNum() 


 {


 return instructorIdNum;


 }


 public int getInstuctorSalary() 


 {


 return instructorSalary;


 }


 


 //Hunter Lindhorst 1/13/2024


 //Instructor Setters


 public void setInstructorName(String userInstructorName) 


 {


 instructorName = userInstructorName;


 }


 public void setInstuctorIdNum(int userInstuctorIdNum) 


 {


 instructorIdNum = userInstuctorIdNum;


 }


 public void setInstuctorSalary(int userInstuctorSalary) 


 {


 instructorSalary = userInstuctorSalary;


 }


 


 //Hunter Lindhorst 1/13/2024


 // Info Printer


 public void printInstructorInfo()


 {


 System.out.println("Name: " + instructorName);


 System.out.println("Type: Instructor");


 System.out.println("Instructor Number: " + instructorIdNum);


 System.out.println("Instructor Salary: " + instructorSalary);


 }


}


 


//Hunter Lindhorst 1/14/2023


//Override PrintInfo Method (Replaces printInstructorInfo if we have a print info in the person class)


@Override


public void printInfo()


{


 System.out.println("Name: " + instructorName);


 System.out.println("Type: Instructor");


 System.out.println("Instructor Number: " + instructorIdNum);


 System.out.println("Instructor Salary: " + instructorSalary);


}


 


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
