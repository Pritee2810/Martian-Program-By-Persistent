package generalUtilityMethod;
//1) public boolean equals (Object object)
public class Employee {
	int emp_id;
	String name;
	int salary;
	String dept;
	
	public Employee(int emp_id, String name, int salary, String dept) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	//default equal implementation if object compares to itself will return true otherwise false
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Amit", 20000, "sales");
		Employee e2 = new Employee(10, "Amit", 20000, "sales");
		
		if(e1.equals(e2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		System.out.println();
		
		if(e1==e2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}
//	@Override
//	public boolean equals(Object obj) {
//		Employee e=(Employee)obj;
//		if(e.emp_id == this.emp_id) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
}
