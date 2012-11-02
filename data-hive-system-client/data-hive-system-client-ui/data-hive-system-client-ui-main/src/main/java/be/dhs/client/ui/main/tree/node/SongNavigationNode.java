package be.dhs.client.ui.main.tree.node;

import javax.swing.tree.DefaultMutableTreeNode;

import be.dhs.flavour.music.Artist;
import be.dhs.flavour.music.Song;

public class SongNavigationNode extends DefaultMutableTreeNode {

	public SongNavigationNode(Song song) {
		setUserObject(song);
	}
	
	public Song getCreator() {
		return (Song) getUserObject();
	}
}
