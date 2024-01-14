package cs143.groupProject;
import java.util.*;

public class Student extends Person{
	//Giovanni Manabat
	// member fields

	 private int studentNum;


	 private String major;


	 public String type;

	 // mutator methods

	 public void setNumber(int studentNum) {

	 this.studentNum = studentNum;

	 }
	 public void setMajor(String major) {

	 this.major = major;

	 }
	 // accessor methods 

	 public int getNumber() {

	 return studentNum;

	 }

	 public String getMajor() {

	 return major;

	 }

	 public String getType() {


	 type = "Student";

	 return type;

	 }


	 // print method

	 public void printInfo() {


	 System.out.println("-----------------------");


	 System.out.println("Name: " + getName()); // for the name, we could add a set and get method of this into Person class


	 System.out.println("Type: " + getType());


	 System.out.println("Student Number: " + studentNum);


	 System.out.println("Student Major: " + major);


	 }
	
}
