package menus;

public enum RegisterMenuEnum {
	Frist(11, "������ ���"),
	Lie(12, "�ӽ��� ���"),
	Back(19, "���ư���");
	
	private int code;
	private String message;
	



	RegisterMenuEnum(int code, String message) {
		this.code = code;
		this.message = message;
		//System.out.println("������ in MainMenuEnum: " + code);
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
