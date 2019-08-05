package menus;

public enum UpdateMenuEnum {
	Update(31,"���� ���� ���� (by id)"),
	reset(39, "���ư���");
	
	private int code;
	private String message;
	



	UpdateMenuEnum(int code, String message) {
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
