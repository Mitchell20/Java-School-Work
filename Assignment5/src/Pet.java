public class Pet {
	private String name;
	private int age;
	private boolean adopted;
	static int count = -1;
	
	public Pet() {
		count += 1;
	}
	
	public Pet(String initName, int initAge) {
		name = initName;
		age = initAge;
		adopted = false;
		count += 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String initName) {
		name = initName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int initAge) {
		age = initAge++;
	}
	public String getAdopted() {
		if (adopted == true) {
		return "adopted";
		} else {
			return "not adopted";
			}
	}
	public void setAdopted() {
		adopted = true;
	}
}
