package employee;

import java.util.Scanner;

import utils.Utils;

public class EmployeeSet {
	final int MAX_SIZE = 100; // 배열 길이
	Employee[] Emp;
	int number; // 등록된 직원에 대한 인원 수

	public EmployeeSet() {
		Emp = new Employee[MAX_SIZE];
		number = 0;
	}

	public void RegisterFullTimeEmp(Scanner s) {
		System.out.println(">>> 정규직 등록 <<<");

		int id = Utils.getID(s);
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		PositionEnum position = Utils.getPosition(s);
		int grade = Utils.getGrade(s);

		Emp[number] = new FullTimeEmp(id, name, department, position, grade);
		number++;
	}

	public void RegisterPartTimeEmp(Scanner s) {
		System.out.println(">>> 임시직 등록 <<<");

		int id = Utils.getID(s);
		String name = Utils.getName(s);
		DepartmentEnum department = Utils.getDepartment(s);
		int hours = Utils.getHours(s);

		Emp[number] = new PartTimeEmp(id, name, department, hours);
		number++;
	}

	public void SearchAll() {
		for (int n = 0; n < number; n++) {
			Emp[n].print();
		}

	}

	public void SearchFull() {
		for (int n = 0; n < number; n++) {
			if(Emp[n] instanceof FullTimeEmp)
			Emp[n].print();
		}
	}

	public void SearchPart() {
		for (int n = 0; n < number; n++) {
			if(Emp[n] instanceof PartTimeEmp)
			Emp[n].print();
		}
	}	
	public int SearchNamenum(Scanner s) {
		String name;
		int n,count=-1;
		System.out.println("검색할 이름을 입력하세요");
		name=Utils.getName(s);
		for (n = 0; n < number; n++) {
			if(Emp[n].name.equals(name)){
				Emp[n].print();
				count=n;
			}
		}
		if(count==-1)
			System.out.println("찾는아이디 없습니다.");
		return count;
	}
	public void update(Scanner s){
		int n,id;
		System.out.println("갱신할 직원의 id 확인을 위해 직원 이름을 검색합니다.");
		n=SearchNamenum(s);
		if(n!=-1){
			System.out.println("갱신할 id를 입력하세요.");
			id=Utils.getID(s);
		for (n = 0; n < number; n++) {
			if(Emp[n].id==id){
				System.out.println("갱신할 정보를 입력하세요");
				Emp[n].settername(Utils.getName(s));
				Emp[n].setterdepartment(Utils.getDepartment(s));
				if(Emp[n] instanceof FullTimeEmp){
					PositionEnum position = Utils.getPosition(s);
					int grade = Utils.getGrade(s);
					Emp[n] = new FullTimeEmp(Emp[n].getterid(), Emp[n].gettername(), Emp[n].getterdepartment(), position, grade);
				}else if(Emp[n] instanceof PartTimeEmp){
					int hours = Utils.getHours(s);
					Emp[n] = new PartTimeEmp(Emp[n].getterid(), Emp[n].gettername(), Emp[n].getterdepartment(), hours);
				}
				System.out.println("=====갱신결과=====");
				Emp[n].print();
			}
		}
	}
	}
}
