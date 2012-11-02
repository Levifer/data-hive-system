package be.dhs.client.ui.main.tree.node;

import javax.swing.tree.DefaultMutableTreeNode;

import be.dhs.api.Entity;
import be.dhs.api.role.entity.Creator;
import be.dhs.flavour.music.Artist;

public class ArtistNavigationNode extends DefaultMutableTreeNode {

	public ArtistNavigationNode(Artist artist) {
		setUserObject(artist);
	}
	
	public Artist getCreator() {
		return (Artist) getUserObject();
	}
}
