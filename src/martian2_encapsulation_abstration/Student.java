package martian2_encapsulation_abstration;

public class Student {			//encapsulation

	private String name;
	private int age;
	private String address;
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
		Student John = new Student("John", 54, "California");
		
		System.out.println(John.getName());
		System.out.println(John.getAge());
		System.out.println(John.getAddress());
	}
}

