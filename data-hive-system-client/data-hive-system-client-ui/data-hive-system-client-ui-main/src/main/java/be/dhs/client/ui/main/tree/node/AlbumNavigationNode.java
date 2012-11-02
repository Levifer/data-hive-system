package be.dhs.client.ui.main.tree.node;

import javax.swing.tree.DefaultMutableTreeNode;

import be.dhs.flavour.music.Album;
import be.dhs.flavour.music.Artist;

public class AlbumNavigationNode extends DefaultMutableTreeNode {
	
	public AlbumNavigationNode(Album album) {
		setUserObject(album);
	}
	
	public Album getCreator() {
		return (Album) getUserObject();
	}

}
