package employee;

public enum PositionEnum {
	director(1, "이사"), general_manager(2, "부장"), manager(3, "과장"), assistant_manager(4, "대리"), position(5, "사원");

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
