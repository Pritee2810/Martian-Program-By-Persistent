package generalUtilityMethod;

public class Clone implements Cloneable{
	int emp_id;
	String name;
	int salary;
	String dept;
	
	public Clone(int emp_id, String name, int salary, String dept) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Amit", 20000, "sales");
		//try {
			//Employee e2 =(Employee) e1.clone();       //error (check once)
			//System.out.println(e2.emp_id+ " "+ e2.name+ " "+e2.salary);
		//}catch(CloneNotSupportedException e) {
			//e.printStackTrace();
		//}
	}
}
