package be.dhs.client.ui.main.detail;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import be.dhs.client.ui.main.panel.ClientPanel;

public class ArtistDetailPanel extends JPanel implements ClientPanel{

	
	public ArtistDetailPanel (){
		setDefaultSettings();	
		loadUIComponents();
	}

	@Override
	public void setDefaultSettings() {
		this.setBackground(Color.RED);	
		setLayout(new BorderLayout());
		//setPreferredSize(new Dimension(200,200));
	}

	@Override
	public void loadUIComponents() {
		// TODO Auto-generated method stub
		
	}
}
