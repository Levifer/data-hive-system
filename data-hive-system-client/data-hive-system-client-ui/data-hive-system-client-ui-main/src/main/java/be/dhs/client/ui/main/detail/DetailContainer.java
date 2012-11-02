package be.dhs.client.ui.main.detail;

import static be.dhs.client.ui.main.detail.DetailPanels.AlbumDetailPanel;
import static be.dhs.client.ui.main.detail.DetailPanels.ArtistDetailPanel;
import static be.dhs.client.ui.main.panel.Panels.MAINPANEL;
import static java.awt.BorderLayout.WEST;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.xml.soap.Detail;

import be.dhs.client.api.IPresenter;
import be.dhs.client.ui.main.panel.ClientPanel;
import be.dhs.client.ui.main.panel.Panels;
import be.dhs.client.ui.main.tree.TreeNavigationPanel;
import be.dhs.client.ui.main.tree.node.ArtistNavigationNode;
import be.dhs.flavour.music.Artist;

public class DetailContainer extends JPanel implements ClientPanel {

	private CardLayout cards = new CardLayout();

	public DetailContainer() {
		this.setLayout(cards);
		setDefaultSettings();
		loadUIComponents();
	}

	public void setActiveCard(DetailPanels panel) {
		cards.show(this, panel.getName());
	}	
	
	@Override
	public void loadUIComponents() {
		add(new ArtistDetailPanel(), ArtistDetailPanel.getName());
	    add(new AlbumDetailPanel(), AlbumDetailPanel.getName());
	    add(new SongDetailPanel(), DetailPanels.SongDetailPanel.getName());

	}
	
	@Override
	public void setDefaultSettings() {
		// TODO Auto-generated method stub
		
	}
}
