package menus;

public enum UpdateMenuEnum {
	Update(31,"직원 정보 갱신 (by id)"),
	reset(39, "돌아가기");
	
	private int code;
	private String message;
	



	UpdateMenuEnum(int code, String message) {
		this.code = code;
		this.message = message;
		//System.out.println("생성자 in MainMenuEnum: " + code);
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}


}
