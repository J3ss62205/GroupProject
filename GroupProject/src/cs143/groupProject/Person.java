package cs143.groupProject;

// cs143 - Java 2
//Jessica Henry
// 1/14/23

public class Person {
	
	private String name;
	
	public Person() {
		name = "This person does not have a name";
	}//This is the constructor for if we do not get a name
	
	public Person(String Name) {
		name = Name;
	}//This is the constructor for if we do get a name
	
	public void setName(String newName) {
		name = newName;
	}//This is the setter
	
	public String getName(){
		return name;
	}//This is the getter
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Type: Person");
	}//This is the print method in the Person class
}
