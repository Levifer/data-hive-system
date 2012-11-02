package be.dhs.client.ui.main.panel;

import static be.dhs.client.ui.main.panel.Panels.MAINPANEL;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MainContainer extends JPanel {
	
	private CardLayout cards = new CardLayout();
	
	public MainContainer() {
		this.setLayout(cards);
	}
	
	public void gotoHome() {
		setActiveCard(MAINPANEL);
	}
	
	public void setActiveCard(Panels panel) {
		cards.show(this, panel.getName());
	}
}
