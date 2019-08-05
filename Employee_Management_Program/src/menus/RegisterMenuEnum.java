package menus;

public enum RegisterMenuEnum {
	Frist(11, "정규직 등록"),
	Lie(12, "임시직 등록"),
	Back(19, "돌아가기");
	
	private int code;
	private String message;
	



	RegisterMenuEnum(int code, String message) {
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
