package be.dhs.client.ui.main.detail;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import be.dhs.client.ui.main.panel.ClientPanel;

public class SongDetailPanel extends JPanel implements ClientPanel {


	public SongDetailPanel (){
		setDefaultSettings();	
		loadUIComponents();
	}

	@Override
	public void setDefaultSettings() {
		this.setBackground(Color.BLUE);	
		setLayout(new BorderLayout());
		//setPreferredSize(new Dimension(200,200));
	}

	@Override
	public void loadUIComponents() {
		// TODO Auto-generated method stub
		
	}
}
