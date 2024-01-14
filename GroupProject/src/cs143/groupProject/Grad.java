package cs143.groupProject;

//Giovanni Manabat
	public class Grad extends Student {

	 // member field
	 private String degree;

	 // mutator method

	 public void setDegree(String degree) {

	 this.degree = degree;

	 }

	 // accessor method

	 public String getDegree() {
	 return degree;
	 }
	 @Override
	 public String getType() {

	 type = "Graduate";
	 return type;

	 }

	 //print method


	 @Override


	 public void printInfo() {


	 super.printInfo();


	 System.out.println("Student Degree: " + degree);

	 }
	}
