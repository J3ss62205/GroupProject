package cs143.groupProject;

	public class UnderGrad extends Student{
		//Giovanni Manabat

	 // member field

	 private String level;

	 // mutator

	 public void setLevel(String level) {

	 this.level = level;

	 }
	 //allows student to reset as said in instructions(unsure if this is actually needed - level can be reset manually in main)

	 /*

	 public String resetLevel() {

	 level = "Freshman";


	 return level;


	 } 


	 */


	 


	 


	 // accessor method


	 public String getLevel() {


	 return level;


	 }


	 


	 @Override


	 public String getType() {


	 type = "Undergraduate";


	 return type;


	 }


	 


	 @Override


	 public void printInfo() {


	 super.printInfo();


	 System.out.println("Student Level: " + level);


	 }


	 


	}
