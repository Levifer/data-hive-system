package be.dhs.client.ui.main.panel;

import static java.awt.BorderLayout.WEST;
import static java.awt.Color.BLACK;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import be.dhs.client.api.IPresenter;
import be.dhs.client.ui.main.tree.TreeNavigationPanel;
import be.dhs.flavour.music.Artist;

public class MainPanel extends JPanel implements ClientPanel {
	
	private IPresenter mainPresenter;
	
	public MainPanel(IPresenter mainPresenter) {
		this.mainPresenter = mainPresenter;
		setDefaultSettings();	loadUIComponents();
	}
	
	@Override
	public void setDefaultSettings() {
		setBackground(BLACK);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(200,200));
	}
	
	@Override
	public void loadUIComponents() {
		List<Artist> artists = new ArrayList<Artist>();
		for(int i = 0; i < mainPresenter.getArtistCount(); i++) {
			artists.add(new Artist());
		}
		TreeNavigationPanel treeNavigationpanel = new TreeNavigationPanel();
		treeNavigationpanel.loadCreators(artists);
		add(treeNavigationpanel, WEST);
	}
}
