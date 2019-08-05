package employee;

abstract class Employee {
	Employee() {
	}

	Employee(int id, String name, DepartmentEnum department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String toString() {
		System.out.println("================");
		System.out.println(">> id: " + id);
		System.out.println(">> name: " + name);
		System.out.println(">> department: " + department.getMessage());
		return "";
	}

	public void setterid(int id) {
		this.id = id;
	}

	public void settername(String name) {
		this.name = name;
	}

	public void setterdepartment(DepartmentEnum department) {
		this.department = department;
	}

	public int getterid() {
		return id;
	}

	public String gettername() {
		return name;
	}

	public DepartmentEnum getterdepartment(){
		return department;
	}
	abstract public void print();

	protected int id;
	protected String name;
	protected DepartmentEnum department;
}
