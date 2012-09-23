package be.dhs.client.ui.main.menu;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuBuilder {

	private JMenu menu;
	private ButtonGroup group;

	private MenuBuilder(JMenu menu) {
		this.menu = menu;
	}

	public static MenuBuilder aMenu(String name) {
		return new MenuBuilder(new JMenu(name));
	}

	public MenuBuilder withMenuItem(String name) {
		JMenuItem menuItem = new JMenuItem(name);
		menu.add(menuItem);
		return this;
	}
	
	public MenuBuilder withRadioListItem(String name) {
		if(group == null) {
			group = new ButtonGroup();
		}
		JRadioButtonMenuItem item = new JRadioButtonMenuItem(name);
		group.add(item);
		menu.add(item);
		return this;
	}
	
	public MenuBuilder withSubMenu(JMenu subMenu) {
		menu.add(subMenu);
		return this;
	}
	
	public JMenu build() {
		return menu;
	}

}
