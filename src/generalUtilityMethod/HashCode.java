package generalUtilityMethod;

public class HashCode {
	int emp_id;
	String name;
	int salary;
	String dept;
	
	public HashCode(int emp_id, String name, int salary, String dept) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Amit", 20000, "sales");
			System.out.println(e1.hashCode());
	}		
}