package be.dhs.client.ui.main.tree;

import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import be.dhs.flavour.music.Artist;

public class TreeNavigationModel {
	
	private DefaultMutableTreeNode parent = new DefaultMutableTreeNode();
	private DefaultTreeModel model = new DefaultTreeModel(parent);
	

	private TreeNavigationModel() {
		
	}
	
	public static TreeNavigationModel aTreeModel() {
		return new TreeNavigationModel();
	}
	
	public TreeNavigationModel withArtists(List<Artist> artists) {
		for(Artist creator : artists) {
			model.insertNodeInto(new ArtistNode(creator), parent, 0);
		}
		return this;
	}
	
	public DefaultTreeModel build() {
		return model;
	}
}
