package be.dhs.client.ui.main.menu;

import static be.dhs.client.ui.main.menu.MenuBarBuilder.aMenuBar;
import static be.dhs.client.ui.main.menu.MenuBuilder.aMenu;
import java.util.Arrays;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBarBuilder {

	private JMenuBar menuBar;
	
	private MenuBarBuilder(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}
	
	public static JMenuBar mainMenuBar() {
		return aMenuBar().withMenu(aMenu("User").withRadioListItem("Kim")
												 .withRadioListItem("Ben")
											     .build())
											     
						 .withMenu(aMenu("Tag")
								 				 .withSubMenu(aMenu("File(s)")
								 						 .withMenuItem("Automatic")
								 						 .withMenuItem("Manual")
								 						 .build())
								 						      
								 		         .withSubMenu(aMenu("Folder(s)")
								 		        		 .withMenuItem("Automatic")
								 		        		 .withMenuItem("Manual")
								 		        		 .build())	 		        
						.build())
				.build();
												 
	}
	
	public static MenuBarBuilder aMenuBar() {
		return new MenuBarBuilder(new JMenuBar());
	}

	
	public MenuBarBuilder withMenu(JMenu menu) {
		menuBar.add(menu);
		return this;
	}

	public JMenuBar build() {
		return menuBar;
	}
}
