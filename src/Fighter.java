
public abstract class Fighter {

	private double weight;
	private int age;
	private String firstName;
	private String lastName;
	
	
	public Fighter(String firstName, String lastName, int weight, int age)
	{
	this.firstName = firstName;
	this.lastName = lastName;
	this.weight = weight;
	this.age = age;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
