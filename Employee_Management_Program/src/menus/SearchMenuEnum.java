package menus;

public enum SearchMenuEnum {
		Search(21, "�ϰ��˻�"),
		FULLSearch(22,"������ �ϰ� �˻�"),
		PARTSearch(23,"�ӽ��� �ϰ� �˻�"),
		NAMESearch(24,"�̸� �˻�"),
		reset(29, "���ư���");
		
		private int code;
		private String message;
		



		SearchMenuEnum(int code, String message) {
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
