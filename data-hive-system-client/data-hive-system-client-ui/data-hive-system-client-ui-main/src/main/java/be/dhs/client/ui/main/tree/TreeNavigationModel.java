package be.dhs.client.ui.main.tree;

import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

import be.dhs.client.ui.main.tree.node.AlbumNavigationNode;
import be.dhs.client.ui.main.tree.node.ArtistNavigationNode;
import be.dhs.client.ui.main.tree.node.RootNavigationNode;
import be.dhs.flavour.music.Album;
import be.dhs.flavour.music.Artist;

public class TreeNavigationModel extends DefaultTreeModel {
	
	private RootNavigationNode parent;
	
	public TreeNavigationModel(RootNavigationNode parent) {
		super(parent);
		this.parent = parent;
	}
	
	public static TreeNavigationModel aTreeModel() {
		return new TreeNavigationModel(new RootNavigationNode());
	}
	
	public TreeNavigationModel withArtists(List<Artist> artists) {
		for(Artist artist : artists) {
			ArtistNavigationNode artistNode = new ArtistNavigationNode(artist);
			insertNodeInto(artistNode, parent, 0);
			for(Album album : artist.getAlbums()) {
				insertNodeInto(new AlbumNavigationNode(album), artistNode, 1);
			}
		}
		return this;
	}
}
