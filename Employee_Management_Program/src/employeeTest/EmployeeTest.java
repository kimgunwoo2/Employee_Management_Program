package employeeTest;

import java.util.Scanner;
import employee.EmployeeSet;
import menus.Menu;
import menus.MainMenuEnum;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		EmployeeSet set = new EmployeeSet();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			MainMenuEnum mm = menu.MainMenu(scanner);
			
			if(mm == MainMenuEnum.REGISTER) {
				while(true){
				menus.RegisterMenuEnum a=menu.RegisterMenu(scanner);
				if(a==menus.RegisterMenuEnum.Frist)
					set.RegisterFullTimeEmp(scanner);
				else if(a==menus.RegisterMenuEnum.Lie)
					set.RegisterPartTimeEmp(scanner);
				else if(a==menus.RegisterMenuEnum.Back)
					break;
				}
			}
			else if(mm == MainMenuEnum.SEARCH) {
				while(true){
					menus.SearchMenuEnum b=menu.SearchMenu(scanner);
					if(b==menus.SearchMenuEnum.Search)
						set.SearchAll();
					else if(b==menus.SearchMenuEnum.FULLSearch)
						set.SearchFull();
					else if(b==menus.SearchMenuEnum.PARTSearch)
						set.SearchPart();
					else if(b==menus.SearchMenuEnum.NAMESearch)
						set.SearchNamenum(scanner);
					else if(b==menus.SearchMenuEnum.reset)
									break;
					}
			}else if(mm == MainMenuEnum.UPDATE) {
				while(true){
					menus.UpdateMenuEnum c=menu.UpdateMenu(scanner);
					if(c==menus.UpdateMenuEnum.Update)
						set.update(scanner);//°»½Å
					else if(c==menus.UpdateMenuEnum.reset)
									break;
					}
			}
			else if(mm == MainMenuEnum.EXIT) {
				System.out.print("Good BYE!");
				scanner.close();
				break;
			}
		}
		
		scanner.close();
	}
}
