package employee;

public enum DepartmentEnum {
	GENERAL_AFFAIR(1, "�ѹ�"), PERSONNEL(2, "�λ�"), PLANNING(3, "��ȹ"), PRODUCTION(4, "����"), SALES(5, "����");

private	int code;
private	String message;

	DepartmentEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
