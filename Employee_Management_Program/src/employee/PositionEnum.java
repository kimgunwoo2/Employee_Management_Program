package employee;

public enum PositionEnum {
	director(1, "�̻�"), general_manager(2, "����"), manager(3, "����"), assistant_manager(4, "�븮"), position(5, "���");

	private int code;
	private String message;

	PositionEnum(int code, String message) {
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
