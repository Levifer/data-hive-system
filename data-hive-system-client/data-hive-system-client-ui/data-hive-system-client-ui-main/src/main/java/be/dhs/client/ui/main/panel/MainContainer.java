package be.dhs.client.ui.main.panel;

import static be.dhs.client.ui.main.panel.Panels.MAINPANEL;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MainContainer extends JPanel {
	
	private CardLayout cards = new CardLayout();
	
	public MainContainer() {
		this.setLayout(cards);
		setPreferredSize(new Dimension(200,200));
		//addCard(new MainPanel(), MAINPANEL);
	}
	
	public void gotoHome() {
		setActiveCard(MAINPANEL);
	}
	
	public void setActiveCard(Panels panel) {
		cards.show(this, MAINPANEL.getName());
		this.repaint();
		this.revalidate();
	}
	
	public void addCard(JPanel panel, Panels panels) {
		cards.addLayoutComponent(panel, MAINPANEL.getName());
	}

}
