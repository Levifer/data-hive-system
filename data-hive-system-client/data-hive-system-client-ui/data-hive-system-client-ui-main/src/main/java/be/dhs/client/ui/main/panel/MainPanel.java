package be.dhs.client.ui.main.panel;

import static be.dhs.client.ui.main.detail.DetailPanels.AlbumDetailPanel;
import static be.dhs.client.ui.main.detail.DetailPanels.ArtistDetailPanel;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.WEST;
import static java.awt.Color.BLACK;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import be.dhs.client.api.IPresenter;
import be.dhs.client.ui.main.detail.DetailContainer;
import be.dhs.client.ui.main.detail.DetailPanels;
import be.dhs.client.ui.main.tree.TreeNavigationPanel;
import be.dhs.client.ui.main.tree.node.ArtistNavigationNode;
import be.dhs.flavour.music.Artist;

public class MainPanel extends JPanel implements ClientPanel {
	
	private IPresenter mainPresenter;
	private DetailContainer detailContainer;
	
	public MainPanel(IPresenter mainPresenter) {
		this.mainPresenter = mainPresenter;
		setDefaultSettings();	loadUIComponents();
	}
	
	@Override
	public void setDefaultSettings() {
		setBackground(Color.YELLOW);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(200,200));
	}
	
	@Override
	public void loadUIComponents() {
		loadTreeNavigationWidget();

		createNavigationDetails();
	}
	private void loadTreeNavigationWidget() {
		List<Artist> artists = new ArrayList<Artist>();
		for(int i = 0; i < mainPresenter.getArtistCount(); i++) {
			Artist artist = new Artist("TESTNAME");
			//artist.addAlbum(album)
			artists.add(artist);
		}
		TreeNavigationPanel treeNavigationpanel = new TreeNavigationPanel();
		treeNavigationpanel.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
			
			@Override
			public void valueChanged(TreeSelectionEvent e) {					
				TreePath path = e.getPath();
				parseSelectionPath(path);
			}
		});
		
		treeNavigationpanel.loadCreators(artists);
		add(treeNavigationpanel, WEST);
	}

	private void createNavigationDetails() {
		detailContainer = new DetailContainer();
		add(detailContainer, BorderLayout.CENTER);
		
	}

	protected void parseSelectionPath(TreePath path) {
		if(path.getPathCount() > 0) {
			
		}
		if(path.getPathCount() > 1) {
			ArtistNavigationNode artistNode = (ArtistNavigationNode)path.getPathComponent(1);
			detailContainer.setActiveCard(ArtistDetailPanel);
			//System.out.println(artistNode.getCreator().getName());
		}
		if(path.getPathCount()>2){
			detailContainer.setActiveCard(AlbumDetailPanel);

		}
		if(path.getPathCount()>2){
			detailContainer.setActiveCard(DetailPanels.SongDetailPanel);

		}
	}
}
