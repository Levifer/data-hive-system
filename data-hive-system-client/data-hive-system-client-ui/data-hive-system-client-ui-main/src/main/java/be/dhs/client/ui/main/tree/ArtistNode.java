package be.dhs.client.ui.main.tree;

import javax.swing.tree.DefaultMutableTreeNode;

import be.dhs.api.role.entity.Creator;
import be.dhs.flavour.music.Artist;

public class ArtistNode extends DefaultMutableTreeNode {

	public ArtistNode(Artist creator) {
		setUserObject(creator);
	}
	
}
