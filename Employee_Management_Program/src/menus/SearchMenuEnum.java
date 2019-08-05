package menus;

public enum SearchMenuEnum {
		Search(21, "일괄검사"),
		FULLSearch(22,"정규직 일괄 검색"),
		PARTSearch(23,"임시직 일괄 검색"),
		NAMESearch(24,"이름 검색"),
		reset(29, "돌아가기");
		
		private int code;
		private String message;
		



		SearchMenuEnum(int code, String message) {
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
