package employee;

public class PartTimeEmp extends Employee {
	// 필드 선언
	private int hours;

	public PartTimeEmp() {
		super();
	}

	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) {
		super(id,name,department);
		this.hours = hours;
	}

	public void print() {
		System.out.print(super.toString());
		System.out.println(">> hours: " + hours);

	}
}
