package employee;

public class FullTimeEmp extends Employee {
	// 필드 선언
	private	PositionEnum position;
	private int grade;

	public FullTimeEmp() {
		super();
	}

	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade) {
		super(id,name,department);
		this.position = position;
		this.grade = grade;

	}

	public void print() {
		System.out.print(super.toString());
		System.out.println(">> position: " + position.getMessage());
		System.out.println(">> grade: " + grade);
	}
}
