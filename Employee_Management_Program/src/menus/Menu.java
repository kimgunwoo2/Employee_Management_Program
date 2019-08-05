package menus;

import java.util.Scanner;

import utils.Utils;

public class Menu {
	public MainMenuEnum MainMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Main Menu ===");
		for(MainMenuEnum m : MainMenuEnum.values()) {
			System.out.println("  " + m.getCode() + ". " + m.getMessage());
		}

		int n;
		MainMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(MainMenuEnum m : MainMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
		}
		
		return select;
	}
	public RegisterMenuEnum RegisterMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Register Menu ===");
		for(RegisterMenuEnum n : RegisterMenuEnum.values()) {
			System.out.println("  " + n.getCode() + ". " + n.getMessage());
		}

		int n;
		RegisterMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(RegisterMenuEnum m : RegisterMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
		}
		
		return select;
	}
	public UpdateMenuEnum UpdateMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Delete Menu ===");
		for(UpdateMenuEnum n : UpdateMenuEnum.values()) {
			System.out.println("  " + n.getCode() + ". " + n.getMessage());
		}

		int n;
		UpdateMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(UpdateMenuEnum m : UpdateMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
		}
		
		return select;
	}
	public SearchMenuEnum SearchMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Search Menu ===");
		for(SearchMenuEnum n : SearchMenuEnum.values()) {
			System.out.println("  " + n.getCode() + ". " + n.getMessage());
		}

		int n;
		SearchMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(SearchMenuEnum m : SearchMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
		}
		
		return select;
	}
}
